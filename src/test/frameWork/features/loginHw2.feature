Feature: Login Feature Test

  Scenario: Login with valid email and invalid password
    Given I am at TalentTEK Homepage
    And I enter a valid email address
    And I enter an invalid password
    When I click on Login Button
    Then I should not be able to log in with popped up error message