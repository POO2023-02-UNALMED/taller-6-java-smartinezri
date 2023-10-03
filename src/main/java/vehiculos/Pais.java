package vehiculos;
import java.util.ArrayList;

public class Pais {

	private String nombre;
	int totalFabricados;
	private static ArrayList<Pais> paises = new ArrayList<>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String paisMasVendedor() {
		Pais pais = paises.get(0);
		
		for(int i = 1; i<paises.size(); i++) {
			if(paises.get(i).totalFabricados > pais.totalFabricados) {
				pais = paises.get(i);
			}
		}
		return pais.nombre;
	}
	
}
