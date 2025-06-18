package Clases;

import java.util.List;

public class Cliente {
	private String idCliente;
    private int dni;
    private String nombre;
	public Cliente(String idCliente, int dni, String nombre) {
		this.idCliente = idCliente;
		this.dni = dni;
		this.nombre = nombre;
	}
	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
    
}
