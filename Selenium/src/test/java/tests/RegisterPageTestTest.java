package tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import page.RegisterPage;

import static org.junit.jupiter.api.Assertions.*;

class RegisterPageTestTest {
    private RegisterPage registerPage;
    private final String RUL = "https://automationexercise.com/login";

    @BeforeEach
    void setUp() throws Exception {
        this.registerPage = new RegisterPage();
        this.registerPage.visit(this.RUL);
    }

    @AfterEach
    void tearDown() throws Exception {
        //this.registerPage.quitWebDriver();
    }

    @Test
    void test(){
        //when
        this.registerPage.insertEmailToRegister();
        //then
        String expected = "jessica00123@hmail.com";
        String actual = this.registerPage.getEmailNewAccount();
        Assertions.assertEquals(expected, actual);
    }
}