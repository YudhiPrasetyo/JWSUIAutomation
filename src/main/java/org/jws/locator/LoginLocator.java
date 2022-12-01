package org.jws.locator;

import org.openqa.selenium.By;

public interface LoginLocator {
    By INPUT_EMAIL = By.cssSelector("input[id='email']");
    By INPUT_PASSWORD = By.cssSelector("input[name='login[password]']");
    By BUTTON_SIGN_IN = By.cssSelector("button[class='action login primary']");
}
