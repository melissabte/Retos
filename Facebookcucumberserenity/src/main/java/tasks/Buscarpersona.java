package tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.io.IOException;
import java.util.ArrayList;

import exceptions.Exceptionbuscar;
import exceptions.StarsessionException;
import interfaces.Perfil;
import interfaces.Personas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.questions.Text;
import util.Excelfacebook;

public class Buscarpersona implements Task {
	Excelfacebook excelfacebook;
	String persona;
	static ArrayList<String> NOMBRES;
	static ArrayList<String> name;
	
	public Buscarpersona() {
		excelfacebook = new Excelfacebook("operaciones.xlsx");
		// this.persona = persona;
		NOMBRES = new ArrayList<>();
		name = new ArrayList<>();
	}

	@Override
public<T extends Actor> void performAs(T actor){
		
		buscarperso(actor);
	}
	
	private<T extends Actor >void buscarperso(T actor ){
		
	try {
		buscar(actor);
	} catch (Exception e) {
		throw new Exceptionbuscar(Exceptionbuscar.MESSAGE_FAILED_BUSCAR,e);
		// TODO: handle exception
	}
	}
	
	
	
	
	public <T extends Actor> void buscar(T actor) throws InterruptedException, IOException {
		try {
			NOMBRES = excelfacebook.readExcelfacebook(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (String nombre : NOMBRES) {			
			actor.attemptsTo(Enter.theValue(nombre).into(Personas.BUSCADOR));
			actor.attemptsTo(Click.on(Personas.BOTON_BUSCAR));
			actor.attemptsTo(Click.on(Personas.PERFIL_SELE));
			String NAMEFACEBOOKPROFILE =  Text.of(Perfil.SELE_NOMBRE).viewedBy(actor).asString();
			name.add(NAMEFACEBOOKPROFILE);
			System.out.println("nombres"+ name);

			
//			try {
//				System.out.println("pilas que no vamos pal excel");
//				excelfacebook.writeXLSXFile(NOMBRES);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		
		}
		
}
	
	public static Buscarpersona the() {
		// TODO Auto-generated method stub
		return instrumented(Buscarpersona.class);
	
	}
	
	public static ArrayList<String> ObtenerExcel(){
		System.out.println("no encontr");
		return name;
	}
	public static ArrayList<String>obtenernombres(){
		System.out.println("no encontro nada");
		return NOMBRES;
		
	}
}
