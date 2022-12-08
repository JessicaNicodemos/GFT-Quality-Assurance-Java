package page;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    //Locators
    private By nameAdreesLocator = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=text]:nth-child(2)");
    private By emailAddressLocator = By. cssSelector("#form > div > div > div:nth-child(3) > div > form > input[type=email]:nth-child(3)");
    private  By submitBtnLocator = By.cssSelector("#form > div > div > div:nth-child(3) > div > form > button");
    private By emailLocator = By.id("email");
    //LOCATORS YOUR PERSONAL INFORMATION
    private By genderFemaleLocator = By.id("id_gender2");
    private By customerFisrtNomeLocator = By.id("name");
    private By passWordLocator = By.id("password");
    private By daysLocator = By.id("days");
    private By monthsLocator = By.id("months");
    private By yearsLocator = By.id("years");
    private By neesLetterLocator = By.id("newsletter");
    private By receiveOffersLocator = By.id("optin");
    //LOCATORS YOUR ADDRESS


    public void insertEmailToRegister(){
    if (super.isDisplayed(nameAdreesLocator)){
        type("jessica", nameAdreesLocator);
        type("jessica00123@hmail.com", emailAddressLocator);
        click(submitBtnLocator);
    } else {
        System.out.println("email texbox was not present");
    }
    }

    public String getEmailNewAccount(){
    return super.getTextByAttribute(this.emailLocator, "value");
    }

    public void fillOutForm(){
        this.insertEmailToRegister();
        if (isDisplayed(genderFemaleLocator)){
            super.click(genderFemaleLocator);
            super.type("jessica", customerFisrtNomeLocator);
            super.type("1234@", passWordLocator);

        }
    }
}
