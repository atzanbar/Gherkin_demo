#Auto generated Octane revision tag
@TID2081REV0.2.0
Feature:
Scenario: user input user name
  Given user navigates to login page
  When user clicks on the user name textbox and inputs "alon.zanbar@hpe.com" 
  Then user should see "user name verified"