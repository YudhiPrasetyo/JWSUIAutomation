package org.jws.page;

import static org.jws.base.BaseClass.driver;
import static org.jws.data.AccountData.EMAIL;
import static org.jws.data.AccountData.PASSWORD;
import static org.jws.locator.LoginLocator.*;

public class LoginPage {

    public static void inputEmail() {
        driver.findElement(INPUT_EMAIL).sendKeys(EMAIL);
    }
    public static void inputPassword() {
        driver.findElement(INPUT_PASSWORD).sendKeys(PASSWORD);
    }
    public static void clickBtnSignIn() {
        driver.findElement(BUTTON_SIGN_IN).click();
    }
}
