package Clases;

import java.util.ArrayList;
import java.util.List;

public class Arreglo_Cliente  {  
	private ArrayList<Cliente> clientes;

    public Arreglo_Cliente() {
        clientes = new ArrayList<Cliente>();
        List<Boleta> boletasVacia = new ArrayList<>();
        
        clientes.add(new Cliente(1, 12345678, "Juan Pérez", boletasVacia));
        clientes.add(new Cliente(2, 87654321, "María Torres", boletasVacia));
    }

    public void adicionar(Cliente c) {
        clientes.add(c);
    }

    public Cliente obtener(int pos) {
        return clientes.get(pos);
    }

    public Cliente buscarPorDni(int dni) {
        for (Cliente c : clientes) {
            if (c.getDni() == dni) {
                return c;
            }
        }
        return null;
    }

    public int tamaño() {
        return clientes.size();
    }
}
