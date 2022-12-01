package org.jws.page;

import static org.jws.base.BaseClass.driver;
import static org.jws.locator.CartLocator.*;

public class CartPage {

    public static String getFirstItemName() {
        return driver.findElement(LABEL_NAME_FIRST_ITEM).getText();
    }

    public static String getSecondItemName() {
        return driver.findElement(LABEL_NAME_SECOND_ITEM).getText();
    }

    public static String getThirdItemName() {
        return driver.findElement(LABEL_NAME_THIRD_ITEM).getText();
    }

    public static String getFirstItemPrice() {
        return driver.findElement(LABEL_PRICE_FIRST_ITEM).getText();
    }

    public static String getSecondItemPrice() {
        return driver.findElement(LABEL_PRICE_SECOND_ITEM).getText();
    }

    public static String getThirdItemPrice() {
        return driver.findElement(LABEL_PRICE_THIRD_ITEM).getText();
    }

    public static void clickBtnProceedToCheckout() {
        driver.findElement(BUTTON_PROCEED_TO_CHECKOUT).click();
    }

}
