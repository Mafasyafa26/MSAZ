Feature: shop demo qa login page

  Scenario Outline: Login user
   	When User open DEMOQA Web Browser
    And User login invalid <username> and <password>
    And User click button login
    Then invalid validation

    Examples: 
      | username  | password 				|
      | kamu 			| maafkamusiapa 	|
      | kamoe 		| siapayakamuhehe |
      | kamuuu 		| kamurandom 			|
      | youkam		| manusiakuat 		|
      | iniujian	| kamukamukamu 		|
      
