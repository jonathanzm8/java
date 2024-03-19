package com.krakedev.colecciones;

import java.util.ArrayList;

public class TesAdminPersonas {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		AdminPersonas admin= new AdminPersonas();
		Persona per1= new Persona("domenica","zhiña",12);
		Persona per2= new Persona("jonathan","zhiña",29);
		Persona per3= new Persona("luis","zhiña",21);
		
		admin.agregar(per2);
		admin.agregar(per3);
		
		admin.agregar(per1);
		admin.imprimir();
		Persona p=admin.buscar("luis");
		
		if(p != null) {
			System.out.println(p.getNombre()+ p.getApellido() +p.getEdad());

			
		}else {
			System.out.println("no encontrado");
		}
		
		ArrayList<Persona> mayores= admin.buscarMayores(30);
		System.out.println("los mayores: " +mayores.size());
		
		
		
		
	}

}
