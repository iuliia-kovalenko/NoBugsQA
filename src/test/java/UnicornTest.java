import api.UnicornRequests;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class UnicornTest {
    @BeforeAll
    public static void setUpTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/017bbdec41c24ac689e7e2402ad3a8f8";
    }
    @Test
    public void userShouldBeAbleCreateUnicorn() {
        UnicornRequests.createUnicorn("{\n" +
                "  \"name\" : \"Sunset shimmer\",\n" +
                "  \"tailColor\": \"pink\"\n" +
                "}");
    }

    @Test
    public void userShouldBeAbleDeleteUnicorn() {

        // Создание unicorn

        String id = UnicornRequests.createUnicorn("{\n" +
                "  \"name\" : \"Sunset shimmer\",\n" +
                "  \"tailColor\": \"black\"\n" +
                "}").get("id");


        // Удаление unicorn

        UnicornRequests.deleteUnicorn(id);

        // Проверка того, что unicorn действительно удалён

        given()
                .get("/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);

    }
    @Test
    public void userAbleToUpdateUnicorn() {
        HashMap<String, String> response = UnicornRequests.createUnicorn("{\n" +
                "  \"name\" : \"Sunset shimmer\",\n" +
                "  \"tailColor\": \"black\"\n" +
                "}");
        String id = response.get("id");
        String name = response.get("name");
        String newColor = "green";

        UnicornRequests.updateUnicornTailColor(id, name, newColor);

        given()
                .get("/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("tailColor", equalTo(newColor));

    }
}
