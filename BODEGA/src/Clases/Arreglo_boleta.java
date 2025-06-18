package Clases;

import java.beans.Statement;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Arreglo_boleta {
Connection cn=mysql.conexion.getConnection();
public void registrar_boleta(Boleta b) {
    try {
        CallableStatement cs = cn.prepareCall("{call sp_ingresar_boleta(?, ?, ?, ?)}");
        cs.setString(1, b.getIdBoleta());
        cs.setTimestamp(2, Timestamp.valueOf(b.getFechaEmision()));
        cs.setFloat(3, b.getTotal());
        cs.setString(4, b.getIdCliente());
        cs.executeUpdate();
        cs.close();
    } catch (Exception e) {
        System.out.println("Error al registrar boleta: " + e);
    }
}

public ArrayList<Boleta> listar_boleta() {
    ArrayList<Boleta> lista = new ArrayList<>();
    try {
        CallableStatement cs = cn.prepareCall("{call sp_listar_boleta()}");
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            String id = rs.getString("idboleta");
            LocalDateTime fecha = rs.getTimestamp("fechaemision").toLocalDateTime();
            float total = rs.getFloat("total");
            String idCliente = rs.getString("idcliente");
            lista.add(new Boleta(id, fecha, total, idCliente));
        }
        rs.close();
        cs.close();
    } catch (Exception e) {
        System.out.println("Error al listar boletas: " + e);
    }
    return lista;
}
}
