package sdu.edu.store.service.ex;

public class UserExistException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3831858046357250135L;

	public UserExistException() {
	}

	public UserExistException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserExistException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserExistException(String message) {
		super(message);
	}

	public UserExistException(Throwable cause) {
		super(cause);
	}

}
