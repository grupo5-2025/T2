package Clases;

public class Detalle_Ingreso {
	private String idDetalleIngreso;
    private String idRegistro;
    private String idProducto;
    private int cantidadProducto;
	public Detalle_Ingreso(String idDetalleIngreso, String idRegistro, String idProducto, int cantidadProducto) {
		this.idDetalleIngreso = idDetalleIngreso;
		this.idRegistro = idRegistro;
		this.idProducto = idProducto;
		this.cantidadProducto = cantidadProducto;
	}
	public String getIdDetalleIngreso() {
		return idDetalleIngreso;
	}
	public void setIdDetalleIngreso(String idDetalleIngreso) {
		this.idDetalleIngreso = idDetalleIngreso;
	}
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
}
