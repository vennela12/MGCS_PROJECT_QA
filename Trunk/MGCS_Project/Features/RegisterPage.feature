Feature: As a User, I would like to Register to Event in MGCS Application 


Background: Test to verify if the user can navigate to valid Url 
	Given User is on Home Page 
	When User clicks on Register button 
	Then Navigate to Registration page 
	
Scenario: Test to verify if the user can enter Atendee information 
	Given The user is on Registration page 
	When The user enters the First Name 
	And  The user enters the Last Name 
	And  The user enters the Title 
	And  The user enters the Company Name 
	And  The user enters the Address1 
	And  The user enters the City 
	And  The user Selects the State 
	And  The user enters the Zip 
	And  The user enters the Work Phone 
	And  The user enters the Email Address 
	And  The user enters the Promotion Code 
	And  The user selects the Category 
	And  The user selects the Alumnus 
	And  The user selects the Fee 
	And  The user selects Terms and Conditions 
	Then The user clicks on Continue button
	
#	Then The user clicks on Add Another button to add more Registrants 
	
	#	Background: Test to verify if the user is on Registration page and second registrant info is open
	#	Given User is on Home Page 
	#	When User clicks on Register button 
	#	Then Navigate to Registration page 
	
	#Scenario: Test to verify for the second Registrant details 
	#	Given The User is on Registration page and second registrant info is open 
	#	When The user enters the First Name 
	#	And  The user enters the Last Name 
	#	And  The user enters the Title 
	#	And  The user enters the Company Name 
	#	And  The user enters the Address1 
	#	And  The user enters the City 
	#	And  The user Selects the State 
	#	And  The user enters the Zip 
	#	And  The user enters the Work Phone 
	#	And  The user enters the Email Address 
	#	And  The user enters the Promotion Code 
	#	And  The user selects the Category 
	#	And  The user selects the Alumnus 
	#	And  The user selects the Fee 
	#	And  The user selects Terms and Conditions 
	#	Then The user clicks on Add Another button to add more Registrants 
	#	
	
	
	
	
	
	
	
	
	
	
	#    Then The user clicks on Continue button
	#	And Clicks ok on alert box	
	#	Then The user clicks Add button to add more Registrants	
	#	Then The User navigates to review details page 
	
	
	
	
	
