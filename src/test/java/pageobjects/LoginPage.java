package pageobjects;

import com.codeborne.selenide.SelenideElement;
import java.util.List;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {


    public SelenideElement enterUsername() {
        return $x("//input[@placeholder='Username']");
    }

    public SelenideElement enterPassword() {
        return $x("//input[@placeholder='Password']");
    }

    public SelenideElement loginButton() {
        return $x("//input[@id='login-button']");
    }


    public SelenideElement errorMessage1() {
        return $x("//span[text()='Required']");
    }
    public SelenideElement errorMessage2() {
        return $x("//p[text()='Invalid credentials']");
    }
}
