package bulkmailer.model;


public class Email {

	private String body;
	private String from;
	private String strsubject;
	private String strData;
	private Recipient Recipient;

	public Email() {
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setstrSubject(String strsubject) {
		this.strsubject = strsubject;
	}

	public String getStrSubject() {
		return strsubject;
	}

	public void setStrData(String strData) {
		this.strData = strData;
	}

	public String getStrMenData() {
		return strData;
	}

	public void setRecipient(Recipient Recipient) {
		this.Recipient = Recipient;
	}

	public Recipient getRecipient() {
		return Recipient;
	}

	
}
