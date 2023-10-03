package vehiculos;
import java.util.ArrayList;

public class Pais {

	private String nombre;
	private int totalFabricados;
	protected static ArrayList<Pais> paises = new ArrayList<Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setTotalFabricados(int totalFabricados) {
		this.totalFabricados = totalFabricados;
	}
	
	public int getTotalFabricados() {
		return this.totalFabricados;
	}
	
	public static Pais paisMasVendedor() {
		int a =- 1;
		Pais mayor = null;
		
		for (Pais pais: paises) {
			final int b = pais.totalFabricados;
			
			if (b > a) {
				a = b;
				mayor = pais;
			}
		}
		return mayor;
	}
}
