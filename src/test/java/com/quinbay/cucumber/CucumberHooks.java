package com.quinbay.cucumber;

import org.junit.Before;

public class CucumberHooks {
    @Before
    public  void Launch_Browser(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/driver/chromedriver");

    }
}
