Feature: Sign Up
  Background: Going to website
    Given I am at talentTEK signup page

  Scenario: How to parameters
    Given We enter "Ashif" and "Uzzaman"
    Then then enter the email, password, confirm password and gender
      |a.b123@gmail.com|Abc123|male|
      |Abc123          |      |female|


  Scenario Outline: Multiple iteration
    Given I enter <FirstName>, <LastName>, <Email>, <Password>, <Confirm Password>
    When I enter the email@email.com, firstName, lastname, Password, Confirm Password
    Examples:
      |FirstName|LastName|Email|Password|Confirm Password|
      |Ashif|Uzzaman|a.123@b.com|123456 |123456          |
      |Shima|Nahar|s.n@sn.com|654321    |654321          |
      |Syeda|Jahan|s.j@mm.com|abcd12    |abcd12          |