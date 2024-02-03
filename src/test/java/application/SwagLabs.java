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
//        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        // Initializing ChromeOptions
        ChromeOptions chromeOptions = new ChromeOptions();
        // Creating a ChromeDriver instance with the provided options
        driver = new ChromeDriver(chromeOptions);
        // Setting implicit wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // Maximizing the browser window

        driver.manage().window().maximize();
        // Navigating to a specific URL
        driver.navigate().to("https://www.saucedemo.com/v1/index.html");
        // Setting the WebDriver instance for use in Selenium Selenide
        WebDriverRunner.setWebDriver(driver);

        // Initializing instances of different page objects/components
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

    public void dashboardOpen() {
        Assert.assertEquals(loginPage.goToDashboard().should(Condition.appear, Duration.ofSeconds(5)).getText(), "Dashboard");
    }

    public void enterUsernamePass(String username, String password) {
        loginPage.enterUsername().should(Condition.appear, Duration.ofSeconds(5)).sendKeys(username);
        loginPage.enterPassword().sendKeys(password);
    }

    public void errorMessage1(String expectedErrorMessage) {
        try {
            Assert.assertEquals(loginPage.errorMessage1().should(Condition.appear, Duration.ofSeconds(5)).getText(), expectedErrorMessage);
        } catch (Exception ignored) {
        }
    }

    public void errorMessage2(String expectedErrorMessage) {
        try {
            Assert.assertEquals(loginPage.errorMessage2().should(Condition.appear, Duration.ofSeconds(5)).getText(), expectedErrorMessage);
        } catch (Exception ignored) {

        }
    }
}
