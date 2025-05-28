package Clases;

import java.util.ArrayList;

import Clases.Arreglo_Proveedor;
import Clases.Producto;
import Clases.Proveedor;
public class Arreglo_Producto {
	private ArrayList<Producto> product;
    private ArrayList<Proveedor> provee;
public Arreglo_Producto() {
	product = new ArrayList<>();
    provee = new ArrayList<>();
    Proveedor prov1 = new Proveedor(10, 123456, "Vittorio");
    provee.add(prov1);
    Producto prod1 = new Producto(1020, 10, "Fideos", 10, prov1);
    product.add(prod1);
    prov1.agregarProducto(prod1);
}
public void adicionar(Producto c) {
product.add(c);
}
public Producto obtener(int c) {
	return product.get(c);
}
public Producto buscar(int code) {
	for (int i=0;i<product.size();i++) {
		if(obtener(i).getIdproducto()==code) return obtener(i);
	}
	return null;
}
public int tamaño() {
	return product.size();
}
public void adicionar(Proveedor c) {
provee.add(c);
}
public Proveedor get(int s) {
	return provee.get(s);
}
}