package com.krakedev.test;

import com.krakedev.Producto;

public class TesProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto productoA= new Producto("vitaminas A");
		Producto productoB= new Producto("ampolla",12.0);
		Producto productoC= new Producto("pastillas");
		
		productoA.setNombre("vitaminac");
		productoA.setDescripcion("vitaminas sabor a naranja");
		productoA.setPrecio(2.00);
		productoA.setStockActual(7);
		
		System.out.println("nombre: "+productoA.getNombre());
		System.out.println("descripcion : "+productoA.getDescripcion());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("stock: "+productoA.getStockActual());
		
		System.out.println("---------------------------------");
		
		productoB.setNombre("paracetamol");
		productoB.setDescripcion("pastillas para el dolor");
		productoB.setPrecio(1.20);
		productoB.setStockActual(12);
		
		System.out.println("nombre: "+productoB.getNombre());
		System.out.println("descripcion : "+productoB.getDescripcion());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("stock: "+productoB.getStockActual());
		
		System.out.println("---------------------------------");
		
		productoC.setNombre("jarabe");
		productoC.setDescripcion("para calmar la tos ");
		productoC.setPrecio(5.20);
		productoC.setStockActual(6);
		
		System.out.println("nombre: "+productoC.getNombre());
		System.out.println("descripcion : "+productoC.getDescripcion());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("stock: "+productoC.getStockActual());
		
		
				

	}

}
