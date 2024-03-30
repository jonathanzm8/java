package com.krakedev.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		private static final org.apache.logging.log4j.core.Logger LOGGER= LogManager.getLogger(Ejercicio3.class);
		
		public void metodo1() {
			String a= null;
			try {
				a.substring(0);
			}catch( Exception io){
				System.out.println("error");
				LOGGER.error("error al obtener la subcadena", io);
				
			}
			
		}

	}

}
