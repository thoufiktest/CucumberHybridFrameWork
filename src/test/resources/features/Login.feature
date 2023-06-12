Feature: Test For login
  I want to use this template for my feature file

  
  Scenario: Validate Login Features
   Given I open the url "https://format-ui-qa.nonprod.programming.disney.com/format/"
   When I enter as "test180@disney.com" in the field Company email
   And I click on button "Next"
   And I enter "Mickeyminnie123" in the field  Password
   And I click on the button "LOGIN WITH MY ID"
   Then I succesfully login to the application    
 

