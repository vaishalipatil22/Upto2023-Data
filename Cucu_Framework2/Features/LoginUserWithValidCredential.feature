Feature: Login Functinality

  @TC-01
  Scenario: Login User with correct email and password
    Given User Launch Browser
    When Navigate to  url
    Then Verify that Homepage is visible successful validate title as "Automation Exercise"
    And Click on Signup / Login button
    When Verify 'Login to your account' is visible
    Then Enter correct email "qa1@gmail.com" address and "qa1@gmail.com" password
    And Click login button
    And Validate the Logged in as text

	@TC-02
  Scenario: Login User with incorrect email and password
    Given User Launch Browser
    When Navigate to  url
    Then Verify that Homepage is visible successful validate title as "Automation Exercise"
    And Click on Signup / Login button
    When Verify 'Login to your account' is visible
    Then Enter correct email "qa@gmail.com" address and "q@gmail.com" password
    And Click login button
    And Validate the Logged in as text

	@TC-03
  Scenario Outline: Login User with valid and invalid credential.
    Given User Launch Browser
    When Navigate to  url
    Then Verify that Homepage is visible successful validate title as "Automation Exercise"
    And Click on Signup / Login button
    When Verify 'Login to your account' is visible
    Then Enter correct email "<username>" address and "<password>" password
    And Click login button
    And Validate the Logged in as text
    
    Examples: 
    |username|password|
    |qa1@gmail.com|qa1@gmail.com|
    |qa2@gmail.com|qa2@gmail.com|
    |qa3@gmail.com|qa3@gmail.com|
    |qa2@gmail.com|qa3@gmail.com|
    |qa@gmail.com|q@gmail.com|
