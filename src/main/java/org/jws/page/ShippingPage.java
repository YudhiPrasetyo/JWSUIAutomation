package org.jws.page;

import org.jws.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.jws.base.BaseClass.driver;
import static org.jws.data.AccountData.*;
import static org.jws.locator.ShippingLocator.*;

public class ShippingPage {

    public static void inputStreetAddress() {
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(SHIPPING_STREET_ADDRESS).click();
            driver.findElement(SHIPPING_STREET_ADDRESS).sendKeys(STREET_ADDRESS);
        } catch (Exception e) {

        }
    }
    public static void inputCompany() {
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(SHIPPING_COMPANY).click();
            driver.findElement(SHIPPING_COMPANY).sendKeys(COMPANY_NAME);
        } catch (Exception e) {

        }
    }
    public static void inputCountry() {
        try {
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.findElement(SHIPPING_COUNTRY).click();
            Select select = new Select((WebElement) SHIPPING_COUNTRY);
            select.selectByVisibleText("United States");
        }catch (Exception e) {

        }
    }
    public static void inputCity() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(SHIPPING_CITY).sendKeys(CITY);
    }
    public static void inputProvince() {
        try {
            WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(3));
            w.until(ExpectedConditions.elementToBeClickable(SHIPPING_STATE_PROVINCE));
            WebElement province = driver.findElement(SHIPPING_STATE_PROVINCE);
            Select select = new Select(province);
            select.selectByVisibleText("Alaska");
        } catch (Exception e) {

        }
    }
    public static void inputPostalCode() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(SHIPPING_POSTAL_CODE).click();
        driver.findElement(SHIPPING_POSTAL_CODE).sendKeys(POSTAL_CODE);
    }
    public static void inputPhoneNumber() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(SHIPPING_PHONE_NUMBER).click();
        driver.findElement(SHIPPING_PHONE_NUMBER).sendKeys(PHONE_NUMBER);
    }

    public static void chooseShippingMethod() {
        driver.findElement(SHIPPING_METHOD).click();
        BaseClass.threadSleep();
    }

    public static void clickBtnNext() {
        driver.findElement(BUTTON_NEXT).click();
        BaseClass.threadSleep();
    }

    public static void clickBtnPlaceOrder() {
        driver.findElement(BUTTON_PLACE_ORDER).click();
        BaseClass.threadSleep();
    }

    public static void clickOrderId() {
        driver.findElement(LINK_ORDER_ID).click();
    }


}
