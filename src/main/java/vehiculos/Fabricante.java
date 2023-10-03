package vehiculos;
import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private Pais pais;
	private int totalFabricados;
	protected static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return this.pais;
	}
	
	public void setTotalFabricados(int totalFabricados) {
		this.totalFabricados = totalFabricados;
	}
	
	public int getTotalFabricados() {
		return this.totalFabricados;
	}
	
	public static Fabricante fabricaMayorVentas() {
		int a =- 1;
		Fabricante mayor = null;
		
		for (Fabricante fabricante : fabricas) {
			final int b = fabricante.totalFabricados;
			
			if(b > a) {
				a = b;
				mayor = fabricante;
			}
		}
		return mayor;
	}
}