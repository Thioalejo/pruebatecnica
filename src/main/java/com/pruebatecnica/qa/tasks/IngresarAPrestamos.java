package com.pruebatecnica.qa.tasks;

import com.pruebatecnica.qa.userinterfaces.PaginaPersonasUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAPrestamos implements Task {

    public IngresarAPrestamos(){}

    @Override
    @Step("{0} ingresa a prestamos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPersonasUI.TEXT_LINK_PRESTAMOS)
        );
    }

    public static IngresarAPrestamos ingresarAPrestamos(){
        return instrumented(IngresarAPrestamos.class);
    }

}
