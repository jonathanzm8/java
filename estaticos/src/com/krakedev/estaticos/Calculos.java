package com.krakedev.estaticos;

public class Calculos {
	// final hace que sea constante y no se pude modificar 
	private final double IVA = 12;
	
	public double  calcularIva(double monto) {
		return monto*IVA /100;
	}

}
