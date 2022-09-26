Feature: shop demo qa login page

  Scenario Outline: Login user
   	When Open Web Browser
    And User login invalid <username> and <password> or A
    And User click button login
    Then invalid validation

    Examples: 
      | username  | password 		|
      | kamu 	  | maafkamusiapa 	|
      | kamoe 	  | siapayakamuhehe     |
      | kamuuu 	  | kamurandom          |
      | youkam	  | manusiakuat 	|
      | iniujian  | kamukamukamu 	|
      
