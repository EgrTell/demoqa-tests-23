package exampls.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
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
        $("[id=currentAddress]").setValue("Some Address 1");
        $("[id=userNumber]").setValue("89656876462");

        //$("[class=custom-control-label]").click(); // only for male
//        $("label[for=gender-radio-3]").click(); //good
        $("#genterWrapper").$(byText("Other")).click();// best

        $("[id=dateOfBirthInput]").click();
        $("[class=react-datepicker__month-select]").selectOption("April");
        $("[class=react-datepicker__year-select]").selectOption("1999");
        $(".react-datepicker__day--019").click();

        $("[id=subjectsInput]").setValue("Maths").pressEnter();
        $("#hobbiesWrapper").$(byText("Sports")).click();
        $("#hobbiesWrapper").$(byText("Reading")).click();




//        $("[id=dateOfBirthInput]").click();$("[id=dateOfBirthInput]").setValue("\b\b\b\b\b\b\b\b\b\b");
//        $("[id=dateOfBirthInput]").setValue("19 Apr 1999");

//         $("[class=subjects-auto-complete__placeholder]").click();
//          $("[id=subjects-auto-complete__value-container]").setValue("m");
//         $("[id=subjects-auto-complete__value-container]").pressEnter();


    }
}
