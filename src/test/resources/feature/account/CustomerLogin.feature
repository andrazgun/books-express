Feature: Account: Login
Scenario: Customer tries to log in with invalid password on Login page
  Given Customer registers
  When Customer opens Welcome page
  And Customer clicks 'Intra in cont'
  Then Login page is opened
  And All required elements for Login page are displayed
  When Customer submits email "andreigunta@yahoo.com"
  And Customer clicks Email button on Login page
  Then Password field is displayed on Login page
  When Customer submits password "xxx"
  And Customer clicks Password button on Login page
  Then "<passwordMsg>" error message is displayed for password field on Login page