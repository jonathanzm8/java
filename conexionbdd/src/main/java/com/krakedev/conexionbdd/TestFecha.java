package com.krakedev.conexionbdd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ha dos date unopmde java ulit y otro  de  java sql
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr= "2020/03/22 10:12:34";
		

		try {
			Date fecha = sdf.parse(fechaStr);
			System.out.println(fecha);
			long fechaMili= fecha.getTime();
			System.out.println(fechaMili);
			// crea un java.sql.date 
			java.sql.Date fechaSql = new java.sql.Date(fechaMili);
			System.out.println(fechaSql);
			Time timeSql= new  Time(fechaMili);
			System.out.println(timeSql);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	

}
