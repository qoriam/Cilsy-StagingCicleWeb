package com.qori.base;

import com.qori.utils.TestUtil;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public static WebDriver driver;
    public static Properties properties;

    public TestBase(){
        try {
            properties = new Properties();
            FileInputStream inputStream = new FileInputStream("src/main/java/com/qori/config/config.properties");
            properties.load(inputStream);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void initialization(){
//
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--profile-directory=Default");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-plugins-discovery");
        options.addArguments("user_agent=DN");
        options.addArguments("user-data-dir=C:/Users/Sevima/AppData/Local/Google/Chrome/User Data/");
        options.addArguments("--profile-directory=Default");
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.get(properties.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);


    }
}
