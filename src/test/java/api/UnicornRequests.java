package api;

import api.models.Unicorn;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.mapper.ObjectMapperType;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.given;

public class UnicornRequests {
    ObjectMapper objectMapper = new ObjectMapper();

    public Unicorn createUnicorn(Unicorn unicorn) {
        String unicornJson = null;
        try {
            unicornJson = objectMapper.writeValueAsString(unicorn);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return given()
                .body(unicornJson)
                .contentType(ContentType.JSON)
                .post("/unicorn")
                .then()
                .assertThat()
                .statusCode(201)
                .extract()
                .body()
                .as(Unicorn.class, ObjectMapperType.GSON);

    }


    public Unicorn getUnicornById(String id) {

        return given()
                .contentType(ContentType.JSON)
                .get("/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .body()
                .as(Unicorn.class, ObjectMapperType.GSON);

    }

    public static void deleteUnicorn(String id) {
        given()
                .delete("/unicorn/" + id).
                then()
                .assertThat()
                .statusCode(200);
    }

    public void updateUnicornTailColor(Unicorn unicorn) {
        String unicornJson = null;
        try {
            unicornJson = objectMapper.writeValueAsString(unicorn);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        given()
                .contentType(ContentType.JSON)
                .body(unicornJson)
                .put("/unicorn/" + unicorn.getId())
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);

    }
}
