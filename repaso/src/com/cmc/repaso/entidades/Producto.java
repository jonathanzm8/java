package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
		if(precio>=0) {
			
			
		}else if(precio<0){
			double res;
			res=precio * -1;
			
			
		}
	}
	

	// constructor

	public Producto(String nombre, double precio) {
		this.nombre= nombre;
		this.precio= precio;
	}
	
	// metodo
	
	public double CalcularPromo(int porcentaje) {
		double porcentaje1;
		double descuento;
		porcentaje1 =( precio * porcentaje)/100;
		descuento= precio- porcentaje1;
		return descuento;
	}

}
