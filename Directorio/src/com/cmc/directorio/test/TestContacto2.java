package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telefono1 = new Telefono("claro", "1231", 12234);

		Contacto contacto1 = new Contacto("luis", "coronel", telefono1, 12.8);

		Telefono telefono2 = new Telefono("claro", "1231", 12234);

		Contacto contacto2 = new Contacto("carlos", "perez", telefono2, 1.8);
		
		
		AdminContactos admin= new AdminContactos();
		
		Contacto respuesta;
		
		respuesta=admin.buscarMasPesado(contacto1, contacto2);
		
		if(respuesta== null) {
			System.out.println("los dos pesan iguales");
		}else {
			System.out.println("el mas pesado es: " +respuesta.getNombre()+" " + respuesta.getApellido());
		}
		boolean operador;
		
		operador=admin.compararOperadoras(contacto1, contacto2);
		
		System.out.println("el operador es: " +operador);
		
		admin.ActivarUsuario(contacto1);
		

	}
	
	

}
