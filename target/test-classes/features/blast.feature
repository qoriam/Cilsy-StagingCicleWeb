@Test-Blast
Feature: Test Board in Staging Cicle Apps
  Background: User has logged in staging apps
  Scenario: Blast test

@TC41-Invalid-create-blast
Scenario: Invalid create blast
  Given User navigate to blast menu
  When User click create blast
  And User input title blast empty
  And User click publish blast
  Then User failed add blast


@TC43-Invalid-edit-blast
Scenario: Invalid edit blast
  Given User navigate to blast menu
  When User click blast post
  And User click triple dot icon
  And User clear text title blast
  And User click publish blast
  Then User successfully edit title blast

@TC44-Edit-title-blast
Scenario: Edit Title blast
  Given User navigate to blast menu
  When User click blast post
  And User click triple dot icon
  And User edit title blast
  And User click publish blast
  Then User successfully edit title blast

@TC45-Add-comment
Scenario: Add comment
  Given User navigate to blast menu
  When User click blast post
  And User click comment
  And User input comment
  And User click button send comment
  Then User successfully add comment

@TC42-Create-blast
Scenario: Create blast
    Given User navigate to blast menu
    When User click create blast
    And User input title blast
    And User click publish blast
    Then User successfully create blast
