package com.krakedev.conexionbdd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conecction = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			conecction = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
			System.out.println("conexion exitosa");
			ps = conecction.prepareStatement(
					"insert into persona(cedula,nombre,apellido,numeros_hijos,estatura,cantidad_ahorrada,fecha_nacimento,hora_nacimeinto)"
							+ "values(?,?,?,?,?,?,?,?)"); // para ingresar los datos a sql

			ps.setString(1, "1105232979");
			ps.setString(2, "jonathan");
			ps.setString(3, "zhiña");
			ps.setInt(4, 1);
			ps.setDouble(5, 1.72);
			ps.setBigDecimal(6, new BigDecimal(122.9)); // ingresar tipo money

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:12:34";

			try {
				Date fecha = sdf.parse(fechaStr);
				System.out.println(fecha);
				long fechaMili = fecha.getTime();
				System.out.println(fechaMili);
				// crea un java.sql.date
				java.sql.Date fechaSql = new java.sql.Date(fechaMili);
				System.out.println(fechaSql);
				Time timeSql = new Time(fechaMili);
				System.out.println(timeSql);
				
				ps.setDate(7, fechaSql);
				ps.setTime(8, timeSql);

				ps.executeUpdate();
				System.out.println("ingreso los datos");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

	}

}
