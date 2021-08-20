package bulkmailer.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import bulkmailer.model.Email;
import bulkmailer.model.EmailProperties;
import bulkmailer.view.ProgressController;

public class EmailSender {

	public static void send_email(Collection<Email> emails, EmailProperties mailProps, ProgressController controller) {
		Session session = null;
		Transport transport = null;
		int numErros = -1;
		Properties props = new Properties();
		session = Session.getInstance(props, null);
		session.getProperties().put("mail.smtp.host", mailProps.getServer());
		session.getProperties().put("mail.smtp.port", mailProps.getPort());
		session.getProperties().put("mail.smtp.auth", "false");
		session.getProperties().put("mail.smtp.starttls.enable", "true");
		session.getProperties().put("mail.smtp.SocketFetcher.enable", "true"); 
		while (numErros != 0) {
			try {
				transport = session.getTransport("smtp");
				numErros = 0;
			} catch (NoSuchProviderException e) {
				e.printStackTrace();
				numErros = 1;
			}
			try {
				if (mailProps.requiresAuthentication()) {
					transport.connect(mailProps.getUsername(), mailProps.getPassword());
				} else {
					transport.connect();
				}
			} catch (MessagingException e) {
				controller.incrementarLog("Error trying to connect to the SMTP server - Retrying ... \\ n");
				numErros++;
				try {
					transport.close();
				} catch (MessagingException e1) {
					e1.printStackTrace();
				}
			}
		}
		Iterator<Email> itEmails = emails.iterator();
		while (itEmails.hasNext()) {
			Email email = itEmails.next();
			Message message = new MimeMessage(((Session) session));
			try {
				message.setFrom(new InternetAddress(email.getFrom()));
			} catch (AddressException e) {
				controller.incrementarLog("Invalid Email FROM: " + email.getFrom() + "\n");
			} catch (MessagingException e) {
			}
			InternetAddress to[] = new InternetAddress[1];
			try {
				to[0] = new InternetAddress(email.getRecipient().getEmail());
				message.setRecipients(Message.RecipientType.TO, to);
				message.setSubject(email.getStrSubject());
				message.setContent(email.getBody(), "text/html");
				transport.sendMessage(message, to);
				controller.incrementarLog("Email sent to  " + email.getRecipient().getEmail() + "\n");
			} catch (AddressException e) {
				e.printStackTrace();
			} catch (MessagingException e) {
				controller.incrementarLog("Error formatting / sending email" + "\n");
			while (!transport.isConnected()) {
					try {
						if (mailProps.requiresAuthentication()) {
							transport.connect(mailProps.getUsername(), mailProps.getPassword());
						} else {
							transport.connect() ;
						}
					} catch (Exception ex) {
					}
				}
				try {
					transport.sendMessage(message, to);
				} catch (MessagingException e1) {

					e1.printStackTrace();
				}
			} catch (Exception e) {
				controller.incrementarLog("Error sending message!" + "\n");
			}
			controller.incrementarBarraProgresso();
		}
		controller.incrementarLog("\n");
		try {
			transport.close();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	public static boolean testarConnection(EmailProperties mailProps) {
		Session session = null;
		Transport transport = null;
		Properties props = new Properties();
		session = Session.getInstance(props, null);
		session.getProperties().put("mail.smtp.host", mailProps.getServer());
		session.getProperties().put("mail.smtp.port", mailProps.getPort());

		if (mailProps.requiresAuthentication()) {
			session.getProperties().put("mail.smtp.auth", "true");
			session.getProperties().put("mail.smtp.auth", "true");
		} else {
			session.getProperties().put("mail.smtp.auth", "false");
		}

		try {
			transport = session.getTransport("smtp");
		} catch (NoSuchProviderException e) {
			return false;
		}

		try {
			if (mailProps.requiresAuthentication()) {
				transport.connect(mailProps.getUsername(), mailProps.getPassword());
			} else {
				transport.connect();
			}
			transport.close();
			return true;
		} catch (MessagingException e1) {
			e1.printStackTrace();
		}

		return false;
	}

}
