package exampls.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class PracticFormTests {
    @Test
    void fillPracticeForm () {
        Configuration.holdBrowserOpen=true;
        open("https://demoqa.com/automation-practice-form");
        $("[id=firstName]").setValue("Egor");
        $("[id=lastName]").setValue("Tellin");
        $("[id=userEmail]").setValue("egor21chuv@yandex.ru");
        $("[class=custom-control-label]").click();
        $("[id=userNumber]").setValue("89656876462");
        $("[id=currentAddress]").setValue("Some Address 1");
        $("[id=dateOfBirthInput]").click();
        $("[id=dateOfBirthInput]").setValue("\b\b\b\b\b\b\b\b\b\b");
        $("[id=dateOfBirthInput]").setValue("19 Apr 1999");

        // $("[class=subjects-auto-complete__placeholder]").click();
        //  $("[id=subjects-auto-complete__value-container]").setValue("m");
       //  $("[id=subjects-auto-complete__value-container]").pressEnter();


    }
}
