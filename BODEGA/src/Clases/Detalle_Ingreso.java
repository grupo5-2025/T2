package Clases;

public class Detalle_Ingreso {
	private int cantidadProducto;
	private Producto producto;
	private Ingreso_Stock ingresoStock;
	public Detalle_Ingreso(int cantidadProducto, Producto producto, Ingreso_Stock ingresoStock) {
		this.cantidadProducto = cantidadProducto;
		this.producto = producto;
		this.ingresoStock = ingresoStock;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Ingreso_Stock getIngresoStock() {
		return ingresoStock;
	}
	public void setIngresoStock(Ingreso_Stock ingresoStock) {
		this.ingresoStock = ingresoStock;
	}

}
