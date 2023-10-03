package vehiculos;
import java.util.ArrayList;

public class Pais {

	private String nombre;
	static ArrayList<Pais> paises = new ArrayList<>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public static Pais paisMasVendedor() {
		Pais mayor = null;
        int a = 0;

        for (var pais : paises) {
            int b = 0;
            for (var paistemp : paises) {
                if (pais == paistemp) {
                    b++;
                }
            }
            if (a < b) {
                a = b;
                mayor = pais;
            }
        }

        return mayor;
    }
}
