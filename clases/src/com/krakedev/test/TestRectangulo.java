package com.krakedev.test;

import com.krakedev.Rectangulo;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r1= new Rectangulo(); // rectangulo1
		Rectangulo r2= new Rectangulo(); // rectangulo2
		
		
		int area;
		
		r1.setAltura(10);
		r1.setBase(2);
	
		
		area=r1.CalcularArea();
		
		System.out.println("el area de r1 es: "+ area);
		
		int area1;
		
		r2.setAltura(2);
		r2.setBase(5);
		
		
		
		area1= r2.CalcularArea();
		System.out.println("el area de r2 es : "+ area1);
		
		
		Rectangulo peri= new Rectangulo();
		int resPeri;
		
		peri.setAltura(2);
		peri.setBase(10);

		
		resPeri=peri.CalcularPerimetro();
		System.out.println("el perimetro es:" +resPeri);
		
		

	}

}
