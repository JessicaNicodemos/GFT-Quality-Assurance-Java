package page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
//Locators
    private By emailAddressLocator = By.name("email");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");
    private By tagExerciseLocator = By.tagName("h1");

    public void signin(){
        if (super.isDisplayed(emailAddressLocator)){
            super.type("jessicanicodemos@gmail.com", emailAddressLocator);
            super.type("estSelenium@123", passwordLocator);
            super.click(submitBtnLocator);
        } else {
            System.out.println("email textbox was not present");
        }
    }

    public  String getMyAccountMessage(){
        return  super.getText(tagExerciseLocator);
    }
}
