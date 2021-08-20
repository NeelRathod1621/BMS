package bulkmailer.view;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.SystemColor;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.awt.*;  

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import bulkmailer.controller.EmailSender;
import bulkmailer.model.EmailProperties;

public class jvbm {

	private JFrame jFrame = null;  
	private JPanel jContentPane = null;
	private JTabbedPane jTabbedPane = null;
	private JPanel tabConnection = null;
	private JPanel tabInit = null;
	private JPanel jPanel21 = null;
	private JLabel jLabel = null;
	private JTextField fieldServer = null;
	private JLabel labelLogin = null;
	private JTextField fieldLogin = null;
	private JLabel labelPassword = null;
	private JTextField fieldPassword = null;
	private JButton buttonTestar = null;
	private JPanel jPanel3 = null;
	private JLabel jLabel3 = null;
	private JTextField fieldPort = null;
	private JLabel jLabel4 = null;
	private JLabel jLabel5 = null;
	private JLabel jLabel6 = null;
	private JTextField fieldFrom = null;
	private JTextField fieldName = null;
	private JTextField fieldSubject = null;
	private JButton buttonContinue = null;
	private JLabel jLabel7 = null;
	private JPanel jPanel2 = null;
	private JButton buttonStart = null;
	private JLabel jLabel8 = null;
	private JLabel jLabel9 = null;
	private JLabel jLabel10 = null;
	private JPanel tabDice = null;
	private JPanel jPanel5 = null;
	private JLabel jLabel11 = null;
	private JTextField fieldBody = null;
	private JButton buttonBody = null;
	private JPanel jPanel6 = null;
	private JButton buttonSend = null;
	private JLabel jLabel12 = null;
	private JTextField fieldRecipients = null;
	private JButton btRecipients = null;
	private JLabel jLabel13 = null;
	private JLabel jLabel14 = null;
	private JLabel jLabel15 = null;
	private JLabel jLabel16 = null;

