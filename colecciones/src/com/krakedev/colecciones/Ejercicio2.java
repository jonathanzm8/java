package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas;
		personas= new ArrayList<Persona>();
		
		Persona per1= new Persona("jonathan", "zhiña", 29);
		personas.add(per1);
		
		Persona per2= new Persona("luis", "zhiña", 21);
		personas.add(per2);
		
		Persona per3= new Persona("Miguel", "zhiña", 27);
		personas.add(per3);
		
		System.out.println(personas.size());
		
		Persona elementoPersona;
		
		for(int i= 0; 1<personas.size(); i++) {
			elementoPersona= personas.get(i);
			
			System.out.println("elementos: "+elementoPersona.getNombre()+ " " + elementoPersona.getApellido()+" "+elementoPersona.getEdad());
			
		}

	}

}
