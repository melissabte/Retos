package com.accenture.gmail.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Contraseña {
	 public static Target CONTRASEÑA= Target.the("search field").located(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
	
}
