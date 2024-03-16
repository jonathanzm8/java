package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminContactos comp = new AdminContactos();
		Telefono tel1 = new Telefono("claro", "1231", 12234);

		Contacto conta1 = new Contacto("luis", "perez", tel1, 12.8);

		Telefono tel2 = new Telefono("movi", "1231", 12234);

		Contacto conta2 = new Contacto("luis", "zhiña", tel2, 15);
		
		Contacto res;
		
		res=comp.buscarMasPesado(conta1, conta2);
		
		if(res== null) {
			System.out.println("los dos pesan iguales");
		}else{
			System.out.println("el maas pesado es :" +res.getNombre( )+" "+ res.getApellido()+" "+ res.getPeso());
			
		}
		
		boolean comparar;
		
		comparar=comp.compararOperadoras(conta1, conta2);
		
		System.out.println("la comparacion es:" +comparar);
		
		Contacto activado;
		
		comp.ActivarUsuario(conta1);
		
		
		
	
		
		
		
		
		

	}

}
