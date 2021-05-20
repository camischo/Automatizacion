package com.conexia.qa.positiva.step_definitions;

import com.entity.qa.step.AviancaTravel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class CalculatorSteps {

	@Steps
	AviancaTravel avianca;

	@Given("^I start page avianca.com$")
	public void iInitTheCalculator() {
		avianca.initPage();
	}
	
	@When("^i fill out the form, book your flight one way (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and (.+) and (.+)$")
	public void iFillOutTheFormBookYourFlightOneWay(String from, String to, String date, String day, String howTravel,String adults, String childs, String babys) {
		avianca.fillFormWay(from, to, date, day, howTravel, adults, childs, babys);
	}

	@When("i select your outbound flight")
	public void iSelectYourOutboundFlight() {
		avianca.selectSecondRow();
	}

	@Then("i can see the flight")
	public void iCanSeeTheFlight() {
		avianca.canSeeTheFligh();
	}


}
