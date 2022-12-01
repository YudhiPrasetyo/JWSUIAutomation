package org.jws.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.jws.base.BaseClass.driver;
import static org.jws.locator.CommonLocator.LINK_SHOPPING_CART;
import static org.jws.locator.PantsLocator.*;

public class PantsPage {

    public static void clickSizeOnFirstPants() {
        Actions actions = new Actions(driver);
        WebElement btnSizeXS = driver.findElement(BTN_SIZE_32_FIRST_PANTS);
        actions.moveToElement(btnSizeXS).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void clickColorOnFirstPants() {
        Actions actions = new Actions(driver);
        WebElement btnColorBlack = driver.findElement(BTN_COLOR_BLACK_FIRST_PANTS);
        actions.moveToElement(btnColorBlack).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public static void clickAddtoCartOnFirstPants() {
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
        w.until(ExpectedConditions.visibilityOfElementLocated(BTN_ADD_TO_CART_FIRST_PANTS));
        try {
            Actions actions = new Actions(driver);
            WebElement btnAddToCart = driver.findElement(BTN_ADD_TO_CART_FIRST_PANTS);
            actions.moveToElement(btnAddToCart).click().build().perform();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        }catch (Exception e) {

        }
    }

    public static void clickLinkShoppingCart() {
        WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(3));
        w.until(ExpectedConditions.visibilityOfElementLocated(LINK_SHOPPING_CART));
        driver.findElement(LINK_SHOPPING_CART).click();
    }
}
