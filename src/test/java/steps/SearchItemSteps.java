package steps;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.formatter.model.ScenarioOutline;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.actions.CreateAnAccountPageActions;
import pages.actions.HomeAndGardenPageActions;
import pages.actions.HomePageActions;
import utils.SeleniumDriver;
import java.util.List;

public class SearchItemSteps {
    //below are objects of pages for accessing the methods in them
    HomePageActions homePageActions = new HomePageActions();
    HomeAndGardenPageActions homeAndGardenPageActions = new HomeAndGardenPageActions();
    CreateAnAccountPageActions createAnAccountPageActions = new CreateAnAccountPageActions();

    @Given("^I am on the Home Page \"([^\"]*)\" of our site$")
    public void i_am_on_the_Home_Page_of_our_site(String websiteURL) throws Throwable {
        SeleniumDriver.openPage(websiteURL);
    }

    @When("^I move to the menu$")
    public void i_move_to_the_menu(List<String> list) throws Throwable {
        // List<String> list - this is a list of our Menu options from feature file
        String menu = list.get(1);
        homePageActions.moveToElectronicsMenu();
    }

    @And("^click on \"([^\"]*)\" link$")
    public void click_on_link(String arg1) throws Throwable {
        homePageActions.clickOnCameraDronesMenu();
    }

    @And("^user clicks on \"([^\"]*)\" link$")
    public void userClicksOnLink(String arg0) throws Throwable {

        homePageActions.clickOnAdvancedSearching();
    }
    @Then("^I should get title of the page as \"([^\"]*)\"$")
    public void iShouldGetTitleOfThePageAs(String expectedTitle) throws Throwable {
        String actualPageTitle = SeleniumDriver.getDriver().getTitle();
        System.out.println("Actual title: " + actualPageTitle);
        System.out.println("Expected title: " + expectedTitle);
        Assert.assertEquals(actualPageTitle, expectedTitle);
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^I move to the \"([^\"]*)\" menu$")
    public void iMoveToTheMenu(String arg0) throws Throwable {
       homePageActions.moveToMyEbay();
    }

    @Then("^by clicking on \"([^\"]*)\" I open \"([^\"]*)\" page$")
    public void byClickingOnIOpenPage(String arg0, String arg1) throws Throwable {
        homePageActions.clickOnMessages();
    }

    @And("^I click on \"([^\"]*)\" link$")
    public void iClickOnLink(String arg0) throws Throwable {
        homePageActions.clickOnArtSuppliesMenu();
    }

    @When("^I am moving to the \"([^\"]*)\" menu$")
    public void iAmMovingToTheMenu(String arg0) throws Throwable {
        homePageActions.moveToHomeAndGardenMenu();
    }

    @And("^I put from (\\d+)\\$ till (\\d+)\\$ in \"([^\"]*)\" list$")
    public void iPutFrom$Till$InList(int arg0, int arg1, String arg2) throws Throwable {
        SeleniumDriver.getDriver().findElement(By.xpath("//*[@id=\"s0-29-13_2-0-1[1]-0-6-0-3[2]-textrange\"]/div/div[1]/div/input")).sendKeys("7");
        SeleniumDriver.getDriver().findElement(By.xpath("//*[@id=\"s0-29-13_2-0-1[1]-0-6-0-3[2]-textrange\"]/div/div[2]/div/input")).sendKeys("12");
    }

    @Then("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        homeAndGardenPageActions.clickOnPriceButtonLink();
    }

    @And("^I am clicking on \"([^\"]*)\" link$")
    public void iAmClickingOnLink(String arg0) throws Throwable {
        createAnAccountPageActions.clickOnLoginLink();
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterEmailAndPassword(String Email, String Password) {
        SeleniumDriver.getDriver().findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/section[1]/div[1]/div[2]/input")).sendKeys(Email);
        SeleniumDriver.getDriver().findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/section[1]/div[2]/div[2]/input")).sendKeys(Password);
        System.out.println("Email is:    " + Email);
        System.out.println("Password is: " + Password);
    }
}
