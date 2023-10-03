package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo {

	private boolean volco;
	private static ArrayList<Camioneta> camionetas = new ArrayList<>();
	//private static int cantidadCamionetas = 0;
	
	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		//Camioneta.cantidadCamionetas++;
		camionetas.add(this);
	}
	
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	public boolean isVolco() {
		return volco;
	}
	
	/*public static void setCantidadCamionetas(int cantidadCamionetas) {
		Camioneta.cantidadCamionetas = cantidadCamionetas;
	}*/
	
	public static int cantidadCamionetas() {
		return camionetas.size();
	}
	
}
