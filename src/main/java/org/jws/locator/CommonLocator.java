package org.jws.locator;

import org.openqa.selenium.By;

public interface CommonLocator {
    By LINK_SIGN_IN = By.cssSelector("div[class='panel header'] li:nth-of-type(2) a");
    By LINK_CATEGORY_MEN = By.cssSelector("a[id='ui-id-5']");
    By LINK_CATEGORY_MEN_TOPS = By.cssSelector("a[id='ui-id-17']");
    By LINK_CATEGORY_MEN_BOTTOMS = By.cssSelector("a[id='ui-id-18']");
    By LINK_CATEGORY_MEN_TOPS_JACKETS = By.cssSelector("a[id='ui-id-19']");
    By LINK_CATEGORY_MEN_BOTTOMS_PANTS = By.cssSelector("a[id='ui-id-23']");
    By LINK_SHOPPING_CART = By.xpath("//a[contains(text(), 'shopping cart')]");
}
