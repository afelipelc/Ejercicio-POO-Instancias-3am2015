
/**
 * Write a description of class Cantante here.
 * 
 * @author (AFelipe) 
 * @version (0.1)
 */

public class Cantante {
	private String nombre, alias, direccion;
	
	public Cantante() { } //constructor simple
	//Constructor que requiere 3 parametros
	public Cantante(String nombre, String alias, String direccion){
	    this.nombre = nombre;
	    this.alias = alias;
	    this.direccion = direccion;
	   }
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
