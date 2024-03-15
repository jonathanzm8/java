package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Cuadrado c1 = new Cuadrado();
		c1.setLado(4);
		double areaCuadrado;

		areaCuadrado = c1.CalcularArea();

		System.out.println("el area de cuadrado1 es:" + areaCuadrado);

		double perimetro;

		perimetro = c1.perimetro();

		System.out.println("el perimetro de cuadrado1 es:" + perimetro);

		// cuadrado2

		Cuadrado c2 = new Cuadrado();

		c2.setLado(8);
		double area2;

		area2 = c1.CalcularArea();

		System.out.println("el area de cuadrado2 es:" + area2);

		double perimetro2;

		perimetro2 = c2.perimetro();

		System.out.println("el perimetro de cuadrado2 es:" + perimetro2);

		// cuadrado3

		Cuadrado c3 = new Cuadrado();

		c3.setLado(2);
		double area3;

		area3 = c3.CalcularArea();

		System.out.println("el area de cuadrado3 es:" + area3);

		double perimetro3;

		perimetro3 = c3.perimetro();

		System.out.println("el perimetro de cuadrado3 es:" + perimetro3);

	}

}
