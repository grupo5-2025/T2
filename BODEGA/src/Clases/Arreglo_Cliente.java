package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Arreglo_Cliente  {  
	Connection cn=mysql.conexion.getConnection();

    public void registrar_Cliente(Cliente c) {
        try {
            CallableStatement cs = cn.prepareCall("{call sp_regis_cliente(?, ?, ?)}");
            cs.setString(1, c.getIdCliente());
            cs.setInt(2, c.getDni());
            cs.setString(3, c.getNombre());
            cs.executeUpdate();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al registrar cliente: " + e);
        }
    }

    public static ArrayList<Cliente> listar_cliente() {
        ArrayList<Cliente> lista = new ArrayList<>();
        try {
            CallableStatement cs = cn.prepareCall("{call sp_listarclientes()}");
            ResultSet rs = cs.executeQuery();
            while (rs.next()) {
                String id = rs.getString("idcliente");
                int dni = rs.getInt("dni");
                String nombre = rs.getString("nombre");
                lista.add(new Cliente(id, dni, nombre));
            }
            rs.close();
            cs.close();
        } catch (Exception e) {
            System.out.println("Error al listar clientes: " + e);
        }
        return lista;
    }
}
