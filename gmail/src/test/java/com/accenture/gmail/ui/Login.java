package com.accenture.gmail.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Login {
	 public static Target INGRESAR= Target.the("search field").located(By.xpath("//*[@id=\"identifierId\"]"));
}
