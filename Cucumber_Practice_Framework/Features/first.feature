Feature: login

  Scenario: login into Orange HRM with Valid Credential
    Given user launch chrome browser
    When to open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    Then user enter Valid Username "Admin" and Password "admin123"
    And click on login btn
    Then verify the Title "Dashboard"
    And Close the Browser

 # Scenario Outline: login into Orange HRM with InValid Credential
  #  Given user launch chrome browser
  #  When to open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  #  Then user enter Valid Username "<username>" and Password "<password>"
  #  And click on login btn
  #  Then verify the Title "Dashboard"
  #  And Close the Browser
#Examples:
#|username|password|
#|Admin|admin123|
#|Admin|admin@123|
#|admin|admin123|