package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;


import interfaces.Perfil;
import interfaces.Personas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class Abrirperfil implements Task{
	 String nombre;
public ArrayList<String> NOMBRES;
		
	 public Abrirperfil() {
			NOMBRES = new ArrayList<>();
		
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		nombre = Text.of(Perfil.SELE_NOMBRE).viewedBy(actor).asString();
		NOMBRES.add(nombre);
		String NOMBRE = NOMBRES.get(0);
		System.out.println(nombre); 
	}
	
	
	
	public static Abrirperfil the() {
		// TODO Auto-generated method stub
		return instrumented(Abrirperfil.class);
	}
	
	
}
