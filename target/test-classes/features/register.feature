Feature: as user i should be able to register
  @register
  Scenario: user should be able to register successfully
    Given user is on homepage
    And click on register Button
    And user enters registration details and click on submit
    Then user should be able to register successfully
    And welcome message should display