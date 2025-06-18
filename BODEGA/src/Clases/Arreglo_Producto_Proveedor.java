package Clases;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Arreglo_Producto_Proveedor {
	Connection cn=mysql.conexion.getConnection();

	    public void registrar_producto_prov(Producto_prov pp) {
	        try {
	            CallableStatement cs = cn.prepareCall("{call sp_ingresar_producto_provee(?, ?)}");
	            cs.setString(1, pp.getIdProducto());
	            cs.setString(2, pp.getIdProveedor());
	            cs.executeUpdate();
	            cs.close();
	        } catch (Exception e) {
	            System.out.println("Error al registrar producto_proveedor: " + e);
	        }
	    }

	    public ArrayList<Producto_prov> listar_producto_prov() {
	        ArrayList<Producto_prov> lista = new ArrayList<>();
	        try {
	            CallableStatement cs = cn.prepareCall("{call sp_listar_producto_prov()}");
	            ResultSet rs = cs.executeQuery();
	            while (rs.next()) {
	                String idProducto = rs.getString("idproducto");
	                String idProveedor = rs.getString("idproveedor");
	                lista.add(new Producto_prov(idProducto, idProveedor));
	            }
	            rs.close();
	            cs.close();
	        } catch (Exception e) {
	            System.out.println("Error al listar producto_proveedor: " + e);
	        }
	        return lista;
	    }
}
