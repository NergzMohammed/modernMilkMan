
Feature: user should be able to update email

  Background:  the user logs in
    Given the user is on the modernMilkMan home page
    Then the user clicks on "ACCEPT ALL" cookies
    And the user clicks Sign in button
    When the user enters "Mobile number" as "07397320257"
    When the user enters "Password" as "Milkman!"
    And the user clicks on Login button
    And the user clicks on sign in button
    Then the user clicks on "My account" dropdown
    Then the user clicks on "Account details"


  Scenario: User can update the email address on their account
    When the user updates the "Email address" as "nergis.muhammad@hotmail.com"
    And the user clicks on "Save" button
    Then the user verify success! message


  Scenario Outline: User cannot update the email address on their account with invalid emails
    When the user updates the "Email address" as "<Email>"
    Then the user should see error warning

    Examples:
      | Email                         |
      | #@%^%#$@#$@#.com              |
      | Joe Smith <email@example.com> |
      | email@example@example.com     |
      | email..emailexample.com       |
      | email@exampleweb              |
