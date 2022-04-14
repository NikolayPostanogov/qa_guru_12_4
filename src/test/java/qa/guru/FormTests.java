package qa.guru;

import org.junit.jupiter.api.*;
import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormTests {
    @BeforeAll
    static void setUp() {
        Configuration.holdBrowserOpen = true;
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @AfterAll
    static void setDown() {
        Configuration.holdBrowserOpen = false;
    }

    @Test
    void formTests() {
        String firstName = "Alex";
        String lastName = "Egorov";
        String email = "alex_e@tst.com";
        String gender = "Male";
        String phoneNumber = "0000000000";
        String year = "2000";
        String month = "May";
        String day = "17"; //в формате mm
        String subject = "123";
        String address = "somestreet 1";
        String hobby = "Sports";
        String imgName = "img.png";
        String imgPath = "img/" + imgName;
        String state = "NCR";
        String city = "Delhi";

        open("/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").setValue(phoneNumber);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0"+day).click();
        $("#subjectsInput").setValue(subject); //при снятии выделения поле очищается
        $("#currentAddress").setValue(address);
        $("#hobbiesWrapper").$(byText(hobby)).click();
        $("#uploadPicture").uploadFromClasspath(imgPath);
        $("#state").click();
        $(byText(state)).click();
        $("#city").click();
        $(byText(city)).click();
        $("#submit").click();

        $(".modal-body").shouldHave(
                text(firstName + " " + lastName),
                text(email),
                text(gender),
                text(phoneNumber),
                text(day + " " + month + "," + year),
                text(subject),
                text(hobby),
                text(imgName),
                text(address),
                text(state + " " + city)
        );
    }
}
