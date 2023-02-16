Feature: User should be able to login with correct credentials

  Background:
    Given user is in web table login page

  @wip
  Scenario: Web table login scenario
    When user enters username "Test"
    And user enters password "Tester"
    And user click login button
    Then user should see url contains orders

  @wip2
  Scenario: positive login scenario
    When user enters username "Test" , password "Tester" and login
    Then user should see url contains orders

  @wip3
  Scenario: map data table practice
    When user enters below credentials
      | username | Test   |
      | password | Tester |
