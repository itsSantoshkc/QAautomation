@LoginPage
Feature: CucumberJava

  @ValidCredentials
  Scenario: Verify if the valid username and password is entered then user should navigate to the dashboard
    Given User have open the browser
    When User opens the SwagLabs open source page
    And User enters valid username standard_user and password secret_sauce
    Then User clicks the login button

