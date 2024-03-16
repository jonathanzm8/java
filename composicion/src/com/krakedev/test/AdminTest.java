package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class AdminTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminProducto pro1= new AdminProducto();
		
		Producto productoA= new Producto("papas",18);
		Producto productoB= new Producto("chiles",18);
		
		Producto res;
		
		res=pro1.buscarmascaro(productoA, productoB);
		
		
		
		if(res== null) {
			System.out.println("los dos valen lo mismo");
		}else{
			System.out.println("el producto mas caro es :" +res.getNombre());
			
		}
		
		
		
		
		
		
		

	}

}
