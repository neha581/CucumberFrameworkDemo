Feature: Login Feature

Scenario: Successful login with valid credentials
    Given User is on Login Page
    When User enters valid username and password
    Then User is navigated to the Home Page
