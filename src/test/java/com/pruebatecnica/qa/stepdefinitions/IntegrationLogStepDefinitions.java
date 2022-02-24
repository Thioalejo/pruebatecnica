package com.pruebatecnica.qa.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.steps.ScenarioActor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import com.pruebatecnica.qa.tasks.*;
import com.pruebatecnica.qa.utils.drivers.OwnRemoteWebDriver;
import com.pruebatecnica.qa.utils.misc.GetDirections;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.abilities.BrowseTheWeb.with;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.junit.Assert.assertEquals;


public class IntegrationLogStepDefinitions extends ScenarioActor {

    @Before
    public void beforeTest() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Johnny");
    }

    @Given("^que ingreso a la pagina de (.*) url$")
    public void heIsOnUrl(String module) {
        theActorInTheSpotlight().can(
                with(OwnRemoteWebDriver.hisBrowserWeb().on(GetDirections.of(module))));
    }

    @When("^ingrese a productos y servicios$")
    public void heSelects() {
        theActorInTheSpotlight().attemptsTo(
                IngresarAProductosYServicios.ingresarAProductosYServicios()
        );
    }

    @And("^seleccione prestamos$")
    public void seleccionePrestamos() {
        theActorInTheSpotlight().attemptsTo(
                IngresarAPrestamos.ingresarAPrestamos()
        );
    }

    @And("^cuando ingrese a prestamos de auto$")
    public void cuandoIngreseAPrestamosDeAuto() {
        theActorInTheSpotlight().attemptsTo(
                IngresarAPrestamosDeAutos.ingresarAPrestamosDeAutos()
        );
    }

    @Then("^deberia poder validar que se genere el pdf de manera correcta$")
    public void deberiaPoderValidarQueSeGenereElPdfDeManeraCorrecta() {
        theActorInTheSpotlight().attemptsTo(
                IngresarATasasYTarifas.ingresarATasasYTarifas(),
                DescargarPDF.descargarPDF()
        );
    }
}
