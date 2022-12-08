package page;

import org.openqa.selenium.By;

public class DressesPage extends BasePage{

    private By menuDressesLocator = By.cssSelector("#accordian > div:nth-child(1) > div.panel-heading > h4 > a");
    private By subMenuCasualDressesLocator = By.cssSelector("#Women > div > ul > li:nth-child(1) > a");
    private By titlePageCasualDressesLocator = By.className("title text-center");

    public void viewCasualDressesPage(){
        if (super.isDisplayed(menuDressesLocator)){
            super.actionMoveToElementPerform(menuDressesLocator);
            super.actionMoveToElementClickPerform(subMenuCasualDressesLocator);
        } else {
            System.out.println("menu dresses was not found");
        }
    }

    public String getTitlePage(){
        return super.getText(titlePageCasualDressesLocator);
    }

}
