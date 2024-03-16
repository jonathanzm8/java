package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto pro= new Producto("mazana",-12);
		

		double descuento;
		
		descuento=pro.CalcularPromo(5);
		
		System.out.println(descuento);
		
		

	}

}
