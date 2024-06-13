package Moodle;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class SendPassword extends UIInteractions {

    @Step("Enter password")
    public void loginPassword(String password) {
        WebElement passwordField = find(By.id("password"));
        passwordField.sendKeys(password);
    }
}