package crearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cuenta1

		Cuenta cuenta1 = new Cuenta("03476");

		cuenta1.setSaldo(675);

		// cuenta2

		Cuenta cuenta2 = new Cuenta("03476", "C", 98);

		// cuenta3

		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");

		/// imprimir cuenta1, cuenta2, cuenta3

		System.out.println("--------------- valores iniciales----------------");

		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();

		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");

		System.out.println("--------------- valores modificados----------------");

		cuenta1.Imprimir();
		cuenta2.Imprimir();
		cuenta3.Imprimir();

		// cuenta4

		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setTipo("A");
		cuenta4.setSaldo(10);

		// cuenta5

		Cuenta cuenta5 = new Cuenta("0557");
		cuenta5.setTipo("C");
		cuenta5.setSaldo(10);

		// cuenta6

		Cuenta cuenta6 = new Cuenta("0666");
		cuenta6.setTipo("A");
		

		cuenta4.imprimirConMiEStilo();
		cuenta5.imprimirConMiEStilo();
		cuenta6.imprimirConMiEStilo();

	}

}
