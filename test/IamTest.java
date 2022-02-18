package test;

import java.sql.SQLException;

import controler.IamControler;
import modele.IamModel;
import vue.IamVue1;
import vue.IamVue2;


public class IamTest {

	public static void main(String[] args) {
		
		
		IamVue1 a = new IamVue1();
		IamVue2 b = new IamVue2();
		IamModel c = new IamModel();
		IamControler f = new IamControler(a,b,c);

}
}
