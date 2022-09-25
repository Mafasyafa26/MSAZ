Feature: Register user

  Scenario Outline: Register user
    When User open DEMOQA Web Browser
    And User register input <username> and <email> and <password>
    And User click register button
    Then valid validation

    Examples: 
      | username | email | password |
      | admin 	 | admin@gmail.com | kamsia97 |
      | sadgjd   | idihh@strog.xyz | khdkahim |
      | ujianyaa | wkwkw@yahoo.com | nyvdia.0 |
