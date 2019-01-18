package model;

import java.io.Serializable;

public class Asignatura implements Serializable{
	String Nombre = null;
	String Horas = null;
	Profesor prof = null;

public Asignatura(String Nombre,String Horas,Profesor prof) {
	super();
	this.Nombre = Nombre;
	this.Horas = Horas;
	this.prof = prof;
	
}

public String getNombre() {
	return Nombre;
}

public void setNombre(String nombre) {
	Nombre = nombre;
}

public String getHoras() {
	return Horas;
}

public void setHoras(String horas) {
	Horas = horas;
}

public Profesor getProf() {
	return prof;
}

public void setProf(Profesor prof) {
	this.prof = prof;
}

@Override
public String toString() {
	return "Asignatura [Nombre=" + Nombre + ", Horas=" + Horas + ", prof=" + prof + "]";
}

}
