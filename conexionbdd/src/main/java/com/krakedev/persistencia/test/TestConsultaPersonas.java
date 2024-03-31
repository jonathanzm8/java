package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersonas {
	public static void main(String[] args) {
		
		try {
			ArrayList<Personas>personas= AdminPersonas.buscarPorNombre("a");
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
