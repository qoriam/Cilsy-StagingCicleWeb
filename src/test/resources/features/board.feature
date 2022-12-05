@Test-Board
Feature: Test Board in Staging Cicle Apps
  Background: User has logged in staging cicle apps

@TC-32-Invalid-add-listboard-empty-name
Scenario: Invalid Add ListBoard Empty Name
  Given User navigate to board menu
  When User click add list
  And User click button create board
  Then User failed add listboard


@TC-33-Add-listboard
Scenario: Add list board
  Given User navigate to board menu
  When User click add list
  And User input listname
  And User click button create board
  Then User successfully add list board


@TC-34-Invalid-add-card
Scenario: Invalid add card
  Given User navigate to board menu
  When User click add card
  And User click button create card
  Then User failed add card


@TC-35-Add-card-success
Scenario: Add card success
  Given User navigate to board menu
  When User click add card
  And User input name card
  And User click button create card
  Then User successfully add card


@TC-37-Edit-name-board
Scenario: Edit name board
  Given User navigate to board menu
  When User click name board
  And User clear text name
  And User edit name board
  Then User successfully edit name board


@TC-36-Edit-name-with-tomuchchara
Scenario: Invalid edit name board
  Given User navigate to board menu
  When User click name board
  And User clear text name
  And User edit name with many character
  Then User successfully edit name board


@TC_06-Add-comment-in-card
Scenario: Add comment in card
  Given User navigate to board menu
  When User click card
  And User click comment board
  And User input comment board
  And User click button post
  Then User successfully comment board



#@TC-31-Open-Board
#  Scenario: Open Board
#    Given User navigate to board menu
#    Then User can see can see Kanban Board


