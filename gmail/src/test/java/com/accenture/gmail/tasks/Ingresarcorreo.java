package com.accenture.gmail.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.gmail.ui.Login;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Ingresarcorreo implements Task{
	  private final String ingreso;

	    protected Ingresarcorreo(String ingreso) {
	        this.ingreso= ingreso;
	    }

	    @Step("Ingresarcorreo for #ingreso")
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(
	                Enter.theValue(ingreso)
	                     .into(Login.INGRESAR)
	                     .thenHit(ENTER)
	        );}
	    public static Ingresarcorreo forTheTerm(String ingreso) {
	        return instrumented(Ingresarcorreo.class, ingreso);
	    }

	
}

