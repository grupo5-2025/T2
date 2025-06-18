package Clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Boleta {
	private String idBoleta;
    private LocalDateTime fechaEmision;
    private float total;
    private String idCliente;
    private ArrayList<Detalle_Boleta> detalle = new ArrayList();

	public Boleta(String idBoleta, LocalDateTime fechaEmision, float total, String idCliente) {
		this.idBoleta = idBoleta;
		this.fechaEmision = fechaEmision;
		this.total = total;
		this.idCliente = idCliente;
	}
	public String getIdBoleta() {
		return idBoleta;
	}
	public void setIdBoleta(String idBoleta) {
		this.idBoleta = idBoleta;
	}
	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public ArrayList<Detalle_Boleta> getDetalle() {
	    return detalle;
	}

	public void setDetalle(ArrayList<Detalle_Boleta> detalle) {
	    this.detalle = detalle;
	}
}
