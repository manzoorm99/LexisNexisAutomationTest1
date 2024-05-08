package lexisnexisApplication.search;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LexisnexisHomePage extends PageObject {

    Util util;

    public void acceptCookies() {
        util.acceptCookies();
    }
}