	private EmailProperties mailProps = new EmailProperties();  
	private JPanel tabProgress = null;
	private JPanel jPanel1 = null;
	private JProgressBar jProgressBar = null;
	private JPanel jPanel4 = null;
	private JButton buttonClose= null;
	private JTextPane textPaneLog = null;
	private JScrollPane jScrollPane = null;

	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setSize(new Dimension(54, 56));
			jFrame.setTitle("Bulk Mailer Services");
			jFrame.setResizable(false);
	        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setPreferredSize(new Dimension(529, 488));
			jFrame.setMinimumSize(new Dimension(529, 488));
			jFrame.setMaximumSize(new Dimension(529, 488));
			jFrame.setContentPane(getJContentPane());
			jFrame.setLocationRelativeTo(null);		
			jFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/resources/images/frame_logo.png")));
		}
		return jFrame;
	}
	
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
			jContentPane.setSize(new Dimension(524, 488));
			jContentPane.add(getJTabbedPane(), BorderLayout.NORTH);
		}
		return jContentPane;
	}

	
	private JTabbedPane getJTabbedPane() {
		if (jTabbedPane == null) {
			jTabbedPane = new JTabbedPane();
			jTabbedPane.setPreferredSize(new Dimension(80, 455));
			jTabbedPane.addTab("Home", null, getTabStart(), null);
			jTabbedPane.addTab("Connection", null, gettabConnection(), null);
			jTabbedPane.addTab("Shipping Data", null, getTabDice(), null);
			jTabbedPane.addTab("Shipment Progress", null, getTabProgress(), null);
			jTabbedPane.setEnabledAt(0, true);
			jTabbedPane.setEnabledAt(1, false);
			jTabbedPane.setEnabledAt(2, false);
			jTabbedPane.setEnabledAt(3, false);			
			jTabbedPane.setFont(new Font( "DejaVu Sans Condensed",Font.BOLD , 15));
			 
		}
		return jTabbedPane;
	}


	private JPanel gettabConnection() {
		if (tabConnection == null) {
			tabConnection = new JPanel();
			tabConnection.setLayout(null);
			tabConnection.setName("tabConnection");
			tabConnection.setPreferredSize(new Dimension(40, 160));
			tabConnection.setEnabled(true);
			tabConnection.setVisible(true);
			tabConnection.add(getJPanel21(), null);
			tabConnection.add(getJPanel3(), null);
			tabConnection.add(getButtonContinue(), null);
		}
		return tabConnection;
	}

	
	private JPanel getTabStart() {
		if (tabInit == null) {
			jLabel7 = new JLabel();
			jLabel7.setText("Welcome to Bulk Mailer Services.");
			jLabel7.setBackground(new Color(178, 180, 255));
			jLabel7.setBounds(new Rectangle(85, 10, 315, 22));
			jLabel7.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 18));
			tabInit = new JPanel();
			tabInit.setLayout(null);
			tabInit.setName("tabInit");
			tabInit.add(getJPanel2(), null);
			tabInit.add(getbuttonStart(), null);
			tabInit.add(jLabel10, null);
		}
		return tabInit;
	}

	private JPanel getJPanel21() {
		if (jPanel21 == null) {
			jLabel3 = new JLabel();
			jLabel3.setBounds(new Rectangle(385, 29, 37, 28));
			jLabel3.setText("Port");
			jLabel3.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			labelPassword = new JLabel();
			labelPassword.setBounds(new Rectangle(16, 108, 88, 28));
			labelPassword.setName("labelPassword");
			labelPassword.setText("Password :");
			labelPassword.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			labelLogin = new JLabel();
			labelLogin.setBounds(new Rectangle(16, 71, 88, 24));
			labelLogin.setName("labelLogin");
			labelLogin.setText("Login :");
			labelLogin.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			jLabel = new JLabel();
			jLabel.setFont(new Font( "DejaVu Sans Condensed",Font.LAYOUT_LEFT_TO_RIGHT , 14));
			jLabel.setText("SMTP Server :");
			jLabel.setBounds(new Rectangle(16, 29, 97, 24));
			jPanel21 = new JPanel();
			jPanel21.setLayout(null);
			jPanel21.setPreferredSize(new Dimension(40, 150));
			jPanel21.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "SMTP", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Sans", Font.BOLD, 15), SystemColor.activeCaption));
			jPanel21.setBounds(new Rectangle(9, 14, 491, 157));
			jPanel21.add(jLabel, null);
			jPanel21.add(getFieldServer(), null);
			jPanel21.add(labelLogin, null);
			jPanel21.add(getFieldLogin(), null);
			jPanel21.add(labelPassword, null);
			jPanel21.add(getFieldPassword(), null);
			jPanel21.add(getButtonTestar(), null);
			jPanel21.add(jLabel3, null);
			jPanel21.add(getFieldPort(), null);
		}
		return jPanel21;
	}

	private JTextField getFieldServer() {
		if (fieldServer == null) {
			fieldServer = new JTextField();
			fieldServer.setBounds(new Rectangle(118, 31, 198, 25));
			fieldServer.setName("fieldServer");
			fieldServer.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 14));
			fieldServer.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					buttonContinue.setEnabled(false);
				}
			});
		}
		return fieldServer;
	}

	private JTextField getFieldLogin() {
		if (fieldLogin == null) {
			fieldLogin = new JTextField();
			fieldLogin.setBounds(new Rectangle(119, 69, 197, 27));
			fieldLogin.setName("fieldLogin");
			fieldLogin.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 14));
			}
		return fieldLogin;
	}


	private JTextField getFieldPassword() {
		if (fieldPassword == null) {
			fieldPassword = new JPasswordField();
			fieldPassword.setBounds(new Rectangle(119, 109, 197, 26));
			fieldPassword.setName("fieldPassword");
			fieldPassword.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 14));
		}
		return fieldPassword;
	}

	private JButton getButtonTestar() {
		if (buttonTestar == null) {
			buttonTestar = new JButton();
			buttonTestar.setBounds(new Rectangle(335, 107, 137, 32));
			buttonTestar.setName("buttonTestar");
			buttonTestar.setText("Test Connection");
			buttonTestar.setFont(new Font("DejaVu Sans Condensed", Font.BOLD , 13));
			buttonTestar.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					boolean requerAuth = true; 
					boolean erro = false;	
					String login = fieldLogin.getText();
					String password = fieldPassword.getText();
					String server = fieldServer.getText();
					String porta = fieldPort.getText();
					mailProps.setRequiresAuthentication(requerAuth);
					if (server.equals("") || porta.equals("") || login.equals("") || password.equals("")) {
						JOptionPane.showMessageDialog(tabConnection, "The server and the port must be informed! Or else The login and password must be informed!");
						erro = true;
					} else {
						Integer port = null;
						try {
							port = Integer.valueOf(porta);
							mailProps.setPort(port);
							mailProps.setUsername(login);
							mailProps.setPassword(password);
						} catch (Exception ex) {
							JOptionPane.showMessageDialog(tabConnection, "Port Invalid!");
							erro = true;
						}
						
						if (!erro) {
							mailProps.setServer(server);
							mailProps.setPort(Integer.valueOf(porta));
							boolean success = EmailSender.testarConnection(mailProps);
							if (success) {
								JOptionPane.showMessageDialog(tabConnection, "The connection has been successfully established!");
								buttonContinue.setEnabled(true);
							} else {
								JOptionPane.showMessageDialog(tabConnection, "There were errors in establishing the connection! Check the reported data or your internet connectivity!");								
							}
						}
					}
				}
			});
		}
		return buttonTestar;
	}

	private JPanel getJPanel3() {
		if (jPanel3 == null) {
			jLabel6 = new JLabel();
			jLabel6.setBounds(new Rectangle(16, 106, 61, 28));
			jLabel6.setText("Subject :");
			jLabel6.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			jLabel5 = new JLabel();
			jLabel5.setBounds(new Rectangle(16, 69, 60, 26));
			jLabel5.setText("Name :");
			jLabel5.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			jLabel4 = new JLabel();
			jLabel4.setText("From :");
			jLabel4.setBounds(new Rectangle(15, 29, 61, 28));
			jLabel4.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			jPanel3 = new JPanel();
			jPanel3.setLayout(null);
			jPanel3.setBounds(new Rectangle(9, 189, 490, 162));
			jPanel3.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Email", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Sans", Font.BOLD, 15), SystemColor.activeCaption));
			jPanel3.add(jLabel4, null);
			jPanel3.add(jLabel5, null);
			jPanel3.add(jLabel6, null);
			jPanel3.add(getFieldFrom(), null);
			jPanel3.add(getFieldName(), null);
			jPanel3.add(getFieldSubject(), null);
		}
		return jPanel3;
	}
	
	private JTextField getFieldPort() {
		if (fieldPort == null) {
			fieldPort = new JTextField();
			fieldPort.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 14));
			fieldPort.setBounds(new Rectangle(356, 66, 97, 27));
			fieldPort.setText("25");
			fieldPort.setHorizontalAlignment(JTextField.CENTER);
			fieldPort.setName("fieldPort");
			fieldPort.addCaretListener(new javax.swing.event.CaretListener() {
				public void caretUpdate(javax.swing.event.CaretEvent e) {
					buttonContinue.setEnabled(false);
				}
			});
		}
		return fieldPort;
	}

	private JTextField getFieldFrom() {
		if (fieldFrom == null) {
			fieldFrom = new JTextField();
			fieldFrom.setBounds(new Rectangle(86, 30, 383, 27));
			fieldFrom.setName("fieldFrom");
			fieldFrom.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 14));
		}
		return fieldFrom;
	}

	private JTextField getFieldName() {
		if (fieldName == null) {
			fieldName = new JTextField();
			fieldName.setBounds(new Rectangle(86, 69, 383, 27));
			fieldName.setName("fieldName");
			fieldName.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 14));
		}
		return fieldName;
	}

	private JTextField getFieldSubject() {
		if (fieldSubject == null) {
			fieldSubject = new JTextField();
			fieldSubject.setBounds(new Rectangle(87, 107, 382, 26));
			fieldSubject.setName("fieldSubject");
			fieldSubject.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 14));
		}
		return fieldSubject;
	}

	
	private JButton getButtonContinue() {
		if (buttonContinue == null) {
			buttonContinue = new JButton();
			buttonContinue.setBounds(new Rectangle(158, 370, 194, 30));
			buttonContinue.setName("buttonContinue");
			buttonContinue.setEnabled(false);
			buttonContinue.setText("Continue");
			buttonContinue.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			buttonContinue.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					String from = fieldFrom.getText();
					String assunto = fieldSubject.getText();
					mailProps.setFrom(from);
					mailProps.setSubject(assunto);
					jTabbedPane.setEnabledAt(1, false);
					jTabbedPane.setEnabledAt(2, true);
					jTabbedPane.setSelectedIndex(2);
				}
			});
		}
		return buttonContinue;
	}


	private JPanel getJPanel2() {
		if (jPanel2 == null) {
			jLabel10 = new JLabel();
			jLabel10.setText("To start configuring this session, click the button below:");
			jLabel10.setBounds(new Rectangle(44, 340, 465, 19));
			jLabel10.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 16));
			jLabel9 = new JLabel();
			jLabel9.setBounds(new Rectangle(50, 45, 413, 20));
			jLabel9.setText("Bulk Mailer Services is a mass mailing application.");
			jLabel9.setFont(new Font("DejaVu Sans Condensed", Font.BOLD, 16));
			jLabel8 = new JLabel();
			jLabel8.setBounds(new Rectangle(60, 73, 360, 220));
			jLabel8.setText("");
			jLabel8.setIcon(new ImageIcon(getClass().getResource("/resources/images/logo.png")));
			jPanel2 = new JPanel();
			jPanel2.setLayout(null);
			jPanel2.setBounds(new Rectangle(18, 15, 476, 300));
			jPanel2.setBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED));
			jPanel2.setBackground(SystemColor.controlHighlight);
			jPanel2.add(jLabel8, null);
			jPanel2.add(jLabel9, null);
			jPanel2.add(jLabel7, null);
		}
		return jPanel2;
	}


	private JButton getbuttonStart() {
		if (buttonStart == null) {
			buttonStart = new JButton();
			buttonStart.setFont(new Font("DejaVu Sans", Font.BOLD, 16));
			buttonStart.setText("Start Configuration");
			buttonStart.setName("button_start");
			buttonStart.setBounds(new Rectangle(152, 376, 217, 28));
			buttonStart.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTabbedPane.setEnabledAt(0, false);
					jTabbedPane.setEnabledAt(1, true);
					jTabbedPane.setSelectedIndex(1);
				}
			});
		}
		return buttonStart;
	}


	private JPanel getTabDice() {
		if (tabDice == null) {
			tabDice = new JPanel();
			tabDice.setLayout(null);
			tabDice.setEnabled(false);
			tabDice.setName("tabData");
			tabDice.add(getJPanel5(), null);
			tabDice.add(getJPanel6(), null);
			tabDice.add(getButtonSubmit(), null);
		}
		return tabDice;
	}


	private JPanel getJPanel5() {
		if (jPanel5 == null) {
			jLabel15 = new JLabel();
			jLabel16 = new JLabel();
			jLabel15.setBounds(new Rectangle(12, 86, 459, 19));
			jLabel15.setFont(new Font("Dialog", Font.BOLD, 13));
			jLabel15.setForeground(SystemColor.activeCaption);
			jLabel15.setText("To create HTML file and add your email body.");
			jLabel16.setBounds(new Rectangle(12, 106, 459, 19));
			jLabel16.setFont(new Font("Dialog", Font.BOLD, 13));
			jLabel16.setForeground(SystemColor.activeCaption);
			jLabel16.setText("Only design and text of HTML output send as email body.");
			jLabel11 = new JLabel();
			jLabel11.setFont(new Font("Dialog", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			jLabel11.setText("File (HTML):");
			jLabel11.setBounds(new Rectangle(21, 36, 125, 29));
			jPanel5 = new JPanel();
			jPanel5.setLayout(null);
			jPanel5.setBounds(new Rectangle(12, 15, 483, 154));
			jPanel5.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Email body", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Without", Font.BOLD, 15), SystemColor.activeCaption));
			jPanel5.add(jLabel11, null);
			jPanel5.add(getFieldBody(), null);
			jPanel5.add(getButtonBody(), null);
			jPanel5.add(jLabel15, null);
			jPanel5.add(jLabel16, null);
		}
		return jPanel5;
	}

	
	private JTextField getFieldBody() {
		if (fieldBody == null) {
			fieldBody = new JTextField();
			fieldBody.setBounds(new Rectangle(145, 37, 226, 27));
			fieldBody.setEditable(false);
			fieldBody.setName("fieldBody");
			fieldBody.setFont(new Font("Dialog", Font.LAYOUT_LEFT_TO_RIGHT , 15));
		}
		return fieldBody;
	}

	
	private JButton getButtonBody() {
		if (buttonBody == null) {
			buttonBody = new JButton();
			buttonBody.setBounds(new Rectangle(369, 37, 97, 26));
			buttonBody.setName("buttonBody");
			buttonBody.setText("Select");
			buttonBody.setFont(new Font("Dialog", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			buttonBody.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.addChoosableFileFilter(new HtmlFilter());
					fileChooser.setAcceptAllFileFilterUsed(false);
					int result = fileChooser.showOpenDialog(tabDice);
					if (result == JFileChooser.APPROVE_OPTION) {
						File fileHTML = fileChooser.getSelectedFile();
						fieldBody.setText(fileHTML.getAbsolutePath());
						mailProps.setEmailHTML(fileHTML);
					}
					
				}
			});
		}
		return buttonBody;
	}

	private JPanel getJPanel6() {
		if (jPanel6 == null) {
			jLabel13 = new JLabel();
			jLabel14 = new JLabel();
			jLabel13.setBounds(new Rectangle(12, 96, 459, 19));
			jLabel13.setFont(new Font("Dialog", Font.BOLD, 13));
			jLabel13.setForeground(SystemColor.activeCaption);
			jLabel13.setText("**ATTENTION : The file must have this format => SURNAME ; EMAIL");
			jLabel14.setBounds(new Rectangle(12, 116, 459, 19));
			jLabel14.setFont(new Font("Dialog", Font.BOLD, 13));
			jLabel14.setForeground(SystemColor.activeCaption );
			jLabel14.setText("  Ex. => john;john123@gmail.com ");
			jLabel12 = new JLabel();
			jLabel12.setFont(new Font("Dialog", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			jLabel12.setText("Recipients : ");
			jLabel12.setBounds(new Rectangle(21, 48, 127, 29));
			jPanel6 = new JPanel();
			jPanel6.setLayout(null);
			jPanel6.setBounds(new Rectangle(13, 192, 482, 161));
			jPanel6.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Recipients", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("DejaVu Sans", Font.BOLD, 15), SystemColor.activeCaption));
			jPanel6.add(jLabel12, null);
			jPanel6.add(getFieldRecipients(), null);
			jPanel6.add(getBtRecipients(), null);
			jPanel6.add(jLabel13, null);
			jPanel6.add(jLabel14, null);
		}
		return jPanel6;
	}

	private JButton getButtonSubmit() {
		if (buttonSend == null) {
			buttonSend = new JButton();
			buttonSend.setName("buttonSend");
			buttonSend.setText("Send Emails");
			buttonSend.setBounds(new Rectangle(158, 370, 194, 30));
			buttonSend.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			buttonSend.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTabbedPane.setEnabledAt(2, false);
					jTabbedPane.setEnabledAt(3, true);
					jTabbedPane.setSelectedIndex(3);			
					ProgressController progress = new ProgressController(mailProps, jProgressBar, textPaneLog);
					progress.start();
				}
			});
		}
		return buttonSend;
	}


	private JTextField getFieldRecipients() {
		if (fieldRecipients == null) {
			fieldRecipients = new JTextField();
			fieldRecipients.setBounds(new Rectangle(145, 50, 225, 27));
			fieldRecipients.setEditable(false);
			fieldRecipients.setName("fieldRecipients");
			fieldRecipients.setFont(new Font("Dialog", Font.LAYOUT_LEFT_TO_RIGHT , 15));
		}
		return fieldRecipients;
	}


	private JButton getBtRecipients() {
		if (btRecipients == null) {
			btRecipients = new JButton();
			btRecipients.setBounds(new Rectangle(368, 50, 97, 26));
			btRecipients.setName("btRecipients");
			btRecipients.setText("Select");
			btRecipients.setFont(new Font("Dialog", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			btRecipients.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					JFileChooser fileChooser = new JFileChooser();
					fileChooser.addChoosableFileFilter(new CSVFilter());
					fileChooser.setAcceptAllFileFilterUsed(false);
					int result = fileChooser.showOpenDialog(tabDice);
					if (result == JFileChooser.APPROVE_OPTION) {
						File fileCSV = fileChooser.getSelectedFile();
						fieldRecipients.setText(fileCSV.getAbsolutePath());
						mailProps.setShipping(fileCSV);
					}
				}
			});
		}
		return btRecipients;
	}

	
	private JPanel getTabProgress() {
		if (tabProgress == null) {
			tabProgress = new JPanel();
			tabProgress.setLayout(null);
			tabProgress.add(getJPanel1(), null);
			tabProgress.add(getJPanel4(), null);
			tabProgress.add(getButtonClose(), null);
		}
		return tabProgress;
	}

	private JPanel getJPanel1() {
		if (jPanel1 == null) {
			jPanel1 = new JPanel();
			jPanel1.setLayout(null);
			jPanel1.setBounds(new Rectangle(11, 13, 484, 93));
			jPanel1.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Progress", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD, 15), SystemColor.activeCaption));
			jPanel1.add(getJProgressBar(), null);
		}
		return jPanel1;
	}


	private JProgressBar getJProgressBar() {
		if (jProgressBar == null) {
			jProgressBar = new JProgressBar();
			jProgressBar.setBounds(new Rectangle(18, 39, 450, 28));
			jProgressBar.setBackground(SystemColor.control);
			jProgressBar.setVisible(false);
		}
		return jProgressBar;
	}

	private JPanel getJPanel4() {
		if (jPanel4 == null) {
			jPanel4 = new JPanel();
			jPanel4.setLayout(null);
			jPanel4.setBounds(new Rectangle(11, 119, 485, 238));
			jPanel4.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(EtchedBorder.RAISED), "Log", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("Dialog", Font.BOLD , 15), SystemColor.activeCaption));
			jPanel4.add(getJScrollPane(), null);
		}
		return jPanel4;
	}

	private JButton getButtonClose() {
		if (buttonClose == null) {
			buttonClose = new JButton();
			buttonClose.setBounds(new Rectangle(158, 370, 194, 30));
			buttonClose.setEnabled(true);
			buttonClose.setText("Close");
			buttonClose.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			buttonClose.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.exit(0);
				}
			});			
		}
		return buttonClose;
	}


	private JTextPane getTextPaneLog() {
		if (textPaneLog == null) {
		textPaneLog = new JTextPane();
		textPaneLog.setEditable(false);
		textPaneLog.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
		textPaneLog.setBounds(new Rectangle(23, 29, 417, 190));
		}
		return textPaneLog;
	}


	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane(getTextPaneLog());
			jScrollPane.setBounds(new Rectangle(18, 25, 450, 194));
			jScrollPane.setFont(new Font("DejaVu Sans Condensed", Font.LAYOUT_LEFT_TO_RIGHT , 15));
			jScrollPane.setViewportView(getTextPaneLog());
			
			jScrollPane.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
		        public void adjustmentValueChanged(AdjustmentEvent e) {  
		            e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
		        }
		    });
			
		}
		return jScrollPane;
	}


	public static void main(String[] args) {
		try {
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	            	jvbm bm1 = new jvbm();
	            	bm1.getJFrame().pack();
	            	bm1.getJFrame().setVisible(true);
	            }
	        });			
		}catch (Exception e){
			e.printStackTrace();
		};
	}		
}
