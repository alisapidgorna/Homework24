package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageLocators {

    @FindBy(how= How.LINK_TEXT, using = "Electronics")
    public WebElement electronicsLink;

    @FindBy(how = How.LINK_TEXT, using = "Camera Drones")
    public WebElement cameraDronesMenuLink;

    @FindBy(how = How.LINK_TEXT, using = "Advanced")
    public WebElement advancedLink;



    @FindBy(how =How.LINK_TEXT, using = "My eBay")
    public WebElement myEbay;

    @FindBy(how =How.LINK_TEXT, using = "Messages")
    public WebElement messages;



    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")
    public WebElement homeAndGardenLink;

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[9]/div[2]/div[1]/div[2]/ul/li[5]/a")
    public WebElement artSuppliesLink;

}