package lexisnexisApplication.search;

import net.serenitybdd.core.exceptions.NoSuchElementException;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Util extends PageObject {

    public void acceptCookies() {
        try {
            WebElement acceptButton = getDriver().findElement(By.xpath("//button[contains(text(),'Accept All Cookies')]"));
            if (acceptButton.isDisplayed()) {
                acceptButton.click();
            }
        } catch (NoSuchElementException ignored) {
            // Accept button not found or not needed
        }
    }
}
