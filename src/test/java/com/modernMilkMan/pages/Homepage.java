package com.modernMilkMan.pages;

import com.modernMilkMan.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {

    @FindBy(xpath = "//h1[.='Hi Nergz']")
    public WebElement greetingText;


    @FindBy(xpath = "//img[@src='https://themodernmilkman.co.uk/img/icons/User Account.svg']")
    public WebElement SignInBtn;


    @FindBy(xpath = "//li[.='My account']")
    public WebElement MyAccountDropDown;

    @FindBy(xpath = "//a[contains(.,' Account details')]")
    public WebElement accountDetailsElement;

    @FindBy(xpath = "//h2[.=\"Success!\"]")
    public WebElement SuccessMessage;


      @FindBy(xpath = "//p[@id='error-otp']")
      public WebElement invalidEmailError;


    public void ClickDropdowns(String DropDowns){
          String DropElements= "//li[.='"+DropDowns+"']";
          Driver.get().findElement(By.xpath(DropElements)).click();
    }


     public void AccountInfoUpdate(String information){
        String InfoDisplay= "//a[contains(.,' "+information+"')]";
        Driver.get().findElement(By.xpath(InfoDisplay)).click();
     }



}


