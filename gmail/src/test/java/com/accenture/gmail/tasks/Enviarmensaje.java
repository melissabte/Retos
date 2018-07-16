package com.accenture.gmail.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.accenture.gmail.ui.Enviar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Step;

public class Enviarmensaje implements Task {

 protected Enviarmensaje() {
		 
	 }


	@Step("{0} clears all the completed items")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Enviar.ENVIAR));
    }
	   
	public static Enviarmensaje forTheTerm() {
        return instrumented(Enviarmensaje.class);
	}
}
