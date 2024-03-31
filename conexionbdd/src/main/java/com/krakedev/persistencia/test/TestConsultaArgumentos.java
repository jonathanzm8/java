package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaArgumentos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personas personas= new Personas();
		try {
			personas= AdminPersonas.buscarArgumentos("jonathan", "zhiña");
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
