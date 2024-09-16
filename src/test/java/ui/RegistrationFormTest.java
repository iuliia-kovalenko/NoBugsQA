package ui;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ui.datas.BankAccount;
import ui.pages.MainPage;
import ui.pages.RegisterAccountPage;
import utils.RandomData;

public class RegistrationFormTest {
    @BeforeAll
    public static void setupUiTests() {
        Configuration.baseUrl = "https://parabank.parasoft.com";
//        Configuration.browser = "chrome";
//        Configuration.timeout = 10;
    }


    @Test
    public void useCanNotCreateAccountWithFirstNameOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .firstName(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithLastNameOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .lastName(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithNameAndSurnameOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .firstName(RandomData.randomString())
                .lastName(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));

    }

    @Test
    public void useCanNotCreateAccountWithAddressOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .address(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithCityOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .city(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithStateOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .state(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithZipCodeOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .zipCode(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithSsnOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .ssn(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithUserNameOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .userName(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithUserPasswordOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .password(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getConfirmPasswordError().shouldHave(Condition.exactText("Password confirmation is required."));
    }

    @Test
    public void useCanNotCreateAccountWithUserConfirmPasswordOnly() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        BankAccount bankAccount = BankAccount.builder()
                .confirmPassword(RandomData.randomString())
                .build();
        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        registerAccountPage.getFirstNameError().shouldHave(Condition.exactText("First name is required."));
        registerAccountPage.getLastNameError().shouldHave(Condition.exactText("Last name is required."));
        registerAccountPage.getAddressError().shouldHave(Condition.exactText("Address is required."));
        registerAccountPage.getCityError().shouldHave(Condition.exactText("City is required."));
        registerAccountPage.getStateError().shouldHave(Condition.exactText("State is required."));
        registerAccountPage.getZipCodeError().shouldHave(Condition.exactText("Zip Code is required."));
        registerAccountPage.getSsnError().shouldHave(Condition.exactText("Social Security Number is required."));
        registerAccountPage.getUsernameError().shouldHave(Condition.exactText("Username is required."));
        registerAccountPage.getPasswordError().shouldHave(Condition.exactText("Password is required."));
    }

    @Test
    public void successfulRegistration() {
        // Подготовка страницы
        RegisterAccountPage registerAccountPage = new RegisterAccountPage();
        registerAccountPage.open();
        // Подготовка данных

        String password = RandomData.randomString();

        BankAccount bankAccount = BankAccount.builder()
                .firstName(RandomData.randomString())
                .lastName(RandomData.randomString())
                .city(RandomData.randomString())
                .state(RandomData.randomString())
                .zipCode(RandomData.randomString())
                .address(RandomData.randomString())
                .ssn(RandomData.randomString())
                .userName(RandomData.randomString())
                .password(password)
                .confirmPassword(password)
                .build();

        // Шаги
        registerAccountPage.register(bankAccount);

        //Проверка ожидаемого результата
        MainPage mainPage = new MainPage();
        mainPage.getWelcomeTitle().shouldHave(Condition
                .exactText("Welcome " + bankAccount.getUserName()));
        mainPage.getWelcomeText().shouldHave(Condition
                .exactText("Your account was created successfully. You are now logged in."));
        mainPage.getWelcomeFirstLastName()
                .shouldHave(Condition
                        .exactText("Welcome " + bankAccount.getFirstName() + " " + bankAccount.getLastName()));

    }


}
