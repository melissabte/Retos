package step_definitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.equalTo;

import org.openqa.selenium.WebDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import interfaces.Facebookpage;
import model.Facebooklogin;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import questions.Guardarnombres;
import tasks.Abrirperfil;
import tasks.Buscarpersona;
import tasks.Login;
import tasks.OpenTheBrowser;

import static net.serenitybdd.screenplay.GivenWhenThen.*;

public class FacebookStepDefinition {

	@Managed(driver= "chrome")
	private WebDriver herBrowser;
	private Actor melissa = Actor.named("melissa");
	private Facebookpage facebookpage;
	
	@Before
	public void setup() {
		melissa.can(BrowseTheWeb.with(herBrowser));   // Se le asigna el driver al actor
	
}
	@Given("^that melissa opened her browser at facebook home page$") 
	public void thatTheUserOpenedTheBrowserAt() throws Exception {
	melissa.wasAbleTo(OpenTheBrowser.at(facebookpage)); 
	}
	
	@And("^ingrese el correo (.*) y (.*) to$")
	public void ingrese_el_correo_y_contraseña(String email, String password) throws Exception {
		melissa.wasAbleTo(Login.the(new Facebooklogin(email, password)));
	}
	@When("^busque la siguiente persona$")
	public void Busque_la_siguiente_persona() throws Exception {
		melissa.wasAbleTo(Buscarpersona.the());
		
	}
	@And("^seleccione nombre$")
	public void Seleccione_nombre() throws Exception {
		melissa.wasAbleTo(Abrirperfil.the());
	}
	@Then("^obtener lista$")
	public void Obtener_lista() throws Exception {
		//melissa.should(seeThat(Abrirperfil.Obtenerlista(), equalTo(Buscarpersona.ObtenerExcel());
		melissa.should(seeThat(Guardarnombres.nombres(), equalTo(Buscarpersona.ObtenerExcel())));
	
	} 
	
	//melissa.wasAbleTo(Login.the(facebooklogin));
}
