Feature: user should be able to compare two product
  @compare
  Scenario: as a user i should be able to compare two products
    Given user is on homepage
    When user clicks on book category
    And user click on add to compare on two different products
    Then user should be able to see comparision of two different product