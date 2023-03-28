package vehiculos;

import java.util.*;
import java.util.stream.Collectors;

public class Pais {

	//Atributos
	private String nombre;

	public static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	

	//Método
	public static Pais paisMasVendedor(){
		
		Map<Pais,Long> counts = paises.stream().collect(Collectors.groupingBy(e -> e,Collectors.counting()));
		Pais s = counts.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
		return s;
	}
	

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
