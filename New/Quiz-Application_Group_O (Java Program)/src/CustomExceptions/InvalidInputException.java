package CustomExceptions;

public class InvalidInputException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String exc) {
		super(exc);
	}
}
