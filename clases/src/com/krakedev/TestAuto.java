package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1= new Auto();
		Auto auto2= new Auto();
		
		auto1.setAnio(200);
		auto1.setPrecio(15.00);
		auto1.setTipo("camioneta");
		
		System.out.println("anio: "+ auto1.getAnio());
		System.out.println("precio: "+ auto1.getPrecio());
		System.out.println("tipo: "+ auto1.getTipo());
		
		auto2.setAnio(2020);;
		auto2.setPrecio(22.00);;
		auto2.setTipo("jeef");
		
		System.out.println("--------------------------------");
		
		System.out.println("anio: "+ auto2.getAnio());
		System.out.println("precio: "+ auto2.getPrecio());
		System.out.println("tipo: "+ auto2.getTipo());
		
		

	}

}
