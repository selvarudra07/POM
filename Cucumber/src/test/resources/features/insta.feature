Feature: Application Login Check for orangehrm page

Background: Application runs on background
Given User launch the orangehrm Web application

Scenario: orangehrm login with valid credentials

When User enters valid username and password
And User must needs to click the login button

Scenario Outline: Invalid inputs
When User insert the "<username>"  "<password>"
And User click the loginbutton

Examples:
|username|password|
|admin|admin123|
|Admin|Admin123|

