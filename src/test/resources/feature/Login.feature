@LoginPage
Feature: CucumberJava

  @ValidCredentials
  Scenario: Verify if the valid username and password is entered then user should navigate to the dashboard
    Given User have open the browser
    When User opens the SwagLabs open source page
    And User enters valid username standard_user and password secret_sauce
    Then User clicks the login button
#    Then User should navigate to dashboard

#  @InvalidCredentials @requiredMessage
#  Scenario Outline: Verify that when the username and password are blank then error message should be displayed
#    Given User have open the browser
#    When User opens the OrangeHrm open source page
#    And User enters <userName> as username and <password> as password
#    And User clicks the login button
#    Then User should see Required error message1

#    Examples:
#      | userName | password    |
#      |          |             |
#      | Admin    |             |
#      |          | password123 |
