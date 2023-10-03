package vehiculos;
import java.util.ArrayList;

public class Automovil extends Vehiculo{

	private int puestos;
	private static ArrayList<Automovil> autos = new ArrayList<>();
	//private static int cantidadAutos = 0;
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		//Automovil.cantidadAutos++;
		autos.add(this);
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return puestos;
	}
	
	/*public static void setCantidadAutos(int autos) {
		Automovil.cantidadAutos = autos;
	}*/
	
	public static int cantidadAutos() {
		return autos.size();
	}
}
