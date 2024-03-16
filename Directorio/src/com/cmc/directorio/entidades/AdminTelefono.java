package com.cmc.directorio.entidades;

public class AdminTelefono {
	public  void ActivarMensajeria(Telefono tel) {
		if(tel.getOperadora()== "movi") {
			
			tel.setTieneWhatsaap(true);
			
		}
			
		}
		
		
		
	public int  contarMovi(Telefono t1, Telefono t2, Telefono t3) {
		int contadorMovi= 0;
		
		if(t1.getOperadora()== "movi") {
			contadorMovi= contadorMovi +1;
			
		}else if(t2.getOperadora()== "movi") {
			contadorMovi = contadorMovi +1;
		}else if(t3.getOperadora()== "movi") {
			contadorMovi= contadorMovi +1;
		}
		return contadorMovi;
	}
	
	public int  contarClaro(Telefono t1, Telefono t2, Telefono t3) {
		int contadorClaro= 0;
		
		if(t1.getOperadora()== "claro") {
			contadorClaro= contadorClaro +1;
			
		}else if(t2.getOperadora()== "claro") {
			contadorClaro = contadorClaro +1;
		}else if(t3.getOperadora()== "claro") {
			contadorClaro= contadorClaro +1;
		}
		return contadorClaro;
	}

}
