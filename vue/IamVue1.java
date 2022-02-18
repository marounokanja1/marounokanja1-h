package vue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Toolkit;

public class IamVue1 extends JFrame{
	 
	private JLabel background2;
	private JButton mobileButton;
	private JButton internetButton;
	private JButton fixeButton;
	String currentPath = System.getProperty("user.dir");


	public IamVue1() {
		System.out.println(currentPath);
		setTitle("IAM PAIEMENT");
		setIconImage(Toolkit.getDefaultToolkit().getImage(currentPath+"\\pictures\\icons\\Maroc_telecom_logo.png"));
		
		
		
		
		
		getContentPane().setLayout(null);
		mobileButton = new JButton("");
		mobileButton.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\serv1.jpg"));
		mobileButton.setBounds(10, 160, 367, 287);
		getContentPane().add(mobileButton);
		
		
		fixeButton = new JButton("");
		fixeButton.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\item2.jpg"));
		fixeButton.setBounds(403, 160, 367, 284);
		getContentPane().add(fixeButton);
		
		internetButton = new JButton("");
		internetButton.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\item3.jpg"));
		internetButton.setBounds(790, 160, 367, 284);
		getContentPane().add(internetButton);
		
		
		background2 = new JLabel("");
		background2.setIcon(new ImageIcon(currentPath+"\\pictures\\icons\\VERSO.png"));
		background2.setBounds(0, 0, 1164, 491);
		getContentPane().add(background2);
		
		setResizable(false);
		
		this.setBounds(150, 150, 1180, 530);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
	}

	public JButton getMobileButton() {
		return mobileButton;
	}
	
	public void allButtons(ActionListener mybtn) {
		mobileButton.addActionListener(mybtn);
		fixeButton.addActionListener(mybtn);
		internetButton.addActionListener(mybtn);
		
	}

	public JButton getInternetButton() {
		return internetButton;
	}

	public JButton getFixeButton() {
		return fixeButton;
	}
	
	
	
	
}
