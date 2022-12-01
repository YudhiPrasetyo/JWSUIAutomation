package org.jws.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
    public static WebDriver driver;
    public void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    public void navigateToHome() {
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().window().maximize();
        threadSleep();
    }

    public void closeDriver() {
        threadSleep();
        driver.close();
        driver.quit();
    }
    public static void threadSleep() {
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
