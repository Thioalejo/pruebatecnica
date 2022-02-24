package com.pruebatecnica.qa.tasks;

import com.pruebatecnica.qa.userinterfaces.PaginaPersonasUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DescargarPDF implements Task {

    public DescargarPDF(){}

    @Override
    @Step("{0} da clic en el icono para descargar PDF de prohibiciones")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaPersonasUI.ICONO_PDF_PROHIBICIONES)
        );
    }

    public static DescargarPDF descargarPDF(){
        return instrumented(DescargarPDF.class);
    }
}
