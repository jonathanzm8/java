package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String valorRecuperado;
		ArrayList<String> cadenas;
		
		cadenas =new ArrayList<String>();
		
		System.out.println(cadenas.size());
		
		cadenas.add("uno"); // posicion 0
		cadenas.add("dos"); // posicion 1
		
		System.out.println(cadenas.size());
		
		// recuperar elementos del array
		
		valorRecuperado=cadenas.get(0);
		System.out.println(valorRecuperado);
		
		valorRecuperado=cadenas.get(1);
		System.out.println(valorRecuperado);
		// valor en una posicion que no existe da exeption
		//valorRecuperado=cadenas.get(2);
		//System.out.println(valorRecuperado);
		String cadena;
		for(int i=0; i<cadenas.size(); i++) {
			cadena= cadenas.get(i);
			
			System.out.println("la cadena es: " + cadena);
		}

	}

}
