package com.krakedev;

public class Cuadrado {
	
	private int lado;
	
	
	
	
	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	public double CalcularArea() {
		int area;
		area= (int)(Math.pow(lado,2));
		return area;
	}
	
	public double perimetro() {
		int perimetro;
		perimetro= lado * 4;
		return perimetro;
	}

}
