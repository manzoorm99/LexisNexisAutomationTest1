Project: LexisNexis Job Search Automation

Overview:
This project automates the job search functionality on the LexisNexis Risk website using Serenity BDD framework with Cucumber. It navigates to the careers page, performs a job search, and verifies the search results.

Project Structure:
- lexisnexisApplication.lexisnexisnavigation: Contains classes related to navigating to the LexisNexis Risk website.
- lexisnexisApplication.search: Contains classes related to searching for jobs on the website.
- lexisnexisApplication.stepdefinitions: Contains step definition classes for Cucumber scenarios.

Feature File:
- Feature: Searching for jobs on LexisNexis Risk website
    - Background: Defines common steps to be executed before each scenario.
    - Scenario: User searches for "automation tester" jobs
        - Given User is on the LexisNexis Risk website
        - When User navigates to Careers page
        - And User searches for "automation tester" in the search box
        - Then User should see search results

Step Definitions:
- lexisnexisApplication.stepdefinitions.CareersPageStepDefinitions: Defines steps related to navigating to the Careers page.
- lexisnexisApplication.stepdefinitions.SearchJobStepDefinitions: Defines steps related to searching for jobs.

Page Objects:
- LexisnexisCareerPage: Handles actions related to navigating to the Careers page.
- LexisnexisSearchPage: Handles actions related to searching for jobs.

Usage:
1. Clone the project from the repository.
2. Open the project in your preferred IDE.
3. Make sure you have the necessary dependencies and plugins configured.
4. Run the Cucumber feature file or the Cucumber runner class to execute the automation tests.

Dependencies:
- Serenity BDD: Used for test automation and reporting.
- Cucumber: Used for writing and executing BDD scenarios.
- Selenium WebDriver: Used for browser automation.
- JUnit: Used for running test cases.
- Other necessary libraries for project setup and execution.

Note: Ensure that you have the appropriate WebDriver executable for the browser you intend to automate (e.g., ChromeDriver for Google Chrome).
