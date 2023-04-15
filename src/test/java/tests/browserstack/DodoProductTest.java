package tests.browserstack;

import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.TestBase;

import static com.codeborne.selenide.Selenide.*;
import static io.appium.java_client.AppiumBy.id;
import static io.qameta.allure.Allure.step;


@Tag("browserstack")
public class DodoProductTest extends TestBase {
    @DisplayName("Checking text in due order")
    @Test
    @Owner("toytronic")
    void checkButtonLogIn() {

        step("Click on Combo button", () -> {
            $(id("ru.dodopizza.app:id/Комбо")).click();
        });

    }
}
