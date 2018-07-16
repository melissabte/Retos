package com.accenture.gmail.tasks;

import com.accenture.gmail.ui.Validacion;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import net.serenitybdd.screenplay.questions.Text;


public class Resultado implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
   
          return Text.of(Validacion.VALIDACION).viewedBy(actor).asString();
          
    }
    

    public static Resultado is() {
          return new Resultado();
    }

}
