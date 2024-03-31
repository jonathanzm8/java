package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Personas;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaCedula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ArrayList<Personas> personas=AdminPersonas.buscarCedula("1105232977");
			System.out.println(personas);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
