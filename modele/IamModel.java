package modele;

import java.sql.*;
public class IamModel {
	
	Connection con ;
	String url,pilote,query;
	ResultSet rs;
	Statement st;
	int rs2;
	
	
	public IamModel() {
		
	}
	
	public void connectionClient(boolean i) throws ClassNotFoundException , SQLException
	{ 
		
		if(i==true)
		{
						pilote=new String("com.mysql.jdbc.Driver");
						url = new String("jdbc:mysql://localhost/iam?autoReconnect=true&useSSL=false");
						con = DriverManager.getConnection(url,"root","");
						st=con.createStatement();
	
	
		}
		else
		{
			con.close();
		}
	}
		
	

	public boolean verifierClient(int c , String n) throws SQLException
    {
		query = "SELECT COUNT(*) as rowCount FROM client WHERE NumT='"+n+"' AND  codeFed  = "+c ;
		rs =st.executeQuery(query);
		rs.next();
		int count = rs.getInt("rowcount");
		if(count==0)
			return false;
		else return true;
		
    }
	
	public boolean verifierFacture(String n) throws SQLException
	{
		query = "SELECT COUNT(*) as rowCount FROM facture f , client c WHERE c.NumT=f.NumC and f.service='mobile' and c.NumT="+n;
		rs =st.executeQuery(query);
		rs.next();
		int count = rs.getInt("rowcount");
		if(count==0)
			return false;
		else return true;
		
	}
	
   
    

}
