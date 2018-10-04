Feature: Login into account
	Existing stackoverflow user should be able to login into account with its valid credentials
	
Scenario: Login into account with correct credentials
	Given User navigates to stackoverflow web page
	And User clicks the Login button
	And User enters valid username
	And User enters valid password
	When User click onto LogIn button
	Then User should be taken to the successfull login page 