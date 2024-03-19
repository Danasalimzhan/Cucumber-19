package com.sauce_labs.step_definitions;

import io.cucumber.java.Before;

public class Hook {
    @Before
    public void test(){
        System.out.println("run");
    }
}
