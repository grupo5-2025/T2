package Clases;

import java.util.List;

public class Producto {
	private Proveedor proveedor;
	private int idproducto, stock;
	private String nombreProducto;
	private double precio;
	private List<Detalle_Ingreso>detallesingreso;
	private List<Detalle_Boleta>detallesboleta;
	public Producto(int idproducto, int stock, String nombreProducto, double precio,Proveedor proveedor) {
		this.idproducto = idproducto;
		this.stock = stock;
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.proveedor=proveedor;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public List<Detalle_Ingreso> getDetallesingreso() {
		return detallesingreso;
	}
	public void setDetallesingreso(List<Detalle_Ingreso> detallesingreso) {
		this.detallesingreso = detallesingreso;
	}
	public List<Detalle_Boleta> getDetallesboleta() {
		return detallesboleta;
	}
	public void setDetallesboleta(List<Detalle_Boleta> detallesboleta) {
		this.detallesboleta = detallesboleta;
	}
	

}
