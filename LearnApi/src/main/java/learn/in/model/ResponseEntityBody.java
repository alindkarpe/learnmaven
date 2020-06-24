package learn.in.model;


public class ResponseEntityBody {

	private String message;
	private Object data;
	
		
	/**
	 * @param message
	 * @param data
	 */
	public ResponseEntityBody(String message, Object data) {
		super();
		this.message = message;
		this.data = data;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	
	@Override
	public String toString() {
		return "ResponseEntity [message=" + message + ", data=" + data + "]";
	}
	
	
	
	
}
