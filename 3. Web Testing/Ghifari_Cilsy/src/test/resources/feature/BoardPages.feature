  @Board
  Feature: Board Automation Testing
    Background: User already login

    @Positive-Add-List
    Scenario: User Add New List
      Given User Navigate to Cicle
      When User Click Board Menu
      And User Click Add List Button
      And User Input Board List
      And User Click Board List Button
      Then Verify Success Add List
      Then Close Web

    @Positive-Add-Card
    Scenario: User Add New Card
      Given User Navigate to Cicle
      When User Click Board Menu
      And User Click Add Card Button
      And User Input Card
      And User Click New Card Button
      Then Verify Success Add Card

    @Positive-Set-Complete-List-Card
    Scenario: User Set Complete List Card
      Given User Navigate to Cicle
      When User Click Board Menu
      And User Click Dot Three Card Name
      And User Click Set Complete List Card
      Then Verify Complete Card is Success
      Then Close Web

  @Negative-Add-Empty-Card
  Scenario: User Cant Empty Card
  Given User Navigate to Cicle
  When User Click Board Menu
  And User Click Add Card Button
  And User Click New Card Button
  Then Verify Card Name Cant Empty

    @Positive-Open-Menu-Board
    Scenario: User Can Open Board Menu
      Given User Navigate to Cicle
      When User Click Board Menu
      Then Close Web

    @Negative-Add-Empty-Card-List
    Scenario: User Cant Add Card with empty input
      Given User Navigate to Cicle
      When User Click Board Menu
      And User Click Add List Button
      And User Click Board List Button
      Then Verify List Cant Empty
      Then Close Web

