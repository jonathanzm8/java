package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p; // declaro una variable p de tipo persona 
		
		Persona p2= new Persona("jonathan", 28);
		
		p=new Persona("luis", 12,1.72); // instaciar un objeto perona y referenciar con
		
		System.out.println("nombre: " +p.getNombre());
		System.out.println("edad: "+ p.getEdadPersona());
		System.out.println("estatura: "+p.getEstatura());
		
		p.setNombre("jonathan");
		
		p.setNombre("lucho");
		
		
		
		System.out.println("nombre1: " + p.getNombre());
		System.out.println("nombre2: "+p2.getNombre());

	}

}