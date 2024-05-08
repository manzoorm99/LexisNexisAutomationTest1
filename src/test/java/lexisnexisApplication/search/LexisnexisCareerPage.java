package lexisnexisApplication.search;
import lexisnexisApplication.lexisnexisnavigation.NavigateTo;
import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LexisnexisCareerPage extends PageObject {

    @FindBy(linkText = "About Us")
    WebElement aboutUsLink;

    @FindBy(xpath = "//a[@class='score-button btn-clickable-area' and @href='https://risk.lexisnexis.com/corporate/careers']")
    WebElement careersLink;

    Util util;

    //Navigate To careers page
    public void navigateToCareersPage() throws InterruptedException {
        aboutUsLink.click();
        careersLink.click();
    }
}


