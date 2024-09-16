package ui.pages;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Getter;
import ui.datas.BankAccount;

import static com.codeborne.selenide.Selenide.element;

@Getter
public class RegisterAccountPage {
    private SelenideElement firstNameInput = element(Selectors.byId("customer.firstName"));
    private SelenideElement firstNameError = element(Selectors.byId("customer.firstName.errors"));

    private SelenideElement lastNameInput = element(Selectors.byId("customer.lastName"));
    private SelenideElement lastNameError = element(Selectors.byId("customer.lastName.errors"));


    private SelenideElement registerButton = element(Selectors.byValue("Register"));

    private SelenideElement addressInput = element(Selectors.byId("customer.address.street"));
    private SelenideElement addressError = element(Selectors.byId("customer.address.street.errors"));

    private SelenideElement cityInput = element(Selectors.byId("customer.address.city"));
    private SelenideElement cityError = element(Selectors.byId("customer.address.city.errors"));

    private SelenideElement stateInput = element(Selectors.byId("customer.address.state"));
    private SelenideElement stateError = element(Selectors.byId("customer.address.state.errors"));

    private SelenideElement zipCodeInput = element(Selectors.byId("customer.address.zipCode"));
    private SelenideElement zipCodeError = element(Selectors.byId("customer.address.zipCode.errors"));

    private SelenideElement ssnInput = element(Selectors.byId("customer.ssn"));
    private SelenideElement ssnError = element(Selectors.byId("customer.ssn.errors"));

    private SelenideElement usernameInput = element(Selectors.byId("customer.username"));
    private SelenideElement usernameError = element(Selectors.byId("customer.username.errors"));

    private SelenideElement passwordInput = element(Selectors.byId("customer.password"));
    private SelenideElement passwordError = element(Selectors.byId("customer.password.errors"));

    private SelenideElement confirmPasswordInput = element(Selectors.byId("repeatedPassword"));
    private SelenideElement confirmPasswordError = element(Selectors.byId("repeatedPassword.errors"));


    public void open() {
        Selenide.open("/parabank/register.htm");
    }

    public void register(BankAccount bankAccount) {

        if (bankAccount.getFirstName() != null) {
            firstNameInput.sendKeys(bankAccount.getFirstName());
        }
        if (bankAccount.getLastName() != null) {
            lastNameInput.sendKeys(bankAccount.getLastName());
        }
        if (bankAccount.getCity() != null) {
            cityInput.sendKeys(bankAccount.getCity());
        }
        if (bankAccount.getState() != null) {
            stateInput.sendKeys(bankAccount.getState());
        }
        if (bankAccount.getZipCode() != null) {
            zipCodeInput.sendKeys(bankAccount.getZipCode());
        }
        if (bankAccount.getSsn() != null) {
            ssnInput.sendKeys(bankAccount.getSsn());
        }
        if (bankAccount.getUserName() != null) {
            usernameInput.sendKeys(bankAccount.getUserName());
        }
        if (bankAccount.getPassword() != null) {
            passwordInput.sendKeys(bankAccount.getPassword());
        }
        if (bankAccount.getConfirmPassword() != null) {
            confirmPasswordInput.sendKeys(bankAccount.getConfirmPassword());
        }
        if (bankAccount.getAddress() != null) {
            addressInput.sendKeys(bankAccount.getAddress());
        }


        registerButton.click();

    }
}
