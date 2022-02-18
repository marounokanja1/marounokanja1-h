package vue;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;

import javax.swing.UIManager;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.Toolkit;

public class IamVue2 extends JFrame {
	
	private JLabel background ;
	private JButton binButton;
	private JButton payButton;
	private JButton cancelButton;
	private JCheckBox agreeCheckBox ;
	private JTextField confEmail;
	private JTextField email;
	private JTextField phone;
	private JPasswordField codeFidelio;
	private JLabel warningLabel;
	private JButton button2;
	private JButton button3;
	private JButton button1;
	private JButton button9;
	private JButton button4;
	private JButton button6;
	private JButton button8;
	private JButton button0;
	private JButton button7;
	private JButton button5;
	String currentPath = System.getProperty("user.dir");

	
	public IamVue2() {
		setTitle("IAM PAIEMENT");
		setForeground(Color.WHITE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(currentPath+"\\pictures\\icons\\Maroc_telecom_logo.png"));
		
		
		setResizable(false);
		this.setBounds(10, 10, 1000,741);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
        binButton = new JButton("");
        binButton.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\sup.jpg"));
		binButton.setBounds(845, 417, 82, 35);
		getContentPane().add(binButton);
		
		payButton = new JButton("");
		payButton.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\payer.jpg"));
		payButton.setBounds(384, 663, 152, 25);
		getContentPane().add(payButton);
		
		cancelButton = new JButton("");
		cancelButton.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\annuler.jpg"));
		cancelButton.setBounds(539, 663, 114, 25);
		getContentPane().add(cancelButton);
		
		agreeCheckBox = new JCheckBox("");
		agreeCheckBox.setBackground(UIManager.getColor("CheckBox.interiorBackground"));
		agreeCheckBox.setBounds(64, 632,21, 17);
		getContentPane().add(agreeCheckBox);
		
		confEmail = new JTextField();
		confEmail.setForeground(Color.RED);
		confEmail.setFont(new Font("Arial Black", Font.PLAIN, 15));
		confEmail.setBackground(UIManager.getColor("TextField.shadow"));
		confEmail.setBounds(533, 540, 428, 30);
		getContentPane().add(confEmail);
		confEmail.setColumns(10);
		
		email = new JTextField();
		email.setFont(new Font("Arial Black", Font.PLAIN, 15));
		email.setForeground(Color.RED);
		email.setBackground(UIManager.getColor("TextField.shadow"));
		email.setBounds(77, 540, 428, 30);
		getContentPane().add(email);
		email.setColumns(10);
		
		phone = new JTextField();
		phone.setForeground(Color.RED);
		phone.setFont(new Font("Arial Black", Font.PLAIN, 15));
		phone.setBackground(UIManager.getColor("TextField.shadow"));
		phone.setBounds(77, 330, 428, 30);
		getContentPane().add(phone);
		phone.setColumns(10);
		
		codeFidelio = new JPasswordField();
		codeFidelio.setEditable(false);
		codeFidelio.setFont(new Font("Arial Black", Font.PLAIN, 18));
		codeFidelio.setForeground(Color.RED);
		codeFidelio.setBackground(UIManager.getColor("TextField.shadow"));
		codeFidelio.setBounds(533, 423, 276, 30);
		getContentPane().add(codeFidelio);
		codeFidelio.setColumns(10);
		
		warningLabel = new JLabel("");
		warningLabel.setForeground(Color.RED);
		warningLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		warningLabel.setBounds(539, 364, 335, 25);
		getContentPane().add(warningLabel);
		
		button1 = new JButton("");
		button1.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\1.jpg"));
		button1.setBounds(71, 402, 87, 37);
		getContentPane().add(button1);
		
		button2 = new JButton("");
		button2.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\2.jpg"));
		button2.setBounds(160, 402, 87, 37);
		getContentPane().add(button2);
		
		button9 = new JButton("");
		button9.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\9.jpg"));
		button9.setBounds(249, 402, 87, 37);
		getContentPane().add(button9);
		
		button4= new JButton("");
		button4.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\4.jpg"));
		button4.setBounds(338, 402, 87, 37);
		getContentPane().add(button4);
		
		button6= new JButton("");
		button6.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\6.jpg"));
		button6.setBounds(427, 402, 87, 37);
		getContentPane().add(button6);
		
		button8= new JButton("");
		button8.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\8.jpg"));
		button8.setBounds(71, 447, 87, 37);
		getContentPane().add(button8);
		
		button0= new JButton("");
		button0.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\0.jpg"));
		button0.setBounds(160, 447, 87, 37);
		getContentPane().add(button0);
		
		
		button7= new JButton("");
		button7.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\7.jpg"));
		button7.setBounds(249, 447, 87, 37);
		getContentPane().add(button7);
		
		button5= new JButton("");
		button5.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\5.jpg"));
		button5.setBounds(338, 447, 87, 37);
		getContentPane().add(button5);
		
		button3= new JButton("");
		button3.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\3.jpg"));
		button3.setBounds(427, 447, 87, 37);
		getContentPane().add(button3);
		
		
		
		
		
		background = new JLabel("");
		background.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\RECT.jpg"));
		background.setBounds(0, 0, 984, 700);
		getContentPane().add(background);
		
		
		
		
		
		
		
	
	}

	public JButton getBinButton() {
		return binButton;
	}

	public JButton getPayButton() {
		return payButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public boolean getAgreeCheckBox() {
		return agreeCheckBox.isSelected();
	}

	public String getConfEmail() {
		return confEmail.getText();
	}

	public String getEmail() {
		return email.getText();
	}

	public String getPhone() {
		return phone.getText();
	}

	public String getCodeFidelio() {
		return codeFidelio.getText();
	}
	
	public void setWarningLabel(String s) {
		this.warningLabel.setText(s);;
	}
	
	public void setCodeFid(String s)
	{
		codeFidelio.setText(s);
	}

	
	public void allActionListener(ActionListener mybtn)
	
	{
		cancelButton.addActionListener(mybtn);
		payButton.addActionListener(mybtn);
		binButton.addActionListener(mybtn);
		button0.addActionListener(mybtn);
		button1.addActionListener(mybtn);
		button2.addActionListener(mybtn);
		button3.addActionListener(mybtn);
		button4.addActionListener(mybtn);
		button5.addActionListener(mybtn);
		button6.addActionListener(mybtn);
		button7.addActionListener(mybtn);
		button8.addActionListener(mybtn);
		button9.addActionListener(mybtn);
		
		
		
	}

	public JButton getButton2() {
		return button2;
	}

	public JButton getButton3() {
		return button3;
	}

	public JButton getButton1() {
		return button1;
	}

	public JButton getButton9() {
		return button9;
	}

	public JButton getButton4() {
		return button4;
	}

	public JButton getButton6() {
		return button6;
	}

	public JButton getButton8() {
		return button8;
	}

	public JButton getButton0() {
		return button0;
	}

	public JButton getButton7() {
		return button7;
	}

	public JButton getButton5() {
		return button5;
	}
	
	
}
