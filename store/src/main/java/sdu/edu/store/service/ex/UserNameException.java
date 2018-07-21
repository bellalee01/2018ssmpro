package sdu.edu.store.service.ex;

public class UserNameException extends ServiceException {

	private static final long serialVersionUID = -8855353570074518537L;

	public UserNameException() {
		super();
	}

	public UserNameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserNameException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNameException(String message) {
		super(message);
	}

	public UserNameException(Throwable cause) {
		super(cause);
	}
}
