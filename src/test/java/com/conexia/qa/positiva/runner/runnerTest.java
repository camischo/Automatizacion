package com.conexia.qa.positiva.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/avianca_show_flight.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue = "com.conexia.qa.positiva.step_definitions" ,tags = "@tag1"
)


public class runnerTest {

}
