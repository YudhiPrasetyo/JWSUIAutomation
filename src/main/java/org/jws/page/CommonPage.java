package org.jws.page;

import org.jws.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.jws.base.BaseClass.driver;
import static org.jws.locator.CommonLocator.*;

public class CommonPage {
    public static void clickSignInLink() {
        driver.findElement(LINK_SIGN_IN).click();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void hoverCategoryMen() {
        Actions actions = new Actions(driver);
        WebElement catMen = driver.findElement(LINK_CATEGORY_MEN);
        actions.moveToElement(catMen).build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void hoverCategoryMenTops() {
        Actions actions = new Actions(driver);
        WebElement catMenTops = driver.findElement(LINK_CATEGORY_MEN_TOPS);
        actions.moveToElement(catMenTops).build().perform();
        BaseClass.threadSleep();
    }

    public static void hoverCategoryMenBottoms() {
        Actions actions = new Actions(driver);
        WebElement catMenTops = driver.findElement(LINK_CATEGORY_MEN_BOTTOMS);
        actions.moveToElement(catMenTops).build().perform();
        BaseClass.threadSleep();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void hoverCategoryMenTopsJackets() {
        Actions actions = new Actions(driver);
        WebElement catMenTopsJackets = driver.findElement(LINK_CATEGORY_MEN_TOPS_JACKETS);
        actions.moveToElement(catMenTopsJackets).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public static void hoverCategoryMenBottonsPants() {
        Actions actions = new Actions(driver);
        WebElement catMenTopsJackets = driver.findElement(LINK_CATEGORY_MEN_BOTTOMS_PANTS);
        actions.moveToElement(catMenTopsJackets).click().build().perform();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }
}
