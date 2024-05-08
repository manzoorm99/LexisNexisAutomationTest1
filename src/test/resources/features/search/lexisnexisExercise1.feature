Feature: Searching for jobs on LexisNexis Risk website

  Background:
    Given User is on the LexisNexis Risk website
    And User accepts cookies

  Scenario: User searches for "automation tester" jobs
    Given User is on the LexisNexis Risk website
    When User navigates to Careers page
    And User searches for <SearchText> in the search box
      | SearchText      |
      |automation tester|
    Then User should see search results

