package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.awt.AWTException;

import exceptions.StarsessionException;
import interfaces.Facebookpage;
import model.Facebooklogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;
import util.TabularRobot;

public class Login implements Task {

Facebooklogin facebooklogin;
	
    // Clase: CamelCaseUp ; Metodos y variables: camelCaseDown ; Constantes: ESTO_ES_CONSTANTE ; Feature: esto_es_feature

	public Login(Facebooklogin facebooklogin) {
		this.facebooklogin = facebooklogin;
	}
	
	@Override
	public<T extends Actor> void performAs(T actor){
		
		authenticateuser(actor);
	}
	
	private<T extends Actor >void authenticateuser(T actor ){
		
	try {
		login(actor);
	} catch (Exception e) {
		throw new StarsessionException(StarsessionException.MESSAGE_FAILED_AUTHENTICATION,e);
		// TODO: handle exception
	}
	}
	
	
	
	
	@Step("{0} FACEBOOK #Facebooklogin")
	public <T extends Actor> void login(T actor) throws InterruptedException, AWTException{
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				actor.attemptsTo(Enter.theValue(facebooklogin.getemail()).into(Facebookpage.EMAIL));
				actor.attemptsTo(Enter.theValue(facebooklogin.getpassword()).into(Facebookpage.PASSWORD));
				actor.attemptsTo(Click.on(Facebookpage.LOGIN_BUTTON));
				TabularRobot robot =new TabularRobot();
				robot.tab();

	}

	public static Login the(Facebooklogin facebooklogin) {
		// TODO Auto-generated method stub
		return instrumented(Login.class, facebooklogin);
	}
}
