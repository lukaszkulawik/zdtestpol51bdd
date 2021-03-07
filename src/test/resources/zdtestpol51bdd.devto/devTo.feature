Feature: devTo basic features
  Scenario: Open first seeing blog
    Given I go to devto main page
    When I click on first blog displayed
    Then I should be redirected to blog page

  Scenario: Open and play first seeig podcast
    Given I go to devto main page
    When I go to podcast section
    When I click on first podcast on the list
    And I play the podcast
    Then Podcast Should be played

  Scenario: Search the phrase
    Given I go to devto main page
    When I search for "testing" phrase
    Then Top 3 blogs found should have correct phrase in title or snippet