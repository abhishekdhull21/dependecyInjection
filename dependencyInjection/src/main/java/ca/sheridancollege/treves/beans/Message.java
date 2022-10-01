package ca.sheridancollege.treves.beans;

public class Message {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void console(String message) {
		 System.out.println(message);
		 }
	@Override
	public String toString() {
		return "Message [message=" + message + "]";
	}

}
