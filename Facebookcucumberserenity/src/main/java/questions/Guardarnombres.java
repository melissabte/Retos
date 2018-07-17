package questions;

import java.util.ArrayList;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import tasks.Abrirperfil;
import tasks.Buscarpersona;

public class Guardarnombres implements Question<ArrayList<String>>  {
public	static ArrayList<String> holaa;
	
	public Guardarnombres() {
		holaa= new ArrayList<>();// TODO Auto-generated constructor stub
	}
	@Override
	public ArrayList<String> answeredBy(Actor actor) {
		holaa = Buscarpersona.obtenernombres();
		System.out.println(holaa);
		return holaa;
	}
	
	public static Guardarnombres nombres() {
		return new Guardarnombres();
	}

}
