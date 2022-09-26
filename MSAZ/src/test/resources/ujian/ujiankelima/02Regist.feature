Feature: Regis user acc

  Scenario Outline: Registrasi user
    When User open DEMOQA Web Browser
    When User register <username> <email> <password> orx k
    When User click register button
    Then valid validation

#User register input (.*) and (.*) and (.*)  orx k
#user_register_input_username_and_email_and_password_orx_k
#User register input <username> and <email> and <password> orx k
    Examples: 
      | username | email | password |
      | admin 	 | admin@gmail.com | kamsia97 |
      | sadgjd   | idihh@strog.xyz | khdkahim@3|
      | ujianyaa | wkwkw@yahoo.com | nyvdia.N0 |
