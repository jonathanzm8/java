package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersonas {
	private ArrayList<Persona> personas;
	
	// constructor
	
	public AdminPersonas() {
		personas= new ArrayList<Persona>();
	}
	
	public void agregar(Persona persona) {
		personas.add(persona);
	}
	
	public void imprimir() {
		Persona elementoPersona;
		for( int i=0; i<personas.size();i++) {
			elementoPersona=personas.get(i);
			
			System.out.println("elementos: "+elementoPersona.getNombre()+" "+elementoPersona.getApellido()+
					" "+elementoPersona.getEdad());
		}
	}
	
	public Persona buscar(String nombre) {
		Persona elemento=null;
		Persona encontrada= null;
		for(int i=0;i<personas.size();i++)
			elemento= personas.get(i);
			if(nombre.equals(elemento.getNombre())) {
				encontrada= elemento;
			}	
		return encontrada;
	}
	
	public ArrayList<Persona> buscarMayores(int edad){
		ArrayList<Persona> mayores= new ArrayList<Persona>();
		Persona elementoEncontrado= null;
		for(int i=0;i<personas.size();i++) {
			elementoEncontrado= personas.get(i);
			if(elementoEncontrado.getEdad()>edad);
			mayores.add(elementoEncontrado);
			
		}
		return mayores;
	}

}
