package exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class StarsessionException  extends SerenityManagedException {
	public static final String MESSAGE_FAILED_AUTHENTICATION = "FALLO DE AUTENTICACION";

	public StarsessionException(String message, Throwable testErrorException) {
		super(message, testErrorException);
		// TODO Auto-generated constructor stub
	}
	
	

	
	
	
}
