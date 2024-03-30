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

public class TestConexion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Connection conecction = null;
		PreparedStatement ps = null;
		try {
			Class.forName("org.postgresql.Driver");
			conecction = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "1234");
			System.out.println("conexion exitosa");
			ps = conecction.prepareStatement("insert into compras( id_compras, cedula, fecha_compra, monto, compra_cliente) values(?,?,?,?,?)"); // para
			
			ps.setInt(1, 14);
			ps.setString(2, "1105232911");
			ps.setBigDecimal(4,new BigDecimal(12.00));
			ps.setString(5, "1105232911");
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2024/03/30 10:12:34";

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
				
				ps.setDate(3, fechaSql);
				
				

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

	

	


