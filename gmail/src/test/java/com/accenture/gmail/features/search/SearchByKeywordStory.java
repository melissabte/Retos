package com.accenture.gmail.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import net.thucydides.core.annotations.Issue;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.accenture.gmail.tasks.Asuntocorreo;
import com.accenture.gmail.tasks.Darclick;
import com.accenture.gmail.tasks.Enviarmensaje;
import com.accenture.gmail.tasks.Ingresarcontraseña;
import com.accenture.gmail.tasks.Ingresarcorreo;
import com.accenture.gmail.tasks.Ingresardestinatario;
import com.accenture.gmail.tasks.OpenTheApplication;
import com.accenture.gmail.tasks.Redactarmensaje;
import com.accenture.gmail.tasks.Resultado;
import com.accenture.gmail.tasks.Search;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.EventualConsequence.eventually;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

@RunWith(SerenityRunner.class)
public class SearchByKeywordStory {

    Actor melissa = Actor.named("melissa");

    @Managed(uniqueSession = true)
    public WebDriver herBrowser;

    @Steps
    OpenTheApplication openTheApplication;

    @Before
    public void annaCanBrowseTheWeb() {
        melissa.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void search_results_should_show_the_search_term_in_the_title() throws InterruptedException {
    	herBrowser.manage().window().maximize();
        givenThat(melissa).wasAbleTo(openTheApplication);

        when(melissa).attemptsTo(Ingresarcorreo.forTheTerm("email"));
     when(melissa).attemptsTo(Ingresarcontraseña.forTheTerm("password"));
     when(melissa).attemptsTo(Darclick.forTheTerm()); 
     when(melissa).attemptsTo(Ingresardestinatario.forTheTerm("m.bustamante9514@gmail.com"));
     when(melissa).attemptsTo(Asuntocorreo.forTheTerm("prueba screenplay"));
     when(melissa).attemptsTo(Redactarmensaje.forTheTerm("correo prueba serenity Funciona!!!"));
     Thread.sleep(1000);
     when(melissa).attemptsTo(Enviarmensaje.forTheTerm());
     when(melissa).attemptsTo(Search.forTheTerm());
     then(melissa).should(eventually(seeThat(Resultado.is(),containsString("prueba screenplay"))));

    }
}