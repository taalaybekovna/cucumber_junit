@Regression
Feature:  Library app login feature
  User Story: As a user, I should be able to login with correct credentials to different accounts.
  and dashboard should be displayed.

  Accounts are: librarian, student, admin

  #Similar to TestNG @BeforeMethod. Background is running before each scenario
  Background: For each scenario user is on library login page
    Given user is on the library login page

  @Librarian @Employee
  Scenario: Login as an librarian
    #Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard

  @Student @Smoke
  Scenario: Login as a student
  # Given user is on the library login page
    When user enters student username
    And user enters student password
    Then user should see dashboard

 @Admin @Smoke
  Scenario: Login as an admin
   #Given user is on the library login page
    When user enters admin username
    And user enters admin password
    Then user should see dashboard

