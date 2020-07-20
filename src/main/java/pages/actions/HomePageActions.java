package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages.locators.HomePageLocators;
import utils.SeleniumDriver;

public class HomePageActions {
    HomePageLocators homePageLocators = null;
    public HomePageActions () {
        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(SeleniumDriver.getDriver(), homePageLocators); }

    //we are creating methods for interactions with elements
    public void moveToElectronicsMenu(){
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(homePageLocators.electronicsLink).perform(); }
    public void clickOnCameraDronesMenu(){
        // before this action need to hover mouse on Electronics Menu link on Home Page
        //by invoking method moveToElectronicsMenu();
        homePageLocators.cameraDronesMenuLink.click();}
    public void clickOnAdvancedSearching() {
        homePageLocators.advancedLink.click();
    }



    public void moveToMyEbay(){
        Actions action = new Actions(SeleniumDriver.getDriver());
        action.moveToElement(homePageLocators.myEbay).perform(); }
    public void clickOnMessages(){homePageLocators.messages.click();}



    public void moveToHomeAndGardenMenu(){
        Actions action1 = new Actions(SeleniumDriver.getDriver());
        action1.moveToElement(homePageLocators.homeAndGardenLink).perform(); }
    public void clickOnArtSuppliesMenu(){homePageLocators.artSuppliesLink.click(); }
}
