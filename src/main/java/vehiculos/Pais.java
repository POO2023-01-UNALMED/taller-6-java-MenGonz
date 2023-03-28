package vehiculos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Pais {

	//Atributos
	private String nombre;
	//Este diccionario almacena ventas realizadas por país
	static Map<Pais, Integer> ventasPorPais = new HashMap <Pais, Integer>();
	

	//aquí debería ir el método paisMasVendedor pero xD


	//Constructor
	public Pais(String nombre){
		this.nombre = nombre;
	}

	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
