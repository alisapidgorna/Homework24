
@first-TestCase @outline-TestCase
Feature: Creating an account
  As a client I want to open smart-fox.com.ua
  and to click on Login
  and to enter Email and Password

  Scenario Outline: Creating an account in smart-fox.com.ua
    Given I am on the Home Page "https://smart-fox.com.ua/" of our site
    And I am clicking on "Login" link
    And I enter <Email> and <Password>

    Examples:
      | Email | Password |
      | elizaveta.vtoraya@test.ua | eli12345zaveta |
      | ivanovna.h.f.d.k.k@test.ua | Savch123enko |
      | ostap.markiv@test.ua | ostap12345m |
      | elis.bondarchuk@test.ua | eli12345bondarchuk |
      | m.k.@test.ua | m123kalinina |
