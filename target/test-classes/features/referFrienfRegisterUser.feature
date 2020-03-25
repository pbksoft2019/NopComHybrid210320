Feature: as a registered user i should be able to refer product to friend
  @referFriendReg
  Scenario: registered user should be able to refer product to friend
    Given user is on homepage
    And user login first
    And user clicks on book category
    And click on book Fahrenheit 451 by Ray Bradbury
    When User click on email a friend Button
    And fill out details and click on submit button
    Then user should see success message