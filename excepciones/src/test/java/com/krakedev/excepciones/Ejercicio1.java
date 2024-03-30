package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("inicio");
		String a = null;
		try {
			System.out.println("ingresa a conexion bdd");
			a.substring(3);
			System.out.println("fin");
			
		}catch(Exception ex){
			System.out.println("entra al catch");
		}finally {
			System.out.println("ingresa a finally");
			System.out.println("cierra conexion con bdd");
		}
		System.out.println("fuera del catch");
		

	}

}
