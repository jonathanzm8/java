package com.krakedev;

public class Rectangulo {
	
	private int base;
	private int altura;
	
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int CalcularArea() {
		int area;
		area= base * altura;
		return area ;
		
	}
	
	public int CalcularPerimetro() {
		int perimetro;
		int bs;
		int al;
		bs= base+base;
		al= altura+altura;
		perimetro= bs + al;
		return perimetro;
		
	}
	
	

}
