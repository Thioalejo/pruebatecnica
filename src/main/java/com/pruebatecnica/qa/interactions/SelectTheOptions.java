package com.pruebatecnica.qa.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class SelectTheOptions implements Interaction {

    private Target target;
    private String option;

    public SelectTheOptions(Target target, String option) {
        this.target = target;
        this.option = option;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(target),
                Click.on("//span[text()='"+option+"']")
        );

    }
    public static SelectTheOptions byVisibleText(Target target, String option){
        return Tasks.instrumented(SelectTheOptions.class, target,option);
    }
}
