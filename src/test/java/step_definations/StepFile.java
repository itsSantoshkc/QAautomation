package step_definations;



import application.SwagLabs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepFile {
    SwagLabs app;

    @Given("^User have open the browser$")
    public void openBrowser() {
        app = new SwagLabs();
        app.openBrowser();
    }
    @When("^User opens the SwagLabs$")
    public void goToSwagLabs() {
        app.goToSwagLabs();
    }

    @And("^User enters valid username (.*) and password (.*)$")
    public void enterCredential(String userName, String password) {
        app.enterCredential(userName, password);
    }
    
    @And("^User clicks the login button$")
    public void clickLoginButton() {
        app.clickLoginButton();
    }
    @And("^User clicks sort button")
    public void ClickSortButton(){
        app.ClickSortButton();
    }

    @And("^User sort item in descending order")
    public void ClickSortByNameDescendingButton() {
        app.ClickSortByNameDescendingButton();
    }

    @And("^User clicks the cart button")
    public void clickCartButton() throws Exception{
        app.clickCartButton();
    }

    @And("^User clicks all add to cart button")
    public void ClickAllAddToCart() {
        for (int i = 0; i <= 5; i++) {
            app.ClickAllAddToCart();
        }
    }
    @And("^User opens the menu")
    public void openMenu() throws Exception{
        app.clickOpenMenuButton();
    }
    @Then("^User Click the logout button")
    public void ClickLogoutButton() throws Exception {
        app.clickLogOutButton();
    }










}
