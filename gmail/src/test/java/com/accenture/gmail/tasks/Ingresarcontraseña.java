package com.accenture.gmail.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.gmail.ui.Contraseña;
import com.accenture.gmail.ui.Login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Ingresarcontraseña implements Task {

	  private final String contraseña;

	    protected Ingresarcontraseña(String contraseña) {
	        this.contraseña= contraseña;
	    }

	    @Step("Ingresarcontraseña for #contraseña")
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(
	                Enter.theValue(contraseña)
	                     .into(Contraseña.CONTRASEÑA)
	                     .thenHit(ENTER)
	        );}
	    public static Ingresarcontraseña forTheTerm(String contraseña) {
	        return instrumented(Ingresarcontraseña.class, contraseña);
	    }

	
}

