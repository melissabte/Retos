Feature: Lookup a definition
  In order to talk better
  As an English student
  I want to look up word definitions

  Scenario: Looking up the definition of 
    Given buscar en youtube
    When ingresar nombre video 'no te vayas todavia'
    And el usuario escoge el video 
    And el usuario va a compartir el video
    And click en google
    And ingresar correo 'email'
    And ingresar contraseña 'password'
    And publicar video