package Clases;

public class Detalle_Boleta {
	private String idDetalleBoleta;
    private String idBoleta;
    private String idProducto;
    private int cantidadComprada;
    private float subtotal;
	public Detalle_Boleta(String idDetalleBoleta, String idBoleta, String idProducto, int cantidadComprada,
			float subtotal) {
		this.idDetalleBoleta = idDetalleBoleta;
		this.idBoleta = idBoleta;
		this.idProducto = idProducto;
		this.cantidadComprada = cantidadComprada;
		this.subtotal = subtotal;
	}
	public String getIdDetalleBoleta() {
		return idDetalleBoleta;
	}
	public void setIdDetalleBoleta(String idDetalleBoleta) {
		this.idDetalleBoleta = idDetalleBoleta;
	}
	public String getIdBoleta() {
		return idBoleta;
	}
	public void setIdBoleta(String idBoleta) {
		this.idBoleta = idBoleta;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public int getCantidadComprada() {
		return cantidadComprada;
	}
	public void setCantidadComprada(int cantidadComprada) {
		this.cantidadComprada = cantidadComprada;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public Producto getProducto() {
	    Arreglo_Producto ap = new Arreglo_Producto();
	    return ap.buscarProductoPorId(idProducto);
	}
    
}
