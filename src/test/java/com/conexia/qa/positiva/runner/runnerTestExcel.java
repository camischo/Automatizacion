package com.conexia.qa.positiva.runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;

@RunWith(RunnerPersonalizado.class)
@CucumberOptions(
        features = "src/test/resources/features/avianca_show_flight_with_external_data.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue = "com.conexia.qa.positiva.step_definitions" ,tags = "@tag1"
)




public class runnerTestExcel {

}
