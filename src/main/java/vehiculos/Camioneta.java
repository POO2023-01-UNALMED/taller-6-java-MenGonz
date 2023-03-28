package vehiculos;

public class Camioneta extends Vehiculo {

	//Atributos
	private boolean volco;
	private static int cantidadCamionetas;
	

	//Constructor
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas++;
	}


	//Getters y Setters
	public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}
	public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}

	/*Los getter y setter de Volco tienen una forma distinta a la estándar, 
	esto debido a que el atributo volco es de tipo boolean y le aplica una convención distinta.
	 */
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
}
