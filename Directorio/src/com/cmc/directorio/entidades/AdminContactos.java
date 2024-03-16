package com.cmc.directorio.entidades;

public class AdminContactos {
	
	public Contacto buscarMasPesado(Contacto con1, Contacto con2) {
		if(con1.getPeso()> con2.getPeso()) {
			return con1;
			
		}else if (con2.getPeso()> con1.getPeso()) {
			return con2;
			
		}else {
			return null;
		}
		
	}
	
	public  boolean compararOperadoras(Contacto cont1, Contacto cont2) {
		
		if(cont1.getTelefono().getOperadora()== cont2.getTelefono().getOperadora()) {
			return true;
		}else {
			return false;
		}
		


		
		
	}
	
	public  void  ActivarUsuario(Contacto n1) {
		if(n1.getTelefono().isTieneWhatsaap()== true) {
			n1.setActivo(true);
		
			
			
		}
		
	}

}
