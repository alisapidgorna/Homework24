package pages.actions;

import gherkin.lexer.Pa;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.ElectronicsPageLocators;
import pages.locators.MyEbayPageLocators;
import utils.SeleniumDriver;

public class MyEbayPageActions {
    MyEbayPageLocators myEbayPageLocators = null;

    public MyEbayPageActions() {
        this.myEbayPageLocators = new MyEbayPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), myEbayPageLocators);}

    public void moveToMyEbay(){
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(myEbayPageLocators.myEbay).perform();}

    public void clickOnMessages(){myEbayPageLocators.messages.click();}
}