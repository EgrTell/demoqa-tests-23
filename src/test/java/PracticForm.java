import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticForm {
    @Test
    void fillPracticeForm () {
        Configuration.holdBrowserOpen=true;
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Egor");
        $("[id=lastName]").setValue("Tellin");
        $("[id=userEmail]").setValue("egor21chuv@yandex.ru");
        $("[class=custom-control-label]").click();
        $("[id=userNumber]").setValue("89656876462");
        $("[class=react-datepicker-ignore-onclickoutside]").setValue("19 Apr 1999");


    }
}
