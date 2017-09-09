package com.xiwire.web.client;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Openings {
    WebDriver driver;

    public void Openings(){

        System.out.println("ingreso                                                                                                                                                                                                                  a openings");
    }

    public void OpenPage(String page){
        // Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface,
        // not the implementation.
        driver = new FirefoxDriver();
        // And now use this to visit Google
        driver.get(page);
    }
}
