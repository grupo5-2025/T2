package Clases;

import java.util.ArrayList;

public class Arreglo_Proveedor {
		private ArrayList<Proveedor>provee;

	public Arreglo_Proveedor(){
		provee=new ArrayList<Proveedor>();
		adicionar(new Proveedor(10, 123456, "Vittorio"));
	}
	public void add(Proveedor c) {
	provee.add(c);
	}
	public Proveedor obtene(int c) {
		return provee.get(c);
	}
	public Proveedor buscar(int code) {
		for (int i=0;i<provee.size();i++) {
			if(obtene(i).getIdproveedor()==code) return obtene(i);
		}
		return null;
	}
	public int tamaño() {
		return provee.size();
	}
	public void adicionar(Proveedor c) {
	provee.add(c);
	}
	public Proveedor get(int s) {
		return provee.get(s);
	}
}

