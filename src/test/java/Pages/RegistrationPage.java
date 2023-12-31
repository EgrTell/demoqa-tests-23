package Pages;

import Pages.Components.CalendarComponent;
import Pages.Components.RegistrationResultsModal;
import com.codeborne.selenide.SelenideElement;
import org.checkerframework.checker.units.qual.C;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal registrationResultsModal = new RegistrationResultsModal();
    private final String TITLE_TEXT = "Student Registration Form";
    private SelenideElement
            firstNameInput = $("#firstName"),
            lastNameInput = $("#lastName");
    public RegistrationPage openPage(){
        open("/automation-practice-form");
        $(".practice-form-wrapper").shouldHave(text(TITLE_TEXT));
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public RegistrationPage setFirstName (String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setLastName (String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPage setEmail (String value) {
        $("#userEmail").setValue(value); // todo move to Selenide elements

        return this;
    }

    public RegistrationPage setGender (String value) {
        $("#genterWrapper").$(byText(value)).click(); // todo move to Selenide elements

        return this;
    }

    public RegistrationPage setPhone (String value) {
        $("#userNumber").setValue(value); // todo move to Selenide elements

        return this;
    }

    public RegistrationPage setBirthDate (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponent.setDate(day, month, year);

        return this;
}
    public RegistrationPage verifyResultsModalAppears () {
        registrationResultsModal.verifyModalAppears();

        return this;
    }

    public RegistrationPage verifyResult (String key, String value) {
        registrationResultsModal.verifyResult(key, value);

        return this;
    }
}
