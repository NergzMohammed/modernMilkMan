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

      ////a[.='Change password'] we can make a method and make this dynamic locator for three of th

      @FindBy(xpath = "//p[@id='error-otp']")
      public WebElement invalidEmailError;


    public void ClickDropdowns(String DropDowns){
          String DropElements= "//li[.='"+DropDowns+"']";
          Driver.get().findElement(By.xpath(DropElements)).click();
    }

    public void UpdateButtons(String Button){
        String UpdateBtns= "/a[.='"+Button+"']" ;
        Driver.get().findElement(By.xpath(UpdateBtns)).click();
    }


     public void AccountInfoUpdate(String information){
        String InfoDisplay= "//a[contains(.,' "+information+"')]";
        Driver.get().findElement(By.xpath(InfoDisplay)).click();
     }



    //div[@id='you_location_img']  your location icon on the map


    //label[.='Email address']//..//input  email box dynamic olarak

    //li[.='My account']//..//..//li//.. it finds 22 webelements dynamic

   //  (//li[.='Receipts']//..//..//li)[5]  10 tane dropdown buluyor 
}


