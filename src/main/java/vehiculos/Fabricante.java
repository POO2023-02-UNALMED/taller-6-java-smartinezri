package vehiculos;
import java.util.ArrayList;

public class Fabricante {

	private String nombre;
	private Pais pais;
	static ArrayList<Fabricante> fabricas = new ArrayList<>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Pais.paises.add(this.pais);
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
	
	public static Fabricante fabricaMayorVentas() {
        Fabricante mayor = null;
        int a = 0;

        for (var fabrica : fabricas) {
            int b = 0;
            for (var fabricatemp : fabricas) {
                if (fabrica == fabricatemp) {
                    b++;
                }
            }
            if (a < b) {
                a = b;
                mayor = fabrica;
            }
        }

        return mayor;
    }
}