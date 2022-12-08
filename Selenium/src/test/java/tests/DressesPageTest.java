package tests;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import page.BasePage;
import page.DressesPage;

public class DressesPageTest {
    private DressesPage dressesPage;
    private final String URL = "https://automationexercise.com/";

    @BeforeEach
    void setUp() throws Exception {
        this.dressesPage = new DressesPage();
        this.dressesPage.visit(this.URL);
    }

    @AfterEach
    void tearDown() throws Exception {
        this.dressesPage.quitWebDriver();
    }

    @Test
    void test (){
        //when
        this.dressesPage.viewCasualDressesPage();
        //then
        Assertions.assertEquals("WOMEN - DRESS PRODUCTS", this.dressesPage.getTitlePage());
        Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));

    }


}
