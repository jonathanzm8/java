package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Telefono tel= new Telefono("claro","098976",12);
		Contacto c = new Contacto("jonathan", "zhiña",tel,12.8 );
		
		c.imprimir();
		
		
		
	
		
	
	}

}
