
/**
 * Write a description of class Disquera here.
 * 
 * @author (AFelipe) 
 * @version (0.1)
 */
import java.util.ArrayList;
import java.util.List;


public class Disquera {
	private String nombre, ubicacion;
	
	//produce varios albums
	private List<Album> producciones = new ArrayList<Album>();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public List<Album> getProducciones() {
		return producciones;
	}
	public void setProducciones(List<Album> producciones) {
		this.producciones = producciones;
	}
	
}
