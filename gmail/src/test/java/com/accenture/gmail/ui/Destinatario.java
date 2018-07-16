package com.accenture.gmail.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Destinatario {
	public static Target DESTINATARIO= Target.the("search field").located(By.xpath("//textarea[@class='vO']"));
	
	

}
