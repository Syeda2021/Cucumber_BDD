Feature: Login Feature Test

  Scenario: Login with invalid email and valid password
    Given I am at TalentTEK Homepage
    And I enter an invalid email address
    And I enter a valid password
    When I click on Login Button
    Then I should not be able to log in with popped up error message