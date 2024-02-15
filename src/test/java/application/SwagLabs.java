package application;


import java.time.Duration;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pageobjects.InventoryPage;
import pageobjects.LoginPage;


public class SwagLabs {

    // Fields to represent different pages or components of the application
    public LoginPage loginPage;
    public InventoryPage inventoryPage;



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
        inventoryPage = new InventoryPage();
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


    public void ClickSortButton() {
        inventoryPage.sortButton().should(Condition.appear,Duration.ofSeconds(25)).click();
    }

    public void ClickSortByNameDescendingButton() {
        inventoryPage.sortByNameDescendingButton().should(Condition.appear,Duration.ofSeconds(35)).click();
    }
    public void ClickAllAddToCart()  {
        inventoryPage.addAllToCart().should(Condition.appear,Duration.ofSeconds(35)).click();
    }
    public void clickCartButton() throws Exception {
        Thread.sleep(5 * 1000);
        inventoryPage.cartButton().should(Condition.appear,Duration.ofSeconds(35)).click();

    }


}
