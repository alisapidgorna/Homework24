
  @third-TestCase
  Feature: Opening Email page throw My Ebay
    As a client I want to open ebay.com
    and navigate to My Ebay
    and to click on Messages
    and to open Email page

  Scenario: Opening Email page throw Messages in My Ebay
     Given I am on the Home Page "https://www.ebay.com" of our site
     When I move to the "My Ebay" menu
     Then by clicking on "Messages" I open "Email" page
