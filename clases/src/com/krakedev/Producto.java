package com.krakedev;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stockActual;
	
	// constructores
	
	public Producto(String nombre) {
		this.nombre= nombre;
		
		
	}
	
	public Producto(String nombre, double precio) {
		this.nombre= nombre;
		this.precio= precio;
		
		
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
	
	

}
