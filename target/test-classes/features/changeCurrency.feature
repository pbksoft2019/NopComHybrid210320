Feature: user should able to change currency,
  so that user can use a different currency
  @ChangeCurrency
  Scenario: user should be able to change currency successfully

    Given user is on homepage
    When user change currency to USD to Euro or
    Then user can see all the prices have change USD to Euro
