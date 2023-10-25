package gitHubSearch;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    @Test
    void dragAndDrop(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(exactText("A"));
        $("#column-b").dragAndDropTo("#column-a");
        $("#column-a").shouldHave(exactText("B"));
        sleep(5000);
    }

    @Test
    void dragAndDropByActions(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(exactText("A"));
        actions().moveToElement($("#column-b")).clickAndHold().moveByOffset(-200,0).release().perform();
        $("#column-a").shouldHave(exactText("B"));
        sleep(5000);
    }
}
