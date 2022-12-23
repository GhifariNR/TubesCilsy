@GroupChat
Feature: Group Chat Automation Testing
  Background: User already login

  @Positive-Open-Menu-GroupChat
  Scenario: User Can Open GroupChat Menu
    Given User Navigate to Cicle Staging
    When User Click GroupChat Menu
    Then Close Webs

  @Positive-Send-Message
  Scenario: User Success Send Message
    Given User Navigate to Cicle Staging
    When User Click GroupChat Menu
    And User Input Message
    And User Click Submit Button
    Then Close Webs

  @Positive-Mention-Member
  Scenario: User Success Mention Person
    Given User Navigate to Cicle Staging
    When User Click GroupChat Menu
    And User Input Message
    And User Input @ Message
    And User Click People in shown
    And User Click Submit Button
    Then Close Webs

  @Positive-Upload-File
  Scenario: User Upload File Image
    Given User Navigate to Cicle Staging
    When User Click GroupChat Menu
    And User Upload Attachment
    Then Close Webs

  @Negative-Send-Empty-Message
  Scenario: User Cant Send Empty Message
    Given User Navigate to Cicle Staging
    When User Click GroupChat Menu
    And User Click Submit Button
    Then Close Webs