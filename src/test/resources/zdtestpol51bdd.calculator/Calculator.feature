Feature: basic calculator functions
  Scenario: adding two numbers
    Given I have a calculator
    When I add 2 and 3
    Then I should get 5
  Scenario: subtracting two numbers
    Given I have a calculator
    When I subtract 3 and 2
    Then I should get 1
  Scenario: multiplicating two numbers
    Given I have a calculator
    When I multiple 3 and 2
    Then I should get 6
  Scenario: dividing two numbers
    Given I have a calculator
    When I divide 6 by 2
    Then I should get 3