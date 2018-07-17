package interfaces;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.facebook.com")

public class Facebookpage extends PageObject{


		public static final Target EMAIL = Target.the("Facebook correo").locatedBy("//*[@id=\"email\"]");
		public static final Target PASSWORD =Target.the("Facebook contraseña").locatedBy("//*[@id=\"pass\"]");
		public static final Target LOGIN_BUTTON =Target.the("Boton inicio").locatedBy("//*[@id=\"u_0_2\"]");
		
	}
