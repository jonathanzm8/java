package com.krakedev;

public class Auto {
	private String tipo;
	private int anio;
	private double precio;
	// constructores
	
	public Auto(String tipo) {
		this.tipo= tipo;
	}
	
	public Auto(String tipo, int anio) {
		this.tipo= tipo;
		this.anio=anio;
	}
	//-------------------------------
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

}
