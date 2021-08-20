package bulkmailer.view;

import java.util.Collection;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;

import bulkmailer.controller.EmailBuilder;
import bulkmailer.controller.EmailSender;
import bulkmailer.model.Email;
import bulkmailer.model.EmailProperties;

public class ProgressController extends Thread {

	private EmailProperties mailProps;
	private JProgressBar progressBar;
	private JTextPane log;
	
	public ProgressController(EmailProperties mailProps, JProgressBar bar, JTextPane log) {
		this.mailProps = mailProps;
		this.progressBar = bar;
		this.progressBar.setVisible(true);
		this.log = log;
	}
	
	@Override
	public void run() {
		EmailBuilder builder = new EmailBuilder();
		Collection<Email> emails = builder.mountEmails(mailProps);
		progressBar.setMaximum(emails.size());
		EmailSender.send_email(emails, mailProps, this);
		JOptionPane.showMessageDialog(progressBar, "Sending completed!");
	}
	
	public void incrementarBarraProgresso() {
		this.progressBar.setValue(progressBar.getValue()+1);
	}

	public void incrementarLog(String line) {
		this.log.setText(log.getText() + line);
	}
	
}
