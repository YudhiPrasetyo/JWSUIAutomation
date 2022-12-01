package org.jws.locator;

import org.openqa.selenium.By;

public interface ShippingLocator {

    By SHIPPING_EMAIL_ADDRESS = By.cssSelector("input[id='customer-email']");
    By SHIPPING_FIRST_NAME = By.cssSelector("input[id='TP1YCE8']");
    By SHIPPING_LAST_NAME = By.cssSelector("input[id='CCCBJ5B']");
    By SHIPPING_COMPANY = By.cssSelector("input[name='company']");
    By SHIPPING_STREET_ADDRESS = By.cssSelector("input[name='street[0]']");
    By SHIPPING_CITY = By.cssSelector("input[name='city']");
    By SHIPPING_STATE_PROVINCE = By.cssSelector("select[name='region_id']");
    By SHIPPING_POSTAL_CODE = By.cssSelector("input[name='postcode']");
    By SHIPPING_COUNTRY = By.cssSelector("select[name='country_id']");
    By SHIPPING_PHONE_NUMBER = By.cssSelector("input[name='telephone']");
    By SHIPPING_METHOD = By.cssSelector("input[value='flatrate_flatrate']");
    By BUTTON_NEXT = By.cssSelector("button[class='button action continue primary']");
    By BUTTON_PLACE_ORDER = By.cssSelector("button[class='action primary checkout']");
    By LINK_ORDER_ID = By.cssSelector("a[class='order-number']");
}
