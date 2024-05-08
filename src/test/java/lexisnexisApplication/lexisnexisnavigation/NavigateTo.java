package lexisnexisApplication.lexisnexisnavigation;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static void openTheLexisnexisHomePage() {
        //Task.where("{0} opens the Lexisnexis home page",
                Open.browserOn().the(NavigateToLexisnexisApplication.class);
    }
}
