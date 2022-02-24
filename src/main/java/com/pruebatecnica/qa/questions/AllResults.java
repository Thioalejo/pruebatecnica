package com.pruebatecnica.qa.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.TextContent;

import java.util.List;

import com.pruebatecnica.qa.userinterfaces.CommonsUI;

//import static com.pruebatecnica.qa.userinterfaces.CommonsUI.DATATIME;
import static java.time.Duration.ofSeconds;

public class AllResults implements Question<List<String>> {
    private String field;

    public AllResults(String field) {
        this.field = field;
    }

    @Override
    public List<String> answeredBy(Actor actor) {
        return null;
    }
}
