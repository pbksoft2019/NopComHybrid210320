Feature:As a user, I should be able to sort product high to low by price,
  so that I can use sort product facility.
  @SortPrice
  Scenario:I should able to sort product high to low by price.
    Given user is on homepage
    When user clicks on book category
    And I select on high to low
    Then I should see price organised high to low