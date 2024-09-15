import api.StudentRequests;
import api.models.Student;
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
        RestAssured.baseURI = "https://crudcrud.com/api/017bbdec41c24ac689e7e2402ad3a8f8";
    }

    @Test
    public void userShouldBeAbleCreateStudent() {

        Student student = Student.builder().name("Саша Осипов").grade(3).build();

        StudentRequests studentRequests = new StudentRequests();
        studentRequests.createStudent(student);
    }

    @Test
    public void userShouldBeAbleDeteleExistingStudent() {

        // Шаг 1 -Создание Студента

        Student student = Student.builder().name("Саша Осипов").grade(3).build();
        StudentRequests studentRequests = new StudentRequests();
        Student createdStudent = studentRequests.createStudent(student);

        // Шаг 2 - Удаление Студента
        studentRequests.deleteStudent(createdStudent.getId());

        // Шаг 3 -проверить, что студент больше не существует

        given()
                .get("/student/" + createdStudent.getId()).
                then()
                .assertThat()
                .statusCode(HttpStatus.SC_NOT_FOUND);
    }
}
