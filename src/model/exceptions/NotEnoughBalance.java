package model.exceptions;

public class NotEnoughBalance extends Exception {

	private static final long serialVersionUID = 1L;

	public NotEnoughBalance(String msg) {
		super(msg);
	}
	
}
