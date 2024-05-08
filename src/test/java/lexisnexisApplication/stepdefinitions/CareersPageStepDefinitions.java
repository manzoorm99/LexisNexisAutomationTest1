package lexisnexisApplication.stepdefinitions;

import io.cucumber.java.en.*;
import lexisnexisApplication.search.LexisnexisCareerPage;
import net.serenitybdd.annotations.Steps;

public class CareersPageStepDefinitions {

    @Steps
    LexisnexisCareerPage lexisnexisCareerPage;

    @When("User navigates to Careers page")
    public void userNavigatesToCareersPage() throws InterruptedException {
        lexisnexisCareerPage.navigateToCareersPage();
    }

}

