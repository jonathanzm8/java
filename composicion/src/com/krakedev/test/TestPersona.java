package com.krakedev.test;

import com.krakedev.composicion.Persona;
import com.krakedev.composicion.direccion;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona per= new Persona();
		per.setNombre("jonathan");
		per.setApellido("zhiña");
		
		// intancio en direccion 
		
		direccion dir = new direccion();
		
		dir.setCallePrincipal("loja-el valle");
		dir.setCalleSecundaria("barrio");
		
		String nombre=per.getNombre();
		String direccion= dir.getCallePrincipal();
		String direccion1= dir.getCalleSecundaria();
		
		System.out.println("nombre: "+ nombre);
		System.out.println("apellido: "+ per.getApellido());
		System.out.println("la direecion es : "+ direccion);
		System.out.println("la direecion es : "+ direccion1);


	}

}
