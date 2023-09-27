
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {
    @BeforeAll
   static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://demoqa.com";
    }
    @Test
    void fillFormTest () {
        open("https://demoqa.com/text-box");
        $("[id=userName]").setValue("Egor Tellin");
        $("#userEmail").setValue("egor21chuv@yandex.ru");
        $("#currentAddress").setValue("Some Address1");
        $("#permanentAddress").setValue("Another Address1");
        $("#submit").click();

        $("#output").shouldHave(text("Egor Tellin"), text("egor21chuv@yandex.ru"), text("Some Address1"), text("Another Address1"));


    }


    }

