package com.pruebatecnica.qa.tasks;

import com.pruebatecnica.qa.userinterfaces.PaginaPersonasUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAPrestamosDeAutos implements Task {

    public IngresarAPrestamosDeAutos(){}

    @Override
    @Step("{0} ingresa a prestamos de autos")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPersonasUI.CARD_PRESTAMO_DE_AUTO)
        );
    }

    public static IngresarAPrestamosDeAutos ingresarAPrestamosDeAutos(){
        return instrumented(IngresarAPrestamosDeAutos.class);
    }
}
