package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;


public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("J1"));
        maquina.agregarCelda(new Celda("J2"));
        maquina.agregarCelda(new Celda("J3"));
        maquina.agregarCelda(new Celda("k2"));
        maquina.agregarCelda(new Celda("K3"));
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "adad", 1);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		ArrayList<Producto> menores= maquina.buscarMenores(1);
		System.out.println("los mayores: " +menores.size());
		
		

	}

}
