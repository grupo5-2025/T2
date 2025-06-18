package mysql;

import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
public static Connection getConnection() {
	Connection cnx=null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver correcto");
		cnx=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bodega","root","mysql");
		System.out.println("Conexión correcta");
	}catch (Exception e) {
		System.out.println("Error: "+e);
	}
	return cnx;
}
public static void main(String[] args) {
    getConnection(); 
}
}
