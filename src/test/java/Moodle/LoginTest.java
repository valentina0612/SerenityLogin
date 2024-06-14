package Moodle;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest {
    @Managed(driver = "chrome")
    WebDriver driver;

    NavigateLogin navigate;
    SendPassword password;
    SendUsername username;
    SendLoginInfo login;

    @Test
    void positiveLoginTest() {
        navigate.moodleLoginPage();
        username.loginUsername("username Moodle");
        password.loginPassword("password Moodle");
        login.login();

        String currentUrl = driver.getCurrentUrl();

        Serenity.reportThat("The current URL is the expected one",
                () -> assertThat(currentUrl).isEqualTo("https://micampusvirtual.usbcali.edu.co/my/courses.php"));
    }

    @Test
    void negativeLoginTest() {
        navigate.moodleLoginPage();
        username.loginUsername("username");
        password.loginPassword("password");
        login.login();

        String currentUrl = driver.getCurrentUrl();

        Serenity.reportThat("The current URL is the expected one",
                () -> assertThat(currentUrl).isEqualTo("https://micampusvirtual.usbcali.edu.co/login/index.php"));

    }

}
