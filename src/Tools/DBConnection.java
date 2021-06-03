package Tools;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private Connection con;
	public DBConnection(){
		String className = "com.mysql.jdbc.Driver";
		String url = "jdbc:mysql://127.0.0.1:3306/wtu?useUnicode=true&"
				+"characterEncoding=utf-8";
		String username ="root";
		String password = "990428";
		try{
			Class.forName(className);
			Connection con = DriverManager.getConnection(url,username,password);
		}catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	public Connection getCon() {
		return con;
	}
	public void setCon(Connection con) {
		this.con = con;
	}
	
	
}
