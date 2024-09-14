package api;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import org.apache.http.HttpStatus;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class UnicornRequests {
    static {
        RestAssured.defaultParser = Parser.JSON;
    }


    public static HashMap<String, String> createUnicorn(String body) {
        // Отправляем запрос и извлекаем ответ в виде HashMap
        HashMap response = given()
                .body(body)
                .contentType(ContentType.JSON)
                .post("/unicorn")
                .then()
                .assertThat()
                .statusCode(201)
                .extract()
                .body()
                .as(HashMap.class);

        // Извлекаем значения из HashMap
        String id = (String) response.get("_id");
        String tailColor = (String) response.get("tailColor");
        String name = (String) response.get("name");

        // Создаём новый HashMap для хранения нужных данных
        HashMap<String, String> result = new HashMap<>();
        result.put("name", name);
        result.put("id", id);
        result.put("tailColor", tailColor);

        return result;
    }


    public static HashMap<String, String> getUnicornById(String id) {
        // Отправляем запрос и извлекаем ответ в виде HashMap
        HashMap response = given()
                .contentType(ContentType.JSON)
                .get("/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .body()
                .as(HashMap.class);

        // Извлекаем значения из HashMap
        String tailColor = (String) response.get("tailColor");
        String name = (String) response.get("name");

        HashMap<String, String> result = new HashMap<>();
        result.put("name", name);
        result.put("tailColor", tailColor);

        return result;
    }

    public static void deleteUnicorn(String id) {
        given()
                .delete("/unicorn/" + id).
                then()
                .assertThat()
                .statusCode(200);
    }

    public static void updateUnicornTailColor(String id, String name, String newTailColor) {
        HashMap<String, String> updateBody = new HashMap<>();
        updateBody.put("name", name);
        updateBody.put("tailColor", newTailColor);


        given()
                .contentType(ContentType.JSON)
                .body(updateBody)
                .put("/unicorn/" + id)
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }
}
