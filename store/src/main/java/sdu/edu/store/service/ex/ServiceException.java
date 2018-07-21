package sdu.edu.store.service.ex;

public class ServiceException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2607670486646608750L;

	//ctrl+D可以删除一行
	public ServiceException() {
		super();
	}

	public ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public ServiceException(String message) {
		super(message);
	}

	public ServiceException(Throwable cause) {
		super(cause);
	}
}
