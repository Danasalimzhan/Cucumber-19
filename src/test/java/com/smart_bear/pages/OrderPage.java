package com.smart_bear.pages;

import com.smart_bear.runner.SmartRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OrderPage {
    public OrderPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#ctl00_MainContent_fmwOrder_ddlProduct")
    WebElement dropdown;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtQuantity")
    WebElement quantity;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtUnitPrice")
    WebElement price;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtDiscount")
    WebElement discount;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtTotal")
    WebElement total;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_txtName")
    WebElement name;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox2")
    WebElement address;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox3")
    WebElement city;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox4")
    WebElement state;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox5")
    WebElement zipCode;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_cardList_0")
    WebElement radioVisa;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox6")
    WebElement ccNumber;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_TextBox1")
    WebElement expirationDate;
    @FindBy(css = "#ctl00_MainContent_fmwOrder_InsertButton")
    WebElement processBtn;

    public void selectSSAndQuantity(String screenSaver, String quantity, WebDriver driver){
        BrowserUtils.BrowserUtil.selectBy(dropdown, screenSaver, "visibleText");
        BrowserUtils.BrowserUtil.sendKeys(this.quantity, quantity, driver);
    }
    public void priceAndDiscountAndTotal(String price, String discount, String total, WebDriver driver){
        BrowserUtils.BrowserUtil.sendKeys(this.price, price, driver);
        BrowserUtils.BrowserUtil.sendKeys(this.discount, discount, driver);
        BrowserUtils.BrowserUtil.sendKeys(this.total, total, driver);
    }
    public void nameAddress(String name, String address, WebDriver driver){
        BrowserUtils.BrowserUtil.sendKeys(this.name, name, driver);
        BrowserUtils.BrowserUtil.sendKeys(this.address, address, driver);
    }
    public void cityStateAndZipCode(String city, String state, String zipCode, WebDriver driver){
        BrowserUtils.BrowserUtil.sendKeys(this.city, city, driver);
        BrowserUtils.BrowserUtil.sendKeys(this.state, state, driver);
        BrowserUtils.BrowserUtil.sendKeys(this.zipCode, zipCode, driver);

    }
   /* public void checkVisaClickCCAndExp(String ccNumber, String expiration, WebDriver driver){
        this.radioVisa.click();
        BrowserUtils.BrowserUtil.sendKeys(this.ccNumber, ccNumber, driver);
        BrowserUtils.BrowserUtil.sendKeys(this.expirationDate, expiration, driver);
    }

    */
    public void clickOnProcessBtn(){
        this.processBtn.click();
    }

    public void checkVisaClickCCAndExp(String ccNumber, String expiration, WebDriver driver) {
        this.radioVisa.click();
        BrowserUtils.BrowserUtil.sendKeys(this.ccNumber, ccNumber,driver);
        BrowserUtils.BrowserUtil.sendKeys(this.expirationDate, expiration,driver);
    }
}
