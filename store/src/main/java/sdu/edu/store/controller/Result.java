package sdu.edu.store.controller;

import java.io.Serializable;

public class Result implements Serializable {

	private static final long serialVersionUID = 5789527279333749087L;
	
	public static final int SUCCESS=1;
	public static final int ERROR=0;
		
	private int state = SUCCESS;
	private String message = "OK";
	private Object data = null;
	
	public Result() {
	}
	
	public Result(Throwable e){
		state = ERROR;
		message = e.getMessage();
	}
	
	public Result(String successMessage){
		state = SUCCESS;
		message = successMessage;
	}
	
	public Result(Object obj) {
		this(SUCCESS, "", obj);
	}
	
	public Result(int state, String message, Object data) {
		super();
		this.state = state;
		this.message = message;
		this.data = data;
	}
	
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Result [state=" + state + ", message=" + message + ", data=" + data + "]";
	}

}
