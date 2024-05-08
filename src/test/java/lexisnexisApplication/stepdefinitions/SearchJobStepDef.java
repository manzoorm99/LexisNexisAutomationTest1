package lexisnexisApplication.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import lexisnexisApplication.search.LexisnexisSearchPage;
import net.serenitybdd.annotations.Steps;

import java.util.List;
import java.util.Map;

public class SearchJobStepDef {
    @Steps
    LexisnexisSearchPage lexisnexisSearchPage;

    @And("User searches for <SearchText> in the search box")
    public void userSearchesForTextInTheSearchBox(DataTable dataTable) {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        for (Map<String, String> row : data) {
            String searchText = row.get("SearchText");
            lexisnexisSearchPage.searchForJobs(searchText);
        }
    }

    @Then("User should see search results")
    public void userShouldSeeSearchResults() {
        lexisnexisSearchPage.verifySearchResults();
    }




}
