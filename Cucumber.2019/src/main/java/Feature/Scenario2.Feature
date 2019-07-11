
@tag
Feature: Testmeapp login for a registered user
  I want to use this template for my feature file

 

  @tag1
  Scenario Outline: Successful login of a registered user
    Given user launches the browser
    And user then clicks on signin button
    When user enters "<username>" and "<password>"
    And user clicks on login button
    Then user is directed to testme app home page

    Examples: 
      | username     |  password    |
      | lalitha      |  password123 |
      | aditya147    |  pass123     |
