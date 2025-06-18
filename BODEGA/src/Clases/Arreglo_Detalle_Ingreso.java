package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;

public class Arreglo_Detalle_Ingreso {
	 Connection cn=mysql.conexion.getConnection();

    public void registrar_detalle_ingreso(Detalle_Ingreso d) {
        try {
            CallableStatement cs = cn.prepareCall("{call sp_detalle_ingreso(?, ?, ?, ?)}");
            cs.setString(1, d.getIdDetalleIngreso());
            cs.setString(2, d.getIdRegistro());
            cs.setString(3, d.getIdProducto());
            cs.setInt(4, d.getCantidadProducto());
            cs.executeUpdate();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al registrar detalle ingreso: " + e);
        }
    }
}
