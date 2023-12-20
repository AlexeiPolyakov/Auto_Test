package steps;
import io.qameta.allure.Step;
import models.RequestModel.*;

import java.util.Date;

import static io.restassured.RestAssured.given;

public class ApiPetSteps {
    @Step("Добаление объекта в хранилище")
    public void addObject(ObjectRequest objectRequest) {
        given()
            .body(objectRequest)
            .when()
            .post("/pet")
            .then()
                .statusCode(200).log().all();
    }
    @Step("Добавление заказа")
    public void postOrder(Integer id, Integer petId, Integer quantity, String shipDate, String status, boolean complete) {
        given()
                .body(new OrderRequest(id, petId, quantity, shipDate, status, complete))
                .when()
                .post("/store/order")
                .then()
                .statusCode(200).log().all();
    }
    @Step("Удаление заказа")
    public void deleteOrder(Integer orderId) {
        given()
                .when()
                .delete("/store/order/"+orderId)
                .then()
                .statusCode(200).log().all();
    }
    @Step("Обновление имени")
    public void putName(Integer id, String username, String firstName, String lastName, String email, String password, String phone, Integer userStatus) {
        given()
                .body(new UserRequest(id, username, firstName, lastName, email, password, phone, userStatus))
                .when()
                .put("/user/"+username)
                .then()
                .statusCode(200).log().all();
    }
    @Step("Возвращение статусов инвентаря")
    public void getStatusInventory() {
        given()
                .when()
                .get("/store/inventory")
                .then()
                .statusCode(200).log().all();
    }


}