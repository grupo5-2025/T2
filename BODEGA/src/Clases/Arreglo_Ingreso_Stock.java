package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Timestamp;

public class Arreglo_Ingreso_Stock {
	Connection cn=mysql.conexion.getConnection();

	public void registrar_ingreso_stock(Ingreso_Stock i) {
        try {
            CallableStatement cs = cn.prepareCall("{call sp_ingresarstock(?, ?, ?)}");
            cs.setString(1, i.getIdRegistro());
            cs.setTimestamp(2, Timestamp.valueOf(i.getFechaRegistro())); 
            cs.setInt(3, i.getCantidadBultos());
            cs.executeUpdate();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al registrar ingreso de stock: " + e);
        }
    }


}
