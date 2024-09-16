package api;

import api.models.Unicorn;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UnicornTest {
    @BeforeAll
    public static void setUpTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/41004e65807242c1a1273a9b5f393c92";
    }

    @Test
    public void userShouldBeAbleCreateUnicorn() {
        Unicorn unicorn = Unicorn.builder().name("Rainbow").tailColor("red").build();

        UnicornRequests unicornRequests = new UnicornRequests();
        unicornRequests.createUnicorn(unicorn);
    }

    @Test
    public void userShouldBeAbleDeleteUnicorn() {

        // Создание unicorn

        Unicorn unicorn = Unicorn.builder().name("Rainbow").tailColor("red").build();

        UnicornRequests unicornRequests = new UnicornRequests();
        Unicorn createdUnicorn = unicornRequests.createUnicorn(unicorn);


        // Удаление unicorn

        UnicornRequests.deleteUnicorn(createdUnicorn.getId());

        // Проверка того, что unicorn действительно удалён

        given()
                .get("/unicorn/" + unicorn.getId())
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);

    }

    @Test
    public void userAbleToUpdateUnicorn() {
        Unicorn unicorn = Unicorn.builder().name("Rainbow").tailColor("red").build();

        UnicornRequests unicornRequests = new UnicornRequests();
        Unicorn createdUnicorn = unicornRequests.createUnicorn(unicorn);
        System.out.println(createdUnicorn);

        createdUnicorn.setTailColor("black");

        unicornRequests.updateUnicornTailColor(createdUnicorn);

        given()
                .get("/unicorn/" + createdUnicorn.getId())
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("tailColor", equalTo(createdUnicorn.getTailColor()));

    }
}
