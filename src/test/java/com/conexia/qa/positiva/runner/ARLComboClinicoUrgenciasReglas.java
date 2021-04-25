package com.conexia.qa.positiva.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features = "src/test/resources/features/ARL_RIESGOS_LABORALES/Combo_Clinico/solicitud_servicio_urgencias_reglas.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue = "com.conexia.qa.positiva.step_definitions",
        tags = "@SolicitudUrgencias"
)


public class ARLComboClinicoUrgenciasReglas {

}
