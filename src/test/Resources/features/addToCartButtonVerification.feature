Feature: to verify Add to cart button is present on all available products,
  So user can use add to cart function and continue shopping.
  @AddToCartButton
  Scenario:user should able to see add cart button on all available product
    Given user is on homepage
    When user see all products
    Then user should be see add to cart button
