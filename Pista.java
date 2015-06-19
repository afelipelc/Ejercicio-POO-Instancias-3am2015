
/**
 * Write a description of class Pista here.
 * 
 * @author (AFelipe) 
 * @version (0.1)
 */

public class Pista {
	private String titulo, genero;
	private float duracion;
	private int numPista;
	
	//una pista tiene un cantante, y ese cantante tiene datos, por lo tanto es un objeto
	private Cantante cantante;
	
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
	public float getDuracion() {
		return duracion;
	}
	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}
	public int getNumPista() {
		return numPista;
	}
	public void setNumPista(int numPista) {
		this.numPista = numPista;
	}
	public Cantante getCantante() {
		return cantante;
	}
	public void setCantante(Cantante cantante) {
		this.cantante = cantante;
	}
}

