Feature: Application login check for facebook

Background: Loops
Given User launch the facebook web application

Scenario: Enters the data with the valid inputs 

When User enters the valid username and valid password
And  user needs to click the login button

Scenario Outline: Fb data to be inputs
When User enters "<username>" and "<password>"
And User have to click the  button

Examples:
|username|password|
|abc@gmail.com|123456789|
|exc@gmail.com|987456987|
|zxczx@gmail.com|987478958|