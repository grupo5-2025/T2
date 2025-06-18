package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

import Clases.Arreglo_Proveedor;
import Clases.Producto;
import Clases.Proveedor;
public class Arreglo_Producto {
 public Connection cn=mysql.conexion.getConnection();
public void registrar_producto(Producto p) {
    try {
        CallableStatement cs = cn.prepareCall("{call sp_regist_producto(?, ?, ?, ?)}");
        cs.setString(1, p.getIdProducto());
        cs.setString(2, p.getNombreProducto());
        cs.setFloat(3, p.getPrecio());
        cs.setInt(4, p.getStock());
        cs.executeUpdate();
        cs.close();
    } catch (Exception e) {
        System.out.println("Error al registrar producto: " + e);
    }
}

public ArrayList<Producto> listar_producto() {
    ArrayList<Producto> lista = new ArrayList<>();
    try {
        CallableStatement cs = cn.prepareCall("{call sp_Listar_productos()}");
        ResultSet rs = cs.executeQuery();
        while (rs.next()) {
            String id = rs.getString("idproducto");
            String nombre = rs.getString("nombreproducto");
            float precio = rs.getFloat("precio");
            int stock = rs.getInt("stock");
            lista.add(new Producto(id, nombre, precio, stock));
        }
        rs.close();
        cs.close();
    } catch (Exception e) {
        System.out.println("Error al listar productos: " + e);
    }
    return lista;
}

public Producto buscarProductoPorId(String idProducto) {
    Producto prod = null;
    try {
        CallableStatement cs = cn.prepareCall("{call sp_buscar_producto(?)}");
        cs.setString(1, idProducto);
        ResultSet rs = cs.executeQuery();
        if (rs.next()) {
            String id = rs.getString("idproducto");
            String nombre = rs.getString("nombreproducto");
            float precio = rs.getFloat("precio");
            int stock = rs.getInt("stock");  // <--- aquí está el cambio
            prod = new Producto(id, nombre, precio, stock);  // <--- constructor con 4 parámetros
        }
        rs.close();
        cs.close();
    } catch (Exception e) {
        System.out.println("Error al buscar producto: " + e);
    }
    return prod;
}

}