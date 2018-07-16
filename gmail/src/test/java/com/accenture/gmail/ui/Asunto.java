package com.accenture.gmail.ui;

import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Asunto {
	public static Target ASUNTO= Target.the("search field").located(By.xpath("//input[@class='aoT']"));
	
}
