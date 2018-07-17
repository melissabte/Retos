package exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class Exceptionbuscar extends SerenityManagedException {

	public static final String MESSAGE_FAILED_BUSCAR = "FALLO LA BUSQUEDA";


	public Exceptionbuscar(String message, Throwable testErrorException) {
		super(message, testErrorException);
		// TODO Auto-generated constructor stub
	}

	

}