package pageobjects;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.*;

public class CheckoutPage {


    public SelenideElement enterFirstName(){
        return $x("//input[@id='first-name']");
    }
    public SelenideElement enterLastName(){
        return $x("//input[@id='last-name']");
    }
    public SelenideElement enterPostalCode(){
        return $x("//input[@id='postal-code']");
    }

    public SelenideElement continueButton(){
        return $x("//input[@value='CONTINUE']");
    }

    public SelenideElement checkoutFinishButton(){
        return $x("//a[text()='FINISH']");
    }
}
