package Clases;

public class Detalle_Boleta {
	private int cantidadCompradas;
	private double subtotal;
	private Producto producto;
	private Boleta boleta;
	public Detalle_Boleta(int cantidadCompradas, double subtotal, Producto producto, Boleta boleta) {
		this.cantidadCompradas = cantidadCompradas;
		this.subtotal = subtotal; 
		this.producto = producto;
		this.boleta = boleta;
	}
	public int getCantidadCompradas() {
		return cantidadCompradas;
	}
	public void setCantidadCompradas(int cantidadCompradas) {
		this.cantidadCompradas = cantidadCompradas;
	}
	public double getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Boleta getBoleta() {
		return boleta;
	}
	public void setBoleta(Boleta boleta) {
		this.boleta = boleta;
	}

}
