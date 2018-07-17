package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class) //modificar la clase de cucumber 
@CucumberOptions(
		features = "src.test.resources/features/facebook.feature", // paso lo features y paso a ruta 
		glue = {"step_definitions"}		// ruta de los step definition
)
public class FacebookRunner {

}
 