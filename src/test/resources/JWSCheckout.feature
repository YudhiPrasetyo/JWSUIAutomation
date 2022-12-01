Feature: JWS
  Scenario: Verify user able to checkout with multiple item from any category using Registered user
    Given user login using registered account on ecommerce website
    When user go to category Jackets on Men tops
    And user choose two item from category Jackets
    And user choose one item from category Bottoms
    And user click icon cart
    And user verify the order summary
    And user click proceed to checkout
    And user fill shipping address
    And user select delivery method
    And user click button Next
    And user click Place an order
    Then user Verify the submitted order under My Orders

