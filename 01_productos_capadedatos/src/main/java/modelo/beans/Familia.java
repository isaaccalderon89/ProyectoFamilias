package modelo.beans;

import java.io.Serializable;

public class Familia implements Serializable{

	private static final long serialVersionUID = 1L;
	private int idFamilia;
	private String descripcion;
	
	//generamos constructor con todos los parametros
	public Familia(int idFamilia, String descripcion) {
		super();
		this.idFamilia = idFamilia;
		this.descripcion = descripcion;
	}
	
	//generamos un constructor vacio
	public Familia() {
		super();
	}
	
	//Generamos los getters and setters
	public int getIdFamilia() {
		return idFamilia;
	}
	public void setIdFamilia(int idFamilia) {
		this.idFamilia = idFamilia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//generamos el toString
	@Override
	public String toString() {
		return "Familia [idFamilia=" + idFamilia + ", descripcion=" + descripcion + "]";
	}
	
	
	

}
