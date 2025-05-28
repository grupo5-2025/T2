package Clases;

import java.util.ArrayList;

public class Proveedor {
	private int idproveedor, ruc;
	private String nombreProveedor;
    private ArrayList<Producto> productos;
	public Proveedor(int idproveedor, int ruc, String nombreProveedor) {
		this.idproveedor = idproveedor;
		this.ruc = ruc;
		this.nombreProveedor = nombreProveedor;
		this.productos=new ArrayList<>();
	}
	public int getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(int idproveedor) {
		this.idproveedor = idproveedor;
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

}
