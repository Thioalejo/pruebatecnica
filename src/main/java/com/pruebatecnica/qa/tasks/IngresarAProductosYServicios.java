package com.pruebatecnica.qa.tasks;

import com.pruebatecnica.qa.userinterfaces.PaginaPersonasUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAProductosYServicios implements Task {

    public IngresarAProductosYServicios(){}

    @Override
    @Step("{0} ingresa a productos y servicios")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPersonasUI.MENU_PRODUCTOS_Y_SERVICIOS)
        );
    }

    public static IngresarAProductosYServicios ingresarAProductosYServicios(){
        return instrumented(IngresarAProductosYServicios.class);
    }

}
