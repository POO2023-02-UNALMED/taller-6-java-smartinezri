package vehiculos;

public class Automovil extends Vehiculo{

	private int puestos;
	protected static int cantidadAutos = 0;
	
	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		Automovil.cantidadAutos++;
	}
	
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	public int getPuestos() {
		return this.puestos;
	}
	
	public static void setCantidadAutos(int autos) {
		Automovil.cantidadAutos = autos;
	}
	
	public static int cantidadAutos() {
		return Automovil.cantidadAutos;
	}
}