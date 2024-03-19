package com.smart_bear.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class SmartHook {
    WebDriver driver;
    @Before // this annotation is from io.cucumber.java
    public void initializeDriver(){
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("smartBearURL"));
    }

    @After
    public void tearDown() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }
}
