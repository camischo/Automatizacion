package com.conexia.qa.positiva.step_definitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import com.entity.qa.drivers.OwnWebDriver;
import com.entity.qa.questions.TheResult;
import static org.hamcrest.Matchers.equalTo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;

public class CalculatorSteps {

	@Given("I init the calculator")
	public void iInitTheCalculator() {
		OnStage.setTheStage(Cast.ofStandardActors());
		OnStage.theActorCalled("Christian");
		theActorInTheSpotlight().can(BrowseTheWeb.with(OwnWebDriver.withChrome().setURL("http://google.com")));
		OnStage.theActorInTheSpotlight().attemptsTo(null);
	}

	@When("sum {int} and {int}")
	public void sumAnd(Integer int1, Integer int2) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("i see the result is {int}")
	public void iSeeTheResultIs(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		theActorInTheSpotlight().should(GivenWhenThen.seeThat(TheResult.is(), equalTo(int1)));
	}

}
