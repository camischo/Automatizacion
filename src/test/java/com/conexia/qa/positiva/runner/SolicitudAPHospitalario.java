package com.conexia.qa.positiva.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ACCIDENTES/solicitud_servicio_ap_hospitalizacion.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue = "com.conexia.qa.positiva.step_definitions",
        tags = "@SolicitudAPHospitalarioUnPaqueteInternacion"
)


public class SolicitudAPHospitalario {

}