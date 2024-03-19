package com.web_order.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/WebOrders",
        glue = "com/web_order/step_definitions",
        dryRun = true

)
public class Runner {
}
