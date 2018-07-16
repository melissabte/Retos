package com.accenture.gmail.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchBox {
    public static Target SEARCH_FIELD = Target.the("sent").located(By.xpath("//a[contains(text(),'Sent')]"));
 
	
	 
}