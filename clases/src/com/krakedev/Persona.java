package com.krakedev;

public class Persona {
	private String nombre;
	private int edadPersona;
	private double estatura;
	//  contructores
	
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edadPersona= edad;
		
	}
	
	public Persona(String nombre, int edad, double estatura) {
		this.nombre=nombre;
		this.edadPersona= edad;
		this.estatura=estatura;
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdadPersona() {
		return edadPersona;
	}
	public void setEdadPersona(int edadPersona) {
		this.edadPersona = edadPersona;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	

}
