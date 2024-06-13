package Moodle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class SendUsername extends UIInteractions {
    @Step("Enter username")
    public void loginUsername(String user) {
        WebElement usernameField = find(By.id("username"));
        usernameField.sendKeys(user);
    }
}
