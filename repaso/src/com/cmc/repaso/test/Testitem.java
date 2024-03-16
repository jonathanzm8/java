package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class Testitem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item tes= new Item();
		
		
		tes.setProductosActuales(20);
		tes.vender(2);
		tes.devolver(5);
		
		
		tes.imprimir();
		
		Item pro1= new Item();
		
		pro1.setProductosActuales(15);
		pro1.vender(5);
		pro1.devolver(7);
		
		pro1.imprimir();
		
		
		

	}

}
