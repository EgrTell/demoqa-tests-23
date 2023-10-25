package blaBlaBla;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class Scroll {

    @Test
    void infiniteScroll(){
        Configuration.pageLoadTimeout = 100000;
        open("https://albiononline.com/home");
        $(Selectors.withTagAndText("span", "3")).shouldBe(visible);
        $(Selectors.withTagAndText("span", "4")).hover();
        $(Selectors.withTagAndText("span", "3")).shouldBe(visible);

        sleep(5000);
    }
}
