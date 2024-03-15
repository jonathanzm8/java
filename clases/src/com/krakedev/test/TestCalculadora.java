package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculadora calcu;
		int resultado;
		
		calcu= new Calculadora();
		
		resultado=calcu.sumar(4, 2);
		
		System.out.println("la suma es: " + resultado);
		// restona la resta un double
		double resta;
		resta=calcu.restar(2, 1);
		
		System.out.println("la resta es:" + resta);
		
		// llamar a multiplicar
		
		Calculadora mult= new Calculadora();
		
		double resultadoMult;
		
		
		
		resultadoMult=mult.multiplicar(10, 5);
		
		System.out.println("la multiplicacion es: "+resultadoMult);
		
		
		// llamar a dividir 
		
		Calculadora div= new Calculadora();
		double resultadoDiv;
		resultadoDiv=div.dividir(10, 2);
		System.out.println("La division es: "+resultadoDiv);
		
		// llamar a promediar 
		
		Calculadora pro= new Calculadora();
		double resPro;
		resPro=pro.promediar(10, 8, 9);
		System.out.println("el promedio es: "+resPro);
		
		// llamar a mensaje
		
		Calculadora msj= new Calculadora();
		msj.mostarResultado("ahoritano joven, sali al almuerzo, regreso en 15 minutos");
		
		System.out.println(msj);
		
		
		
		
		
		

	}

}
