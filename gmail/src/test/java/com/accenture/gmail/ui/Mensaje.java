package com.accenture.gmail.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public abstract class Mensaje {
	public static Target MENSAJE= Target.the("search field").located(By.xpath("//div[@class='Am Al editable LW-avf']"));
	
	
}
