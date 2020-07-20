#here are comments
#below is a tag for identifying of specific tests

 @four-TestCase
 Feature: Opening ebay.com
  As a client I want to open ebay.com
  and navigate to Electronics menu
  and open Camera Drones menu option
  and to click on "Advanced" link
  and to get title of the page as "eBay Search: Advanced Search"

  Scenario: Opening menu option Camera Drones by hovering mouse on Electronics menu
     Given I am on the Home Page "https://www.ebay.com" of our site
     When I move to the menu
      | Menu          |
      | Electronics   |
      | Fashion       |
     And click on "Camera Drones" link
     And user clicks on "Advanced" link
     Then I should get title of the page as "eBay Search: Advanced Search"
