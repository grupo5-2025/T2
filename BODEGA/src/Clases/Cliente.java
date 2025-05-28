package Clases;

import java.util.List;

public class Cliente {
	private int idCliente, dni;
	private String nombre;
	private List<Boleta>boletas;
	public Cliente(int idCliente, int dni, String nombre, List<Boleta> boletas) {
		this.idCliente = idCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.boletas = boletas;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
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
	public List<Boleta> getBoletas() {
		return boletas;
	}
	public void setBoletas(List<Boleta> boletas) {
		this.boletas = boletas;
	}

}
