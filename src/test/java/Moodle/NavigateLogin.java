package Moodle;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractions;

public class NavigateLogin extends UIInteractions {
    @Step("Navigate to Moodle login page")
    public void moodleLoginPage() {
        openUrl("https://micampusvirtual.usbcali.edu.co/login/index.php");
    }
}