package com.modernMilkMan.pages;
import com.modernMilkMan.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage{



       @FindBy(id= "phoneNo")
        public WebElement mobileNumBox;


        @FindBy(id = "password")
        public WebElement passwordBox;

        @FindBy(id= "checkLogin")
        public WebElement loginButton;

        @FindBy(css = "#password-error")
        public WebElement LoginErrorMessage;

        @FindBy(xpath = "//a[.='Forgot Password?']")
        public WebElement ForgotPasswordBtn;

         @FindBy(css = "#resetPassword")
         public WebElement resetPasswordBtn;
        

        //  method to login
        //It is dynamic and accepts both parameters mobile number& password

    public void loginBoxes(String mobileNo, String password){
            String dynamicLocators ="//label[.='"+mobileNo+"']//..//input";
        Driver.get().findElement(By.xpath(dynamicLocators)).sendKeys(password);

    }







    }
