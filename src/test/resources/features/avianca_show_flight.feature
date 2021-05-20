Feature: book your flight

  @tag1
  Scenario Outline: book your flight one way
    Given I start page avianca.com
    When i fill out the form, book your flight one way <from> and <to> and <dateToGo> and <day> and <howTravel> and <adults> and <children> and <babys>
    And i select your outbound flight
    Then i can see the flight

    Examples: 
      | from   | to     | dateToGo   | day          | howTravel       | adults | children | babys |
      | Bogotá | Cúcuta | 2021-05-22 | Sáb, 22 may. | Clase Económica |      2 |        3 |     4 |
