package tests;

import org.junit.jupiter.api.*;
import page.LoginPage;

public class LoginPageTest {
    private LoginPage loginPage;
    private final String URL = "https://automationexercise.com/login";

    @BeforeEach
    void setUp() throws Exception {
        this.loginPage = new LoginPage();
        this.loginPage.visit(this.URL);
    }

    @AfterEach
    void tearDown() throws Exception {
       // this.loginPage.quitWebDriver();
    }

    @Test
    void name() {
        //when
        this.loginPage.signin();

        //then
        Assertions.assertTrue(this.loginPage.getMyAccountMessage().equals("Exercise"));
        Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
    }
}
