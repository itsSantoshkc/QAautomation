package step_definations;



import java.util.Map;
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

    @Then("^User clicks the login button$")
    public void clickLoginButton() {
        app.clickLoginButton();
    }





}
