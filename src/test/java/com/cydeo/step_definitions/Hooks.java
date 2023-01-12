package com.cydeo.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void setUpScenario(){
        System.out.println("Before method is running in Hooks");
    }
    @After
    public void tearDownScenario(){
        System.out.println("After method is running in Hooks");
    }
}
