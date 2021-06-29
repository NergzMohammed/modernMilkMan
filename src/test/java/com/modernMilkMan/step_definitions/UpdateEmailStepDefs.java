package com.modernMilkMan.step_definitions;


import com.modernMilkMan.pages.Homepage;
import com.modernMilkMan.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateEmailStepDefs {
    Homepage homepage=new Homepage();

    @When("the user clicks on sign in button")
    public void the_user_clicks_on_sign_in_button() {
        homepage.SignInBtn.click();
    }

    @Then("the user clicks on {string} dropdown")
    public void the_user_clicks_on_dropdown(String myAccount) {
        BrowserUtils.waitFor(3);
          homepage.ClickDropdowns(myAccount);
    }


    @Then("the user clicks on {string}")
    public void the_user_clicks_on(String accountDetails) {
        BrowserUtils.waitFor(2);
       homepage.AccountInfoUpdate(accountDetails);

    }


    
    @When("the user updates the {string} as {string}")
    public void the_user_updates_the_as(String string, String string2) {


    }

    @When("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user verify success! message")
    public void the_user_verify_success_message() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("the user should see error warning")
    public void the_user_should_see_error_warning() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
