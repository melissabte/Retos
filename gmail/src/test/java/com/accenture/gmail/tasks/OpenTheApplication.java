package com.accenture.gmail.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import com.accenture.gmail.ui.Gmailsearch;
import com.accenture.gmail.ui.GoogleSearchPage;

public class OpenTheApplication implements Task {

    Gmailsearch  gmailsearch;

    @Step("Open the application")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn().the(gmailsearch)
        );
    }
}
