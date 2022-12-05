@Test-Groupchat
Feature: Test Board in Staging Cicle Apps
  Background: User has logged in staging apps
  Scenario: Group chat test

@TC-38-Send-message
Scenario: Send message
  Given User navigate to group chat menu
  When User click chat
  And User input chat
  And User click send message
  Then User successfully send message

  @TC-39-Delete-message
  Scenario: Delete message
    Given User navigate to group chat menu
    When User click chat
    And User input chat
    And User click send message
    Then User successfully send message

@TC-40-Attachment-file
Scenario: Attachment file photo
  Given User navigate to group chat menu
  When User input file
  Then User successfully attachment file

@TC-47-Attachment-file-pdf
  Scenario: Upload file pdf
  Given User navigate to group chat menu
  When User input file pdf
  Then User successfully attachment file

@TC-46-Mention-member-in-chat
Scenario: Mention member in chat
  Given User navigate to group chat menu
  When User click chat
  And User input mention member
  And User click suggestion member
  And User click send message
  Then User successfully mention member

