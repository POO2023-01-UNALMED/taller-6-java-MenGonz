package vehiculos;

//Importaciones
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class Fabricante {
	
	//Atributos
	private String nombre;
	private Pais pais;
	//Este diccionario almacena ventas realizadas por fabricante
	static Map<Fabricante, Integer> ventasPorFabrica = new HashMap <Fabricante, Integer>();

	//Constructor
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;	
	}
	
	//aquí debería ir el método fabricaMayorVentas() pero xD


	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}

}
