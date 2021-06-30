package com.modernMilkMan.step_definitions;

import com.modernMilkMan.pages.Homepage;
import com.modernMilkMan.pages.LoginPage;
import com.modernMilkMan.utilities.BrowserUtils;
import com.modernMilkMan.utilities.ConfigurationReader;
import com.modernMilkMan.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();


    @Given("the user is on the modernMilkMan home page")
    public void the_user_is_on_the_modernMilkMan_home_page() {

        String websiteUrl = ConfigurationReader.get("url");
        Driver.get().get(websiteUrl);

    }

    @Given("the user clicks Sign in button")
    public void the_user_clicks_Sign_in_button() {
        BrowserUtils.waitFor(2);
        loginPage.signInButton.click();
    }


    @When("the user enters {string} as {string}")
    public void the_user_enters_as(String phoneNum, String password) {
        BrowserUtils.waitFor(3);
        loginPage.loginBoxes(phoneNum, password);

    }

    @When("the user clicks on Login button")
    public void the_user_clicks_on_Login_button() throws InterruptedException {
        Thread.sleep(3);
        loginPage.loginButton.click();
    }


    @Then("the user clicks on {string} cookies")
    public void the_user_clicks_on_cookies(String cookies) {
        BrowserUtils.waitFor(3);
        if (cookies.equals("ACCEPT ALL"))
            loginPage.acceptAllCookies.click();
        else
            loginPage.declineCookies.click();

    }

    @Then("the user verify the home page display {string}")
    public void the_user_verify_the_home_page_display(String hiMessage) {
        Homepage homepage = new Homepage();

        assertEquals(hiMessage, homepage.greetingText.getText());
    }


    @Then("the user should see oops error message")
    //the method is used when the user enters invalid phone number or password

    public void the_user_should_see_oops_error_message() {

        assertTrue(loginPage.LoginErrorMessage.isDisplayed());

    }


    @Given("the user should be able to click on the Forgot Password")
    public void the_user_should_be_able_to_click_on_the_Forgot_Password() {
        loginPage.ForgotPasswordBtn.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user is redirected to another page to reset password")
    public void the_user_is_redirected_to_another_page_to_reset_password() {

        assertTrue(loginPage.resetPasswordBtn.isDisplayed());


    }



}
