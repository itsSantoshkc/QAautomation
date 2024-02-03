package application;


import java.time.Duration;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageobjects.LoginPage;



public class SwagLabs {

    // Fields to represent different pages or components of the application
    public LoginPage loginPage;



    public static WebDriver driver;
    // Method to open the browser and initialize components
    public void openBrowser() {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/v1/index.html");
        WebDriverRunner.setWebDriver(driver);

        loginPage = new LoginPage();

    }

    public void goToSwagLabs() {
        System.out.println("Redirected!!");
    }

    public void enterCredential(String userName, String password) {
        loginPage.enterUsername().should(Condition.appear, Duration.ofSeconds(5)).sendKeys(userName);
        loginPage.enterPassword().sendKeys(password);

    }
    public void clickLoginButton() {
        loginPage.loginButton().should(Condition.appear, Duration.ofSeconds(15)).click();
    }




}
