package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefono tel1= new Telefono("movi", "09941234123",10);
		Telefono tel2= new Telefono("claro", "09941234123",4);
		Telefono tel3= new Telefono("claro", "0994123423",5);
		
		AdminTelefono admin= new AdminTelefono();
		
		
		int operadorMovi;
		
		operadorMovi=admin.contarMovi(tel1, tel2, tel3);
		
		System.out.println("numeros de operadora movi: "+operadorMovi);
		
		int opreadorClaro;
		
		opreadorClaro=admin.contarClaro(tel1, tel2, tel3);
		System.out.println("numero de operadora claro: " +opreadorClaro);
		
		
		
		
		
		
		
	
		
		
		
		
		
	

	}

}
