
Feature: Verify login to gmail 
@Gmail
Scenario: Verification of login with invalid username and password
Given Open the gmail application with URL "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin"
And Enter username="prachiganbote18"
When click on "Next"button
Given Enter password="1234"
When click on "Next" button
Then System should show error message "Wrong password. Try again or click Forgot password to reset it."


