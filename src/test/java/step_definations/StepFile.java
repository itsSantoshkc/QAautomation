package step_definations;



import java.util.Map;
import application.SwagLabs;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepFile {
    SwagLabs app;
//    ApiApplication api;

    @Given("^User have open the browser$")
    public void openBrowser() {
        app = new SwagLabs();
        app.openBrowser();
    }

    @When("^User opens the SwagLabs open source page$")
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


    @And("^User enters (.*) as username and (.*) as password$")
    public void enterUsernamePass(String username, String password) {
        app.enterUsernamePass(username, password);
    }

    @Then("^User should see (.*) error message1$")
    public void errorMessage1(String expectedErrorMessage) {
        app.errorMessage1(expectedErrorMessage);

    }

    @Then("^User should see (.*) error message2$")
    public void errorMessage2(String expectedErrorMessage) {
        app.errorMessage2(expectedErrorMessage);
    }

    @When("User enters valid username Admin and password admin123")
    public void User_enters_valid_username_Admin_and_password_admin() {
        // Write code here that turns the phrase above into concrete actions
    }
}
