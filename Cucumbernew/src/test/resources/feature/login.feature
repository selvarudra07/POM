Feature: Need to open the facebook page

Background: fb website

Given User open the facebook login page url

Scenario: Open the browser and login the page

When User enters the email and password


Scenario Outline: More input datas
When user enter "<username>" and  "<password>"
And user click the login button

Examples:
|username|password|
|ram@gmail.com|qwe@123|
|sri@gmail.com|asd@234|
|jai@gmail.com|lkj@123|