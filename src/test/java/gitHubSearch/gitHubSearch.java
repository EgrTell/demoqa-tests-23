package gitHubSearch;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class gitHubSearch {

    @Test
    void fillSelenideAndSearch () {
        open("https://github.com/");
        $(".search-input-container").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $$("[data-testid=results-list]").first().$("a").click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        sleep(5000);

    }
}
