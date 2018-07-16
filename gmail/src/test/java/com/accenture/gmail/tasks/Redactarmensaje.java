package com.accenture.gmail.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;


import com.accenture.gmail.ui.Mensaje;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Redactarmensaje  implements Task {


	 private final String mensaje;

	    protected Redactarmensaje(String mensaje) {
	        this.mensaje= mensaje;
	    }

	    @Step("Redactarmensaje for #mensaje")
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(
	                Enter.theValue(mensaje)
	                     .into(Mensaje.MENSAJE)
	                     .thenHit(ENTER)
	        );}
	    public static Redactarmensaje forTheTerm(String mensaje) {
	        return instrumented(Redactarmensaje.class, mensaje);
	    }
}
