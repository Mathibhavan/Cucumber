Feature: Shopping Features
  
 
  Scenario: User visits to the shopping site
    Given Launch the URL for shopping site
    When User sign in to their account
    And User enters the email address "mlatha2896@gmail.com"
    And User enters the password "Bhavan$2002"
    Then User clicks on sign in button
    
    Scenario: User selects the required item
    Given User clicks on Tshirt
    When User selects the size
    And User selects the colour
    And User selects the price range
    And User selects the desired shirt
    Then User clicks on add-to-cart button

		Scenario: User conforms the order
		Given User checks the items in cart
		When User conforms the delivey address
		
		
		

 

  