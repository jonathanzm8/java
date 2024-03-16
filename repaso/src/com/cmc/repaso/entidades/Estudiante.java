package com.cmc.repaso.entidades;

public class Estudiante {
	
	private String nombre;
	private double nota;
	private String resultado;
	
	public void calificar(double nota) {
		if (nota<8) {
			resultado = "f";
			System.out.println(resultado);
			
		}else if(nota >=8){
			resultado= "A";
			System.out.println("el resultado es: "+resultado);
		}
	}

}
