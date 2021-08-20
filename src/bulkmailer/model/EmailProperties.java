package bulkmailer.model;

import java.io.File;


public class EmailProperties {

	private String username;
	private String password;
	private String server;
	private String from;
	private int port;
	private File emailHTML;
	private File shipping;
	private String subject;
	private boolean requiresAuthentication;
	private String labelName;
	
	public EmailProperties() {
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getServer() {
		return server;
	}

	public String getFrom() {
		return from;
	}

	public int getPort() {
		return port;
	}

	public void setEmailHTML(File emailHTML) {
		this.emailHTML = emailHTML;
	}

	public File getEmailHTML() {
		return emailHTML;
	}

	public void setShipping(File shipping) {
		this.shipping = shipping;
	}

	public File getShipping() {
		return shipping;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setRequiresAuthentication(boolean requiresAuthentication) {
		this.requiresAuthentication = requiresAuthentication;
	}

	public boolean requiresAuthentication() {
		return requiresAuthentication;
	}

	public boolean isRequiresAuthentication() {
		return requiresAuthentication;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setServer(String server) {
		this.server = server;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getLabelName() {
		return labelName;
	}
	
}
