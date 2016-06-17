package com.spiritedtechie.appiuminaction;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class NameSubmissionTest {

    private AppiumDriver<WebElement> driver;

    @Before
    public void setUp() throws Exception {
        File classpathRoot = new File(System.getProperty("user.dir"));
        File app = new File(classpathRoot, "../app/build/outputs/apk/app-debug.apk");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformVersion", "6");
        capabilities.setCapability("deviceName", "Android Emulator");
        capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "com.spiritedtechie.appiuminaction");
        capabilities.setCapability("appActivity", "com.spiritedtechie.appiuminaction.mobile.MainActivity");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void submitName() {

        WebElement nameEditText = driver.findElementById("et_name");
        nameEditText.sendKeys("Bob Smith");
        WebElement submitButton = driver.findElementById("btn_submit");
        submitButton.click();

        WebElement nameSubmittedTextView = driver.findElementById("tv_name_submitted");

        assertThat(nameSubmittedTextView.getText(), is("Bob Smith"));
    }

}

