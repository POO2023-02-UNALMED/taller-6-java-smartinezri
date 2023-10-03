package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo {

	private int ejes;
	private static ArrayList<Camion> camiones = new ArrayList<>();
	//private static int cantidadCamiones = 0;
	
	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
		//Camion.cantidadCamiones++;
		camiones.add(this);
	}
	
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	public int getEjes() {
		return ejes;
	}
	
	/*public static void setCantidadCamiones(int camiones) {
		Camion.cantidadCamiones = camiones;
	}*/
	
	public static int cantidadCamiones() {
		return camiones.size();
	}
	
}
