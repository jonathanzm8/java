package com.krakedev.herencia;

public class Perro extends Animal {
	public void ladrar() {
		System.out.println("perro ladrando");
	}
	@Override
	public void dormir() {
		super.dormir();
		System.out.println("perro dormir");
	}

}
