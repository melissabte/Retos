package com.accenture.gmail.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;


import com.accenture.gmail.ui.Destinatario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Ingresardestinatario implements Task {

	 private final String destinatario;

	    protected Ingresardestinatario(String destinatario) {
	        this.destinatario= destinatario;
	    }

	    @Step("Destinatario for #destinatario")
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(
	                Enter.theValue(destinatario)
	                     .into(Destinatario.DESTINATARIO)
	                     .thenHit(ENTER)
	        );}
	    public static Ingresardestinatario forTheTerm(String destinatario) {
	        return instrumented(Ingresardestinatario.class, destinatario);
	    }

}
