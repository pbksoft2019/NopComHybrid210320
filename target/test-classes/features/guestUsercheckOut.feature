Feature: guest user should be able to check out successfully
  So that guest user  can use all functionality.
  @GuestCheckOut
  Scenario:Guest user should able to check
  out successfully.
    Given user is on homepage
    And user clicks on book category
    When user clicks on book category
    And user can click on add to cart and go to shopping cart
    And user can tick on terms box and click on checkout
    And user can click on checkout as guest
    And user can enter all compulsory field and make payment
    And user can click on conform button
    Then user can buy product successfully and see message