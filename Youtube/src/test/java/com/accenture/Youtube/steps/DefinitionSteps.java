package com.accenture.Youtube.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.accenture.Youtube.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps anna;

    @Given("buscar en youtube")
    public void givenTheUserIsOnYoutube() {
        anna.is_the_home_page();
    }

    @When("ingresar nombre video '(.*)'")
    public void whenTheUserLooksUpTheDefinitionOf(String word) {
        anna.looks_for(word);
    }
//    @And("seleccionar video")
//    public void SeleccionarVideo() {
//        anna.sele_video();
//    }

    @And("el usuario escoge el video")
    public void el_usuario_escoge_el_video() {
    	anna.escoger_video();	
    }
    
   @And("el usuario va a compartir el video")
public void el_usuario_va_a_compartir_el_video() {
	 anna.Compartir_video();
 }
 
   @And("click en google")
 public void click_en_google() {
	 anna.Ingresar_google();
	 anna.pestañagmail();
}
   @And("ingresar correo '(.*)'")
   public void ingresar(String word) {
		 anna.Ingresar_usuario(word);
		 
}
   @And("ingresar contraseña '(.*)'")
   public void ingresarcontraseña(String word) {
		 anna.Ingresar_contraseña(word);
		 
}
   @And("publicar video")
   public void publicar_video() {
	   anna.PUBLICAR();
   }
//   @And("ingresar contraseña '(.*)'")
//   public void Ingresarcontraseña(String holi) {
//		 anna.Ingresar_contraseña(holi);
//		 
//}
   }
