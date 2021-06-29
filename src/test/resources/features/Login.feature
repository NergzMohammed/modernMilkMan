Feature: User should be able to login

  Background: user goes to login page
    Given the user is on the modernMilkMan home page
    Then the user clicks on "ACCEPT ALL" cookies
    And the user clicks Sign in button

  Scenario: User login with valid credentials
    When the user enters "Mobile number" as "07397320257"
    When the user enters "Password" as "Milkman!"
    And the user clicks on Login button
    Then the user verify the home page display "HI NERGZ"


  Scenario Outline: Not login with invalid credentials

    When the user enters "Mobile number" as "<Number>"
    When the user enters "Password" as "<password>"
    And the user clicks on Login button
    Then the user should see oops error message

    Examples:
      | Number          | password |
      | 22222222222293- |          |
      |                 | 02982    |
      | 07397320257     | nshdt    |
      |                 |          |
      | 8*292233838774  | Milkman! |


  Scenario: user can use forgot password functionality

    And the user should be able to click on the Forgot Password
    Then the user is redirected to another page to reset password


#  Verify the ‘Remember Me’ functionality.
#  Verify if a user is able to login with a new password only after
#  he/she has changed the password.
#  Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
#  Verify the login page and all its controls in different browsers
#  Verify the login page by pressing ‘Back button’ of the browser.
#  It should not allow you to enter into the system once you log out.
#  Verify if a user should be able to login with the same credentials
#  in different browsers at the same time.








