package interfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Personas extends PageObject{
	
	public static final Target BUSCADOR=Target.the("buscador").locatedBy("//*[@name=\"q\"]");
	public static final Target BOTON_BUSCAR=Target.the("boton buscar").locatedBy("//*[@class=\"_42ft _4jy0 _4w98 _4jy3 _517h _51sy _4w97\"] ");
	public static final Target PERFIL_SELE=Target.the("seleccionar perfil").locatedBy("//*[@data-insertion-position=\"0\"]/div/div");


}
