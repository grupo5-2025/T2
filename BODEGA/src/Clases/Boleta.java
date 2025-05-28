package Clases;

import java.time.LocalDateTime;
import java.util.List;

public class Boleta {
	private int idboleta;
	private LocalDateTime fechaEmision;
	private double total; 
	private Cliente cliente;
	private List<Detalle_Boleta>detalle;
	public Boleta(int idboleta, LocalDateTime fechaEmision, double total, Cliente cliente,
			List<Detalle_Boleta> detalle) {
		this.idboleta = idboleta;
		this.fechaEmision = fechaEmision;
		this.total = total;
		this.cliente = cliente;
		this.detalle = detalle;
	}
	public int getIdboleta() {
		return idboleta;
	}
	public void setIdboleta(int idboleta) {
		this.idboleta = idboleta;
	}
	public LocalDateTime getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(LocalDateTime fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public List<Detalle_Boleta> getDetalle() {
		return detalle;
	}
	public void setDetalle(List<Detalle_Boleta> detalle) {
		this.detalle = detalle;
	}

}
