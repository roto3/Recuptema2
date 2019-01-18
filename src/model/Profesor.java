package model;

public class Profesor {
	private String nombre;
	private String despacho = null;
	
	public Profesor(String nombre,String despacho) {
		super();
		this.nombre = nombre;
		this.despacho = despacho;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", despacho=" + despacho + "]";
	}
}
