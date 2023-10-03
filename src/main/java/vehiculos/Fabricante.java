package vehiculos;
import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private Pais pais;
	int totalFabricados;
	private static ArrayList<Fabricante> fabricas = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		fabricas.add(this);
		totalFabricados++;
		pais.totalFabricados++;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	public Pais getPais() {
		return pais;
	}
	
	public String fabricaMayorVentas() {
		Fabricante fabrica = fabricas.get(0);
		
		for(int i = 1; i<fabricas.size(); i++) {
			if(fabricas.get(i).totalFabricados > fabrica.totalFabricados) {
				fabrica = fabricas.get(i);
			}
		}
		return fabrica.nombre;
	}
	
}
