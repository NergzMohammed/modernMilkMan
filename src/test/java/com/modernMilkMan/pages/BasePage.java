package com.modernMilkMan.pages;

import com.modernMilkMan.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(xpath = "//img[@*=\"btn-signin signindesktop\"]")
    public WebElement signInButton;

    @FindBy(xpath = "//div[@id='cookiescript_accept']")
    public WebElement acceptAllCookies ;

    @FindBy(xpath = "//div[@id='cookiescript_reject']")
    public WebElement declineCookies ;

}