package com.pruebatecnica.qa.runners;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/descargar_pdf_de_prohibiciones.feature",
        glue = "com.pruebatecnica.qa.stepdefinitions",snippets = CAMELCASE
)

public class RunDescargaDePDF {
}
