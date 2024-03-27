package com.krakedev.herencia;

public class Gato extends Animal {
	
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("el gato hace miauuu");
		
	}
	
	public void maullar() {
		System.out.println("este gato esta maullando ");
	}
	
	public void maullar(String nombre) {
		System.out.println("gato maullando "+nombre);
	}

}
