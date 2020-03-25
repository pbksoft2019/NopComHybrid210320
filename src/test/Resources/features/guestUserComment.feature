Feature: non registered guest user should be able to new comment on comment section
  @GuestComment
  Scenario: as a guest user i should able to add a new comment successfully

    Given user is on homepage
    When user navigate to new comments
    And user fills comment fields
    And user click on new comment button
    Then comment should be added and message display <News comment is successfully added.>