package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int productosVendidos;
	
	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

	public void imprimir() {
		System.out.println("---------------------------");
		System.out.println("productos actules: "+productosActuales);
		System.out.println("productos devueltos: "+productosDevueltos);
		System.out.println("productos vendidos: "+productosVendidos);
	}
	
	public void vender(int productoVendido) {
		this.productosActuales= productosActuales -productoVendido;
		this.productosVendidos= productoVendido ;
	}
	
	public void devolver( int productoVendido) {
		this.productosActuales= productosActuales + productoVendido ;
		this.productosVendidos= productoVendido -productosVendidos ;
		
		this.productosDevueltos= productosDevueltos + productoVendido;
	}

}
