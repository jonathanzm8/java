package com.krakedev.controlflujo.test;

import com.kravedev.controlflujo.Validador;

public class TestValidador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Validador val= new Validador();
		
		val.validadEdad(10);
		val.validadEdad(22);
		val.validadEdad(17);
		val.validadEdad(29);
		val.validadEdad(-1);
		

	}

}
