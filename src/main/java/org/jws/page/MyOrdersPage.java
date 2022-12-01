package org.jws.page;

import static org.jws.base.BaseClass.driver;
import static org.jws.locator.MyOrdersLocator.*;

public class MyOrdersPage {

    public static String getFirstItemName() {
        return driver.findElement(FIRST_ITEM_NAME).getText();
    }

    public static String getFirstItemSize() {
        return driver.findElement(FIRST_ITEM_SIZE).getText();
    }

    public static String getFirstItemColor() {
        return driver.findElement(FIRST_ITEM_COLOR).getText();
    }

    public static String getFirstItemPrice() {
        return driver.findElement(FIRST_ITEM_PRICE).getText();
    }

    public static String getSecondItemName() {
        return driver.findElement(SECOND_ITEM_NAME).getText();
    }

    public static String getSecondItemSize() {
        return driver.findElement(SECOND_ITEM_SIZE).getText();
    }

    public static String getSecondItemColor() {
        return driver.findElement(SECOND_ITEM_COLOR).getText();
    }

    public static String getSecondItemPrice() {
        return driver.findElement(SECOND_ITEM_PRICE).getText();
    }

    public static String getThirdItemName() {
        return driver.findElement(THIRD_ITEM_NAME).getText();
    }

    public static String getThirdItemSize() {
        return driver.findElement(THIRD_ITEM_SIZE).getText();
    }

    public static String getThirdItemColor() {
        return driver.findElement(THIRD_ITEM_COLOR).getText();
    }

    public static String getThirdItemPrice() {
        return driver.findElement(THIRD_ITEM_PRICE).getText();
    }
}
