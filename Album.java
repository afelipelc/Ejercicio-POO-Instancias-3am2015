
/**
 * Write a description of class Album here.
 * 
 * @author (AFelipe) 
 * @version (0.1)
 */

//la importacion de clases permite su uso, si no hay importacion no podra usarse la clase referida.
import java.util.ArrayList;
import java.util.List;


public class Album {
    
    //se trata de una coleccion o lista de objetos de
    //la clase pista, ya que un album se compone de varias canciones
    //con una lista: le podemos agregar, quitar, extraer, contar, leer, etc. cada uno de los objetos, es decir, cada una de las pistas que lo componen.
	private List<Pista> pistas = new ArrayList<Pista>();
	
	private String titulo, genero;
	
	public List<Pista> getPistas() {
		return pistas;
	}
	public void setPistas(List<Pista> pistas) {
		this.pistas = pistas;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
}
