package com.accenture.Youtube.steps.serenity;


import java.util.ArrayList;

import org.openqa.selenium.WebDriver;

import com.accenture.Youtube.pages.Gmailpage;
import com.accenture.Youtube.pages.Youtubepage;

import net.thucydides.core.annotations.Step;


public class EndUserSteps {

    Youtubepage  youtubepage;
    Gmailpage    gmailpage;
    @Step
    public void enters(String keyword) {
    	 youtubepage.enter_keywords(keyword);
    }

    @Step
    public void starts_search() {
    	 youtubepage.lookup_terms();
    }

  
    @Step
    public void is_the_home_page() {
    	 youtubepage.open();
    }

    @Step
    public void looks_for(String term) {
        enters(term);
        starts_search();
    }
//  
    @Step
    public void escoger_video() {
    	youtubepage.Video();
    } 
    @Step
    public void Compartir_video() {
    	youtubepage.Compartir();
    }
    @Step
    public void Ingresar_google() {
    	youtubepage.Google();
    }
    @Step
    public void pestañagmail() {
    	WebDriver  driver = youtubepage.getDriver();
    ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
    driver.switchTo().window(tabs2.get(1));
    
    }
    @Step
    public void Ingresar_usuario (String correo) {
    	gmailpage.Correo(correo);

    }
//    @Step
//    public void Ingresar_contraseña (String contraseña) {
//    	gmailpage.Contraseña(contraseña);
//
//    }
    @Step
    public void Ingresar_contraseña(String hola) {
    	gmailpage.Contraseña(hola);

    }
    
    public void PUBLICAR() {
    	gmailpage.Publicar();
    	
    }
}