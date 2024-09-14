import api.StudentRequests;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class SimpleTest {
    @BeforeAll
    public static void setUpTests() {
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        RestAssured.baseURI = "https://crudcrud.com/api/fcc7b6cb2ea842d29e73bd7db3cfca7e";
    }

    @Test
    public void userShouldBeAbleCreateStudent() {

        StudentRequests.createStudent("{\n" +
                "  \"name\" : \"Sasha Osipov\",\n" +
                "  \"grade\": 10\n" +
                "}");
    }

    @Test
    public void userShouldBeAbleDeteleExistingStudent() {

        // Шаг 1 -Создание Студента
        String id = StudentRequests.createStudent("{\n" +
                "  \"name\" : \"Sasha Osipov\",\n" +
                "  \"grade\": 10\n" +
                "}");


        // Шаг 2 - Удаление Студента
        StudentRequests.deleteStudent(id);

        // Шаг 3 -проверить, что студент больше не существует

        given()
                .get("/student/" + id).
                then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }
}
