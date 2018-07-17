package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import interfaces.Facebookpage;
import model.Facebooklogin;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

public class OpenTheBrowser implements Task {
	private PageObject page;
	
	public OpenTheBrowser(PageObject page) {
		this.page = page;
	}
	@Override 
	@Step("{0} goes to #OpenTheBrowser") //informativo  
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(page));
	}

	public static OpenTheBrowser at(PageObject page) { // paso la variable page 
		return instrumented(OpenTheBrowser.class, page) ;
	}

	
}


