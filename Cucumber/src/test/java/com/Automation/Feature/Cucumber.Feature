Feature: Login function 
  
Scenario: User enter valid username and password
    Given Launch the URL for hotel booking
    When User enter "PavithraN" as username
    And User enter "Pavi@2426" as password
    And User click on the login button
    Then User validate the entred username and password

Scenario Outline:User User enter valid username and password
  Given Launch the URL for hotel booking
    When User enter <username> as username
    And User enter <password> as password
    And User click on the login button
    Then User validate the entred username and password
    
    Examples:
			|username|password |
			|Mathi| lalu23656|
			|Bhavan| BB@26952|
			|Mathu| njhj53|
    


 
  