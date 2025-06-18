package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Arreglo_Detalle_boleta {
 Connection cn=mysql.conexion.getConnection();

    public void registrar_detalle_boleta(Detalle_Boleta d) {
        try {
            CallableStatement cs = cn.prepareCall("{call sp_detalle_boleta(?, ?, ?, ?, ?)}");
            cs.setString(1, d.getIdDetalleBoleta());
            cs.setString(2, d.getIdBoleta());
            cs.setString(3, d.getIdProducto());
            cs.setInt(4, d.getCantidadComprada());
            cs.setFloat(5, d.getSubtotal());
            cs.executeUpdate();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al registrar detalle de boleta: " + e);
        }
    }

    public ArrayList<Detalle_Boleta> listar_detalle_boleta() {
        ArrayList<Detalle_Boleta> lista = new ArrayList<>();
        try {
            CallableStatement cs = cn.prepareCall("{call sp_listar_detalle_boleta()}");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                String idDetalle = rs.getString("iddetalle_boleta");
                String idBoleta = rs.getString("idboleta");
                String idProducto = rs.getString("idproducto");
                int cantidad = rs.getInt("cantidadcomprada");
                float subtotal = rs.getFloat("subtotal");

                lista.add(new Detalle_Boleta(idDetalle, idBoleta, idProducto, cantidad, subtotal));
            }
            rs.close();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al listar detalles de boleta: " + e);
        }
        return lista;
    }
}
