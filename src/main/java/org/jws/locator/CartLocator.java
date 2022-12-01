package org.jws.locator;

import org.openqa.selenium.By;

public interface CartLocator {

    By LABEL_NAME_FIRST_ITEM = By.cssSelector("tbody[class='cart item']:first-of-type strong  a");
    By LABEL_NAME_SECOND_ITEM = By.cssSelector("tbody[class='cart item']:nth-of-type(2) strong  a");
    By LABEL_NAME_THIRD_ITEM = By.cssSelector("tbody[class='cart item']:nth-of-type(3) strong  a");
    By LABEL_PRICE_FIRST_ITEM = By.cssSelector("tbody[class='cart item']:first-of-type td[class='col price'] span[class='price']");
    By LABEL_PRICE_SECOND_ITEM = By.cssSelector("tbody[class='cart item']:nth-of-type(2) td[class='col price'] span[class='price']");
    By LABEL_PRICE_THIRD_ITEM = By.cssSelector("tbody[class='cart item']:nth-of-type(3) td[class='col price'] span[class='price']");
    By BUTTON_PROCEED_TO_CHECKOUT = By.cssSelector("button[class='action primary checkout'] span");
}
