package com.krakedev.composicion;

public class Persona {
	
	private String nombre;
	private String apellido;
	private direccion direccion;
	private int edad;
	private double estatura;
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public double getEstatura() {
		return estatura;
	}
	public void setEstatura(double estatura) {
		this.estatura = estatura;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(direccion direccion) {
		this.direccion = direccion;
	}

}
