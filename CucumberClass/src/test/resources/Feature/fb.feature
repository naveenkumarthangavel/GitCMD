Feature: To validate facebook functionality using different credentials

Scenario Outline: To validate login using different credentials
Given User should be in facebook login page
When User enter values to emailfield "<emailfield>"  and passwordfield "<passwordfield>"
And User click the login button
Then User quit the browser

Examples:
|emailfield      |passwordfield|
|greens@gmail.com| greens@123  |
|java@gmail.com  |java@123     |
|python@gmail.com|python@425   |
