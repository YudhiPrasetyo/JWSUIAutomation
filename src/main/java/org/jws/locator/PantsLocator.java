package org.jws.locator;

import org.openqa.selenium.By;

public interface PantsLocator {

    By BTN_SIZE_32_FIRST_PANTS = By.cssSelector("div[class='swatch-opt-880'] div[option-id='175']");
    By BTN_COLOR_BLACK_FIRST_PANTS = By.cssSelector("div[class='swatch-opt-880'] div[option-id='49']");
    By BTN_ADD_TO_CART_FIRST_PANTS = By.cssSelector("div[class='swatch-opt-880'] + div button");
}
