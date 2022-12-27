package com.virgosol.stepImpl;

import com.virgosol.util.Driver;
import io.cucumber.java.After;

public class Hooks {

    @After
    public void teardown(){
        Driver.closeDriver();
    }
}
