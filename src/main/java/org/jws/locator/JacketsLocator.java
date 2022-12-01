package org.jws.locator;

import org.openqa.selenium.By;

public interface JacketsLocator {
    By BTN_SIZE_XS_FIRST_JACKET = By.cssSelector("div[class='swatch-opt-430'] div[option-id='166']");
    By BTN_SIZE_XS_SECOND_JACKET = By.cssSelector("div[class='swatch-opt-414'] div[option-id='166']");
    By BTN_COLOR_BLACK_FIRST_JACKET= By.cssSelector("div[class='swatch-opt-430'] div[option-id='49']");
    By BTN_COLOR_BLACK_SECOND_JACKET= By.cssSelector("div[class='swatch-opt-414'] div[option-id='58']");
    By BTN_ADD_TO_CART_FIRST_JACKET = By.cssSelector("div[class='swatch-opt-430'] + div button");
    By BTN_ADD_TO_CART_SECOND_JACKET = By.cssSelector("div[class='swatch-opt-414'] + div button");
}
