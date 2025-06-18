package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Arreglo_Proveedor {
	Connection cnx=mysql.conexion.getConnection();
    public void registrar_proveedor(Proveedor p) {
        try {
            CallableStatement cs = cnx.prepareCall("{call sp_ingresar_prov(?, ?, ?)}");
            cs.setString(1, p.getIdProveedor());
            cs.setString(2, p.getNombreProveedor());
            cs.setInt(3, p.getRuc());
            cs.executeUpdate();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al registrar proveedor: " + e);
        }
    }

    public ArrayList<Proveedor> listar_proveedor() {
        ArrayList<Proveedor> lista = new ArrayList<>();
        try {
            CallableStatement cs = cnx.prepareCall("{call sp_listarprov()}");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                String id = rs.getString("idproveedor");
                String nombre = rs.getString("nombreproveedor");
                int ruc = rs.getInt("ruc");
                lista.add(new Proveedor(id, nombre, ruc));
            }
            rs.close();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al listar proveedores: " + e);
        }
        return lista;
    }

    public ArrayList<Proveedor> buscar_proveedor(Proveedor p) {
        ArrayList<Proveedor> lista = new ArrayList<>();
        try {
            CallableStatement cs = cnx.prepareCall("{call sp_buscar_prov()}");
            cs.executeUpdate();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al listar proveedores: " + e);
        }
        return lista;
    }
}

