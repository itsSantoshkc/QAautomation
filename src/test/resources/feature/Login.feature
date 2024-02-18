@LoginPage
Feature: CucumberJava

  @Credentials
  Scenario: Verify if the valid username and password is entered then user should navigate to the dashboard
    Given User have open the browser
    When User opens the SwagLabs
    And User enters valid username standard_user and password secret_sauce
    And User clicks the login button
    And User clicks sort button
    And User sort item in descending order
    And User clicks all add to cart button
    And User clicks the cart button
    And User click the checkout button
    And User enters valid firstname Santosh , lastname Kc and postcode 44700
    And User clicks continue button
    And User finishes checkout process
    And User opens the menu
    Then User Click the logout button


  @Credentials
  Scenario: Verify if the valid username and password is entered then user should not navigate to the dashboard
    Given User have open the browser
    When User opens the SwagLabs
    And User enters valid username locked_out_user and password secret_sauce
    And User clicks the login button
