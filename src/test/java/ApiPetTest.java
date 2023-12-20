import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Features;
import io.qameta.allure.Story;
import models.RequestModel.*;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ApiPetTest extends BaseTest {
    @Story("POST")
    @Test(testName = "Проверка добавления объекта", description = "Проверка добавления объекта")
    public void checkAddObject() {
        CategoryRequest category = new CategoryRequest(0, "string");
        ArrayList<String> photoUrls = new ArrayList<>();
        photoUrls.add("string");
        ArrayList<TagRequest> tags = new ArrayList<>();
        tags.add(new TagRequest(0, "string"));
        ObjectRequest objectRequest = new ObjectRequest(0, category, "doggie", photoUrls, tags, "available");
        API_PET_STEPS.addObject(objectRequest);
    }

    @Story("POST")
    @Test(testName = "Добавление заказа", description = "Добавление заказа")
    public void checkPostOrder() {
        API_PET_STEPS.postOrder(1, 0,0,"2023-12-20T15:15:43.267Z","placed",true);
    }

    @Story("DELETE")
    @Test(testName = "Удаление заказа", description = "Удаление заказа")
    public void checkDeleteOrder() {
        API_PET_STEPS.postOrder(1, 0,0,"2023-12-20T15:15:43.267Z","placed",true);
        API_PET_STEPS.deleteOrder(1);
    }

    @Story("PUT")
    @Test(testName = "Обновление имени", description = "Обновление имени")
    public void checkPutName() {
        API_PET_STEPS.putName(0, "string","string","string","string","string","string",0);
    }

    @Story("GET")
    @Test(testName = "Возвращение статусов инвентарей", description = "Возвращение статусов инвентарей")
    public void checkGetStatusInventory() {
        API_PET_STEPS.getStatusInventory();
    }
}
