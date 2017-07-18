#Auto generated Octane revision tag
@TID2125REV0.2.0
Feature: username text box
Scenario: user input user name
  Given user navigates to login page
  When user clicks on the user name textbox and inputs "alon.zanbar@hpe.com" 
  Then user should see "user name verified"