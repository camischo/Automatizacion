@tag
Feature: Iniciar sesión en gmail

  @tag1
  Scenario: iniciar sesion con un usuario de dominio gmail
    Given Acces to page gmail.com
    And Fill form session init
    When i init session
    Then i see the email
    And i have a mail new
