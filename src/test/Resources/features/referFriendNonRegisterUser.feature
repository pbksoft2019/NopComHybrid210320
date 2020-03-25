Feature: Non registered user should not be able to refer products to friend
  @referFriendNonReg
  Scenario: Non registered user should NOT be able to refer products to friend
    Given user is on homepage
    And user clicks on book category
    And click on book Fahrenheit 451 by Ray Bradbury
    And User click on email a friend Button
    When fill out details and click on submit button
    Then user should see error message

