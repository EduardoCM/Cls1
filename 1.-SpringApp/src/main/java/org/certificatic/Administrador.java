package org.certificatic;

public class Administrador {
	
	private int idAd;
	private String nombre;
	
	
	//Para Ejercicio dos
	private Direccion direccion;
	
	public Administrador() {
		
	}
	
	public Administrador(int idAd, String nombre) {
		this.idAd = idAd;
		this.nombre = nombre;
	}

	/*
	 * Ejercicio 1
	 */
	public void imprimirDireccion() {
		System.out.println("Juan de Dios Batis");
	}
	
	
	

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Administrador [idAd=" + idAd + ", nombre=" + nombre + ", direccion=" + direccion + "]";
	}

	
	

}
