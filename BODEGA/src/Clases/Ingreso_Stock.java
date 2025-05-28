package Clases;

import java.time.LocalDateTime;
import java.util.List;

public class Ingreso_Stock {
	private int idregistro,cantidadBultos;
	private LocalDateTime fechaRegistro;
	private List<Detalle_Ingreso>detallesIngreso;
	public Ingreso_Stock(int idregistro, int cantidadBultos, LocalDateTime fechaRegistro,
			List<Detalle_Ingreso> detallesIngreso) {
		this.idregistro = idregistro;
		this.cantidadBultos = cantidadBultos;
		this.fechaRegistro = fechaRegistro;
		this.detallesIngreso = detallesIngreso;
	}
	public int getIdregistro() {
		return idregistro;
	}
	public void setIdregistro(int idregistro) {
		this.idregistro = idregistro;
	}
	public int getCantidadBultos() {
		return cantidadBultos;
	}
	public void setCantidadBultos(int cantidadBultos) {
		this.cantidadBultos = cantidadBultos;
	}
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public List<Detalle_Ingreso> getDetallesIngreso() {
		return detallesIngreso;
	}
	public void setDetallesIngreso(List<Detalle_Ingreso> detallesIngreso) {
		this.detallesIngreso = detallesIngreso;
	}

}
