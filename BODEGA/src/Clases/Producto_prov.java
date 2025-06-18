package Clases;

public class Producto_prov {
	private String idProducto;
    private String idProveedor;
	public Producto_prov(String idProducto, String idProveedor) {
		this.idProducto = idProducto;
		this.idProveedor = idProveedor;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
    
}
