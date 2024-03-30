package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void medotodo1() {
		String a = null;
		a.substring(0);
		
	}
	
public void medotodo2() {
	
	File f = new File("archivo.txt");
	
	try {
		f.createNewFile();
		
	}catch(IOException io){
		System.out.println("error");
		
	}
	
		
	}

public void metodo3() throws IOException{
	File f = new File("archivo.txt");
	f.createNewFile(); // lanza una IOexeption de  cheked
	
		
	}

public void metodo4()  throws IOException{
	metodo3();
}

}
