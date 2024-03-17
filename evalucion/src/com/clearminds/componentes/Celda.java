package com.clearminds.componentes;

public class Celda {
	private Producto producto;
	private int stock;
	private String codigo;
	
	
	public Producto getProducto() {
		return producto;
	}

	public int getStock() {
		return stock;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void ingresarProducto(Producto pro, int stock1) {
		this.producto= pro;
		this.stock= stock1;
		
	}

	public Celda(String codigo) {
		
		this.codigo = codigo;
	}
	

}
