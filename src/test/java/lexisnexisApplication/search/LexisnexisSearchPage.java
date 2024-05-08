package lexisnexisApplication.search;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LexisnexisSearchPage extends PageObject {


    @FindBy(xpath = "//a[@class='score-button hidden-xs hidden-sm' and @href='https://risk.lexisnexis.com/corporate/careers/jobs']")
    WebElement searchAllJobsLink;

    @FindBy(xpath = "//input[@class='search-box-input ais-search-box--input']")
    WebElement searchBox;
    @FindBy(xpath = "//span[@class='search-box-button-text']")
    WebElement searchBtn;

    @FindBy(xpath = "//a[@class='score-button btn-clickable-area' and @href='https://risk.lexisnexis.com/corporate/careers']")
    WebElement careersLink;

    @FindBy(css = ".job-item")
    List<WebElement> jobResults;

    //Navigate To search page
    public void searchForJobs(String searchText) {
        careersLink.click();
        searchAllJobsLink.click();
        searchBox.click();
        searchBox.sendKeys(searchText);
        searchBtn.click();
    }

    public void verifySearchResults() {
        if (jobResults.isEmpty()) {
            throw new AssertionError("No search results found for the given keyword");
        }
    }
}

