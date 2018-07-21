package sdu.edu.store.service.ex;

public class PasswordException extends ServiceException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 211658893830223589L;

	public PasswordException() {
	}

	public PasswordException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public PasswordException(String message, Throwable cause) {
		super(message, cause);
	}

	public PasswordException(String message) {
		super(message);
	}

	public PasswordException(Throwable cause) {
		super(cause);
	}

}
