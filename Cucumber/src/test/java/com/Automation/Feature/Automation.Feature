Feature: Login function 

  Scenario: User enters valid username and password
    Given Launch the URL for hotel booking
    When User enter "PavithraN" as username
    And User enter "Pavi@2426" as password
    Then User click on the login button
    
  Scenario: User search for the hotel
   Given User selects the location"London"
   When User selects the hotel"Hotel Sunshine"
   And User selects the room type"Super Deluxe"
   And User selects the number of room "1 - One"
   And User selects the adults per room"2 - Two"
   Then User user click on the search button
    
   Scenario: User selects the hotel
    Given User selects the button
    Then User click on continue button
    
    Scenario: User books the hotel
    Given User enters the firstname "Mathi"
    When User enters the secondname "Lalitha"
    And User enters the address "No 2/3 Logaiya Naidu street"
    And User enters the credit card number "1234567809123698"
    And User enters the credit card type "Master Card"
    And User enters the expiry month "August"
    And User enters the expiry year "2023"
    And User enters the CCV number "999"
    Then User clicks on booknow button
    
    

    

    
  



    
