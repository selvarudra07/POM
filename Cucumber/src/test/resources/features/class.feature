Feature: Application login for demoqa 

Background: Demoqa website

Given user open the demoqa page

Scenario: Enter in to textbox window

When Need to insert valid inputs

Scenario Outline: Demoqa inputs
When user insert "<name>" and "<emailid>"
And user have to click the submit button

Examples:
|name|emailid|
|ram|qwe@123|
|sri|asd@234|
|jai|lkj@123|