package com.krakedev.conexionbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TestConexion1 {

	// TODO Auto-generated method stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conecction = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			conecction = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
			System.out.println("conexion exitosa");
			ps = conecction.prepareStatement("INSERT INTO clientes( cedula, nombre, apellido, edad)values(?,?,?,?)"); // para
																													
			ps.setString(1, "1105232911");
			ps.setString(2, "carlos");
			ps.setString(3, "martin");
			ps.setInt(4, 18);

			ps.executeUpdate();

			System.out.println("ingreso los datos ");

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
