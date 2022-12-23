@Blast
Feature: Blast Automation Testing
  Background: User already login

  @Positive-Open-Menu-Blast
  Scenario: User can open blast menu
    Given User Navigate to Cicle Teams
    When User Click Blast Menu
    Then User successfully on blast menu

  @Positive-Create-Blast-With-Field-Title-And-Description
  Scenario: User Create Blast with Field Title and Description
    Given User Navigate to Cicle Teams
    When User Click Blast Menu
    Then User Click Create Button
    And User Input Title
    And User Input Description
    And User Click Publish Button
    Then Web Close

  @Positive-Create-Blast-With-Empty-Description
  Scenario: User Field Title to Create Blast
    Given User Navigate to Cicle Teams
    When User Click Blast Menu
    Then User Click Create Button
    And User Input Title
    And User Click Publish Button
    Then Notify Successfully Add Blast

  @Negative-Create-Blast-With-Empty-Title-And-Description
  Scenario: User Can not create new blast without field Title
    Given User Navigate to Cicle Teams
    When User Click Blast Menu
    Then User Click Create Button
    And User Click Publish Button
    Then Notify to verify Parameter Cant Empty is Pop up

  @Positive-Archive-Blast
  Scenario: User Archive Blast
    Given User Navigate to Cicle Teams
    When User Click Blast Menu
    Then User Click Blast Post
    And User Click Dot Three
    And User Choose Archive Blast
    And User Click Yes for Archive
    Then Web Close

  @Negative-Create-Blast-With-Empty-Title
  Scenario: User Field Description to Create Blast
    Given User Navigate to Cicle Teams
    When User Click Blast Menu
    Then User Click Create Button
    And User Input Description
    And User Click Publish Button
    Then Web Close


