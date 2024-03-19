package com.sauce_labs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class HomeMainPage {
    public HomeMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//div[@class='header_label']")
    WebElement header;
    @FindBy(xpath = "//span[.='Products']")
    WebElement headerOnLeftBar;
    @FindBy(css = "select[class='product_sort_container']")
    WebElement dropdown;

    public String getHeader(){
        return BrowserUtils.BrowserUtil.getText(header);
    }
    public String getHeaderOnLeftBar(){
        return BrowserUtils.BrowserUtil.getText(headerOnLeftBar);
    }
    public List<WebElement> validateOptionSelect(){
        return BrowserUtils.BrowserUtil.getOptionsSelect(dropdown);
    }
    public void selectLowToHigh(){
        BrowserUtils.BrowserUtil.selectBy(dropdown, "Price(low to high)", "visibleText");

    }
}
