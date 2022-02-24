package com.pruebatecnica.qa.utils.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class OwnRemoteWebDriver {
    private static WebDriver driver;

    private OwnRemoteWebDriver() {

    }

    public static OwnRemoteWebDriver hisBrowserWeb() {


        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        Map<String,Object> prefs = new HashMap<>();
        prefs.put("credentials_enable_service",false);
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("profile.default_content_settings.cookies", 0);

        options.addArguments("--incognito");
        options.addArguments("--start-maximized");
        options.addArguments("--ignore-certificate--errors");
        options.addArguments("--disable-infobars");
        options.addArguments("--allow-running-insecure-content");
        options.setExperimentalOption("prefs",prefs);

        driver(options);
        return new OwnRemoteWebDriver();
    }

    public static void driver(ChromeOptions options) {

        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,"chrome");
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS,"chrome");
        driver = new ChromeDriver(options);
    }

    public static WebDriver on(String url) {

        driver.get(url);
        return driver;
    }
}
