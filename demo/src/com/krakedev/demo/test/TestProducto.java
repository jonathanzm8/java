package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto pro= new Producto(123,"pera");
		
		pro.setDescripcion("pera en buen estado");
		pro.setPeso(12);
		
		System.out.println("el cogigo es: " +pro.getCodigo());
		System.out.println("el nombre es: " +pro.getNombre());
		System.out.println("la descripcion:" +pro.getDescripcion());
		System.out.println("el peso es: " +pro.getPeso());

	}

}
