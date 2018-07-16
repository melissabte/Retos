package com.accenture.gmail.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.openqa.selenium.Keys.ENTER;

import com.accenture.gmail.ui.Enviar;
import com.accenture.gmail.ui.SearchBox;

public class Search implements Task {

   

    protected Search() {
       
    }

    @Step("{0} clears all the completed items")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchBox.SEARCH_FIELD));
    }
	   
	public static Search forTheTerm() {
        return instrumented(Search.class);
	}
}
