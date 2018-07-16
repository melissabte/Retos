package com.accenture.gmail.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import com.accenture.gmail.ui.Redactar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import net.thucydides.core.annotations.Step;

public class Darclick implements Task {
	 protected Darclick() {
		 
	 }


	@Step("{0} clears all the completed items")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Redactar.BOTON));
    }
	   
	public static Darclick forTheTerm() {
        return instrumented(Darclick.class);
        
}
}