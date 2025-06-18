package Clases;

import java.util.ArrayList;

public class Proveedor {
	private String idProveedor;
    private String nombreProveedor;
    private int ruc;
	public Proveedor(String idProveedor, String nombreProveedor, int ruc) {
		this.idProveedor = idProveedor;
		this.nombreProveedor = nombreProveedor;
		this.ruc = ruc;
	}
	public String getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public int getRuc() {
		return ruc;
	}
	public void setRuc(int ruc) {
		this.ruc = ruc;
	}
    
}
