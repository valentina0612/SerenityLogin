package Moodle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class SendLoginInfo extends UIInteractions {
    @Step("Enter login info")
    public void login() {
        WebElement loginButton = find(By.id("loginbtn"));
        loginButton.click();
    }
}
