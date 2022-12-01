package org.jws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.jws.base.BaseClass.driver;
import static org.jws.locator.JacketsLocator.*;

public class JacketPage {

    public static void clickSizeOnFirstJacket() {
        Actions actions = new Actions(driver);
        WebElement btnSizeXS = driver.findElement(BTN_SIZE_XS_FIRST_JACKET);
        actions.moveToElement(btnSizeXS).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void clickColorOnFirstJacket() {
        Actions actions = new Actions(driver);
        WebElement btnColorBlack = driver.findElement(BTN_COLOR_BLACK_FIRST_JACKET);
        actions.moveToElement(btnColorBlack).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void clickAddtoCartOnFirstJacket() {
        Actions actions = new Actions(driver);
        WebElement btnAddToCart = driver.findElement(BTN_ADD_TO_CART_FIRST_JACKET);
        actions.moveToElement(btnAddToCart).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void clickSizeOnSecondJacket() {
        Actions actions = new Actions(driver);
        WebElement btnSizeXS = driver.findElement(BTN_SIZE_XS_SECOND_JACKET);
        actions.moveToElement(btnSizeXS).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void clickColorOnSecondJacket() {
        Actions actions = new Actions(driver);
        WebElement btnColorBlack = driver.findElement(BTN_COLOR_BLACK_SECOND_JACKET);
        actions.moveToElement(btnColorBlack).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void clickAddtoCartOnSecondJacket() {
        Actions actions = new Actions(driver);
        WebElement btnAddToCart = driver.findElement(BTN_ADD_TO_CART_SECOND_JACKET);
        actions.moveToElement(btnAddToCart).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }
}
