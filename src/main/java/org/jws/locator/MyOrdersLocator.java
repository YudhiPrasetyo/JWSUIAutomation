package org.jws.locator;

import org.openqa.selenium.By;

public interface MyOrdersLocator {

    By FIRST_ITEM_NAME = By.cssSelector("tbody:first-of-type strong[class='product name product-item-name']");
    By FIRST_ITEM_SIZE= By.cssSelector("tbody:first-of-type dd:first-of-type");
    By FIRST_ITEM_COLOR = By.cssSelector("tbody:first-of-type dd:last-of-type");
    By FIRST_ITEM_PRICE = By.cssSelector("tbody:first-of-type td:nth-of-type(3)");
    By SECOND_ITEM_NAME = By.cssSelector("tbody:nth-of-type(2) strong[class='product name product-item-name']");
    By SECOND_ITEM_SIZE= By.cssSelector("tbody:nth-of-type(2) dd:first-of-type");
    By SECOND_ITEM_COLOR = By.cssSelector("tbody:nth-of-type(2) dd:last-of-type");
    By SECOND_ITEM_PRICE = By.cssSelector("tbody:nth-of-type(2) td:nth-of-type(3)");
    By THIRD_ITEM_NAME = By.cssSelector("tbody:nth-of-type(3) strong[class='product name product-item-name']");
    By THIRD_ITEM_SIZE= By.cssSelector("tbody:nth-of-type(3) dd:first-of-type");
    By THIRD_ITEM_COLOR = By.cssSelector("tbody:nth-of-type(3) dd:last-of-type");
    By THIRD_ITEM_PRICE = By.cssSelector("tbody:nth-of-type(3) td:nth-of-type(3)");

}
