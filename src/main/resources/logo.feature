Feature: As a user
  I want to check if J.P Morgan logo is displayed on the home page

  Scenario: verify that the J.P. Morgan logo is displayed
    Given I navigate to google URL
    When I search for "J.P Morgan" on google website
    And I select the first result displayed
    Then I can see the JP Morgan logo is displayed on the website