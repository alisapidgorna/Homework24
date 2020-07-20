package pages.actions;

import gherkin.lexer.Pa;
import okio.ByteString;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.CreateAnAccountPageLocators;
import pages.locators.ElectronicsPageLocators;
import pages.locators.MyEbayPageLocators;
import utils.SeleniumDriver;

public class CreateAnAccountPageActions {
    CreateAnAccountPageLocators createAnAccountPageLocators = null;

    public CreateAnAccountPageActions() {
        this.createAnAccountPageLocators = new CreateAnAccountPageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), createAnAccountPageLocators);}

    public void clickOnLoginLink(){createAnAccountPageLocators.loginLink.click();}

}