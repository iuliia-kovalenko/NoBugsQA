package ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;

import static com.codeborne.selenide.Selenide.element;

@Getter
public class MainPage {
    private SelenideElement welcomeTitle = element(Selectors.byTagName("h1"));
    private SelenideElement welcomeText = element(Selectors
            .byText("Your account was created successfully. You are now logged in."));

    private SelenideElement welcomeFirstLastName = element(Selectors.byClassName("smallText"));
}
