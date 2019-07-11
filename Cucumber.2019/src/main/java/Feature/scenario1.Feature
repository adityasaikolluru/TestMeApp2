
@tag
Feature: Register to testme app
  I want to use this template for my feature file

  @tag1
  Scenario: registeration
    Given user shall launch the testeapp url
    And user clicks on signup
    When user provides valid details
    And user clicks on register
   Then user directed to login page

  #@tag2
 # Scenario Outline: Title of your scenario outline
 #   Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

 #   Examples: 
   #   | name  | value | status  |
  #    | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
