Feature: book your flight

  @tag1
  Scenario Outline: book your flight one way
    Given I start page avianca.com
    When i fill out the form, book your flight one way <from> and <to> and <dateToGo> and <day> and <howTravel> and <adults> and <children> and <babys>
    And i select your outbound flight
    Then i can see the flight

    Examples: 
      | data |
			##@externaldata@./src/test/resources/datadriven/avianca_show_flight_with_external_data.xlsx@create
