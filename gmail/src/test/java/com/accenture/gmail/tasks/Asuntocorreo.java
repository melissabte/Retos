package com.accenture.gmail.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.gmail.ui.Asunto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

public class Asuntocorreo  implements Task {
	  private final String asunto;

	    protected Asuntocorreo(String asunto) {
	        this.asunto= asunto;
	    }

	    @Step("Asuntocorreo for #asunto")
	    public <T extends Actor> void performAs(T actor) {
	        actor.attemptsTo(
	                Enter.theValue(asunto)
	                     .into(Asunto.ASUNTO)
	                     .thenHit(ENTER)
	        );}
	    public static Asuntocorreo  forTheTerm(String asunto) {
	        return instrumented(Asuntocorreo.class, asunto);
	    }
}
