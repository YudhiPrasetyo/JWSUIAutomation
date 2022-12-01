package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.jws.base.BaseClass;
import org.jws.data.AccountData;
import org.jws.page.*;
import org.testng.Assert;

public class StepDef {

    BaseClass baseClass = new BaseClass();

    @Before
    public void setup() {
        baseClass.setDriver();
    }

    @After
    public void tearDown() {
        baseClass.closeDriver();
    }

    @Given("user login using registered account on ecommerce website")
    public void user_login_using_registered_account_on_ecommerce_website() {
        baseClass.navigateToHome();
        CommonPage.clickSignInLink();
        LoginPage.inputEmail();
        LoginPage.inputPassword();
        LoginPage.clickBtnSignIn();
    }

    @When("user go to category Jackets on Men tops")
    public void user_go_to_category_jackets_on_men_tops() {
        CommonPage.hoverCategoryMen();
        CommonPage.hoverCategoryMenTops();
        CommonPage.hoverCategoryMenTopsJackets();
    }

    @When("user choose two item from category Jackets")
    public void user_choose_two_item_from_category_jackets() {
        JacketPage.clickSizeOnFirstJacket();
        JacketPage.clickColorOnFirstJacket();
        JacketPage.clickAddtoCartOnFirstJacket();
        JacketPage.clickSizeOnSecondJacket();
        JacketPage.clickColorOnSecondJacket();
        JacketPage.clickAddtoCartOnSecondJacket();
    }

    @When("user choose one item from category Bottoms")
    public void user_choose_one_item_from_category_bottoms() {
        CommonPage.hoverCategoryMen();
        CommonPage.hoverCategoryMenBottoms();
        CommonPage.hoverCategoryMenBottonsPants();
    }

    @When("user click icon cart")
    public void user_click_icon_cart() {
        PantsPage.clickSizeOnFirstPants();
        PantsPage.clickColorOnFirstPants();
        PantsPage.clickAddtoCartOnFirstPants();
        PantsPage.clickLinkShoppingCart();
    }

    @When("user verify the order summary")
    public void user_verify_the_order_summary() {
        Assert.assertEquals(CartPage.getFirstItemName(), AccountData.FIRST_JACKET, "item name is not same");
        Assert.assertEquals(CartPage.getSecondItemName(), AccountData.SECOND_JACKET, "item name is not same");
        Assert.assertEquals(CartPage.getThirdItemName(), AccountData.FIRST_PANTS, "item name is not same");
        Assert.assertEquals(CartPage.getFirstItemPrice(), AccountData.PRICE_FIRST_JACKET, "item name is not same");
        Assert.assertEquals(CartPage.getSecondItemPrice(), AccountData.PRICE_SECOND_JACKET, "item name is not same");
        Assert.assertEquals(CartPage.getThirdItemPrice(), AccountData.PRICE_FIRST_PANTS, "item name is not same");
    }

    @When("user click proceed to checkout")
    public void user_click_proceed_to_checkout() {
        CartPage.clickBtnProceedToCheckout();
    }

    @When("user fill shipping address")
    public void user_fill_shipping_address() {
        ShippingPage.inputCity();
        ShippingPage.inputStreetAddress();
        ShippingPage.inputProvince();
        ShippingPage.inputCompany();
        ShippingPage.inputStreetAddress();
        ShippingPage.inputPostalCode();
        ShippingPage.inputPhoneNumber();
    }

    @When("user click button Next")
    public void user_click_button_next() {
        ShippingPage.clickBtnNext();
    }

    @When("user select delivery method")
    public void user_select_delivery_method() {
        ShippingPage.chooseShippingMethod();
    }

    @When("user click Place an order")
    public void user_click_place_an_order() {
        ShippingPage.clickBtnPlaceOrder();
    }

    @Then("user Verify the submitted order under My Orders")
    public void user_verify_the_submitted_order_under_my_orders() {
        ShippingPage.clickOrderId();
        Assert.assertEquals(MyOrdersPage.getFirstItemName(), AccountData.FIRST_JACKET, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getFirstItemSize(), AccountData.FIRST_JACKET_SIZE, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getFirstItemColor(), AccountData.FIRST_JACKET_COLOR, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getFirstItemPrice(), AccountData.PRICE_FIRST_JACKET, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getSecondItemName(), AccountData.SECOND_JACKET, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getSecondItemSize(), AccountData.SECOND_JACKET_SIZE, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getSecondItemColor(), AccountData.SECOND_JACKET_COLOR, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getSecondItemPrice(), AccountData.PRICE_SECOND_JACKET, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getThirdItemName(), AccountData.FIRST_PANTS, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getThirdItemSize(), AccountData.FIRST_PANTS_SIZE,"item name is not same");
        Assert.assertEquals(MyOrdersPage.getThirdItemColor(), AccountData.FIRST_PANTS_COLOR, "item name is not same");
        Assert.assertEquals(MyOrdersPage.getThirdItemPrice(), AccountData.PRICE_FIRST_PANTS, "item name is not same");

    }
}
