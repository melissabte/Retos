package com.accenture.Youtube.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

public class Gmailpage extends PageObject  {

 @FindBy(xpath="//*[@id=\"identifierId\"]") 
    private WebElementFacade Login;
    
 @FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input") 
 private WebElementFacade password;
 
 @FindBy(xpath="//span[@class='RveJvd snByac'][contains(text(),'Post')]")
 private WebElementFacade publicar;

public void Correo (String keyword) {
   Login.typeAndEnter(keyword);
}


public void Contraseña (String hola) {
   password.typeAndEnter(hola);
}

public void Publicar () {
	publicar.click();
}
}