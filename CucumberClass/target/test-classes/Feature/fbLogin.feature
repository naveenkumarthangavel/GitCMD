Feature: To validate the login functionality of facebook


Scenario:  To validate the login function using invalid credentials
Given User must be in the facebook login page
When  User enter the invalid username and invalid password
|greens|greens96@gamil.com|9750123578|
And User click the login button
Then User must be in invalid page
  

