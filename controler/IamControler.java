package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modele.IamModel;
import vue.IamVue1;
import vue.IamVue2;

public class IamControler implements ActionListener {

	private IamVue1 vue1;
	private IamVue2 vue2;
	private IamModel model;
	
  
	
	
	
	public IamControler(IamVue1 vue1, IamVue2 vue2, IamModel model) {
		this.vue1 = vue1;
		this.vue1.setVisible(true);
		this.vue2 = vue2;
		this.model = model;
		this.vue2.allActionListener(this);
		this.vue1.allButtons(this);
		
		try {
			this.model.connectionClient(true);
		} catch (ClassNotFoundException e) {	
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}



	@Override
	public void actionPerformed(ActionEvent e) {
	
		Object s = e.getSource();
		if(s==vue1.getMobileButton())
		{
			this.vue1.setVisible(false);
			this.vue2.setVisible(true);
			vue2.setWarningLabel("");
			
			
		}
		if(s==vue1.getFixeButton())
		{
			JOptionPane.showMessageDialog(this.vue1," Pas de Service ");

			
			
		}
		if(s==vue1.getInternetButton())
		{
			JOptionPane.showMessageDialog(this.vue1," Pas de Service ");

			
		}
		if(s==vue2.getCancelButton())
		{
			this.vue1.setVisible(true);
			this.vue2.setVisible(false);
			
		}
		if(s==vue2.getPayButton())
		{
			if(vue2.getConfEmail().equals("") || vue2.getEmail().equals("") || vue2.getPhone().equals("") || vue2.getCodeFidelio().equals("") || vue2.getAgreeCheckBox()==false )
			{
				vue2.setWarningLabel("VOUS DEVEZ RENSEIGNER TOUS LES CHAMPS");
			}
			else if((!vue2.getConfEmail().equals(vue2.getEmail())) || !vue2.getEmail().contains("@gmail.com") )
			{
				vue2.setWarningLabel("verifier l'email");
			}
			else if(vue2.getPhone().length()!=10)
			{
				vue2.setWarningLabel("verifier le Numèro de Telephone");
			}
			else
			{
				try {
					if(model.verifierClient(Integer.parseInt(vue2.getCodeFidelio()),vue2.getPhone()))
					{
						vue2.setWarningLabel("COMPTE VERIFIE");
						if(!model.verifierFacture(vue2.getPhone()))
						{
							JOptionPane.showMessageDialog(this.vue2,"Vous N'avez Aucune Facture A Payer pour ce service");
						}
						else
						{
							JOptionPane.showMessageDialog(this.vue2,"Vous avez quelque Facture A Payer pour ce service");
						}
						
					}
					else
					{
						vue2.setWarningLabel("COMPTE INCONNU");
						
					}
				} catch (NumberFormatException e1) {
					e1.printStackTrace();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
			
		}
		if(s==vue2.getBinButton())
		{
			this.vue2.setCodeFid("");
		}
		if(s==vue2.getButton1())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"1");
		}
		if(s==vue2.getButton2())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"2");
		}
		if(s==vue2.getButton3())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"3");
		}
		if(s==vue2.getButton4())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"4");
		}
		if(s==vue2.getButton5())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"5");
		}
		if(s==vue2.getButton6())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"6");
		}
		if(s==vue2.getButton7())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"7");
		}
		if(s==vue2.getButton8())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"8");
		}
		if(s==vue2.getButton9())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"9");
		}
		if(s==vue2.getButton0())
		{
			this.vue2.setCodeFid(this.vue2.getCodeFidelio()+"0");
		}
		
		
	}

}
