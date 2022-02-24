package com.pruebatecnica.qa.tasks;

import com.pruebatecnica.qa.userinterfaces.PaginaPersonasUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarATasasYTarifas implements Task {

    public IngresarATasasYTarifas(){}

    @Override
    @Step("{0} ingresa a tasas y tarifas")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPersonasUI.MENU_TASAS_Y_TARIFAS)
        );
    }

    public static IngresarATasasYTarifas ingresarATasasYTarifas(){
        return instrumented(IngresarATasasYTarifas.class);
    }

}
