package Clases;

import java.time.LocalDateTime;
import java.util.List;

public class Ingreso_Stock {
	private String idRegistro;
    private LocalDateTime fechaRegistro;
    private int cantidadBultos;
	public Ingreso_Stock(String idRegistro, LocalDateTime fechaRegistro, int cantidadBultos) {
		this.idRegistro = idRegistro;
		this.fechaRegistro = fechaRegistro;
		this.cantidadBultos = cantidadBultos;
	}
	public String getIdRegistro() {
		return idRegistro;
	}
	public void setIdRegistro(String idRegistro) {
		this.idRegistro = idRegistro;
	}
	public LocalDateTime getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(LocalDateTime fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	public int getCantidadBultos() {
		return cantidadBultos;
	}
	public void setCantidadBultos(int cantidadBultos) {
		this.cantidadBultos = cantidadBultos;
	}

}
