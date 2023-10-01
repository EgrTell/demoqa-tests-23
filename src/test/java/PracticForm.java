import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticForm {
    @Test
    void fillPracticeForm () {

        Configuration.holdBrowserOpen=true;
        Configuration.pageLoadTimeout = 100000;
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Egor");
        $("[id=lastName]").setValue("Tellin");
        $("[id=userEmail]").setValue("egor21chuv@yandex.ru");
        $("[class=custom-control-label]").click();
        $("[id=userNumber]").setValue("89656876462");
        $("[id=dateOfBirthInput]").click();
        $("[id=dateOfBirthInput]").setValue("\b\b\b\b\b\b\b\b\b\b");
        $("[id=dateOfBirthInput]").setValue("19 Apr 1999");
        $("[id=subjects-auto-complete__value-container]").setValue("Maths");
        //$("[class=react-datepicker__year-select]").selectOption("1999");
        //$("[class=react-datepicker__month-select]").selectOption("April");
        //$("[class=react-datepicker__day--019]").selectOption(19);


    }
}
