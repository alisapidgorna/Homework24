
 @second-TestCase
 Feature: Submitting price in Art Supplies
  As a client I want to open ebay.com
  and navigate to Home and Garden menu
  and to click on Art Supplies link
  and to put from 7$ till 12$ in "Price" list
  and to click on "Submit price button"

  Scenario: Submitting price from 7$ till 12$ in Art Supplies of Home and Garden page
     Given I am on the Home Page "https://www.ebay.com" of our site
     When I am moving to the "Home and Garden" menu
     And I click on "Art Supplies" link
     And I put from 7$ till 12$ in "Price" list
     Then I click on "Submit price button"
