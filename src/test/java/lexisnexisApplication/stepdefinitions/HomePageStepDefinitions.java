package lexisnexisApplication.stepdefinitions;

import io.cucumber.java.en.*;
import lexisnexisApplication.lexisnexisnavigation.NavigateTo;
import lexisnexisApplication.lexisnexisnavigation.NavigateToLexisnexisApplication;
import lexisnexisApplication.search.LexisnexisHomePage;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.annotations.Steps;
import static net.serenitybdd.core.Serenity.getDriver;

// Navigate To Lexisnexis Application
public class HomePageStepDefinitions {

    @Steps
    LexisnexisHomePage lexisnexisHomePage;
    NavigateToLexisnexisApplication navigateToLexisnexisApplication;

    @Given("User is on the LexisNexis Risk website")
    public void userIsOnTheLexisNexisRiskWebsite() {
        navigateToLexisnexisApplication.open();
        getDriver().manage().window().maximize();
    }

    @And("User accepts cookies")
    public void userAcceptsCookies() {
        lexisnexisHomePage.acceptCookies();
    }
}

