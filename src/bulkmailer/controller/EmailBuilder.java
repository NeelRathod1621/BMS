package bulkmailer.controller;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

import bulkmailer.model.Recipient;
import bulkmailer.model.Email;
import bulkmailer.model.EmailProperties;

public class EmailBuilder {

	private static String getBodyEmail(File emailHTML) {
		StringBuilder text = new StringBuilder();
		String NL = System.getProperty("line.separator");
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileInputStream(emailHTML));
			while (scanner.hasNextLine()) {
				text.append(scanner.nextLine() + NL);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return text.toString();
	}

	private static String getStringFormat(String compoundword) {
		String name = "";
		String[] compoundname = compoundword.toLowerCase().split(" ");
		for (int i = 0; i < compoundname.length; i++) {
			if (!compoundname[i].trim().equals("")) {
				if (!name.equals("")) {
					name = name + " ";
				}
				name = name + compoundname[i].substring(0, 1).toUpperCase() + compoundname[i].substring(1);
			}
		}
		return name;
	}

	private static Collection<Recipient> getRecipient(File shipping) {
		Scanner scanner = null;
		Collection<Recipient> Recipient = new ArrayList<Recipient>();
		try {
			scanner = new Scanner(new FileInputStream(shipping));
			while (scanner.hasNextLine()) {
				String strRec = scanner.nextLine();
				Recipient Reci = new Recipient();
				String name = getStringFormat(strRec.split(";")[0]);
				String email = strRec.split(";")[1];
				Reci.setEmail(email);
				Reci.setName(name);
				Recipient.add(Reci);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}
		return Recipient;
	}

	public Collection<Email> mountEmails(EmailProperties mailProps) {
		Collection<Recipient> Recipient = getRecipient(mailProps.getShipping());
		String body = getBodyEmail(mailProps.getEmailHTML());
		Iterator<Recipient> itDest = Recipient.iterator();
		Collection<Email> emails = new ArrayList<Email>();
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String current_date = formatter.format(Calendar.getInstance().getTime());
		while (itDest.hasNext()) {
			Recipient dest = itDest.next();
			Email email = new Email();
			email.setRecipient(dest);
			email.setFrom(mailProps.getFrom());
			email.setStrData(current_date);
			email.setstrSubject(mailProps.getSubject());
			email.setBody(body);
			emails.add(email);
		}
		return emails;
	}

}
