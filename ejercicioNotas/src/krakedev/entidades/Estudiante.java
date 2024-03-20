package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	
	private ArrayList<Nota> nota= new ArrayList<>();

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public ArrayList<Nota> getNota() {
		return nota;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNota(ArrayList<Nota> nota) {
		this.nota = nota;
	}

	public Estudiante(String nombre, String apellido, String cedula, ArrayList<Nota> nota) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.nota = nota;
	}
	
	
	public void agregarNota(Nota nuevaNota) {
		ArrayList<Nota> notas = new ArrayList<>();
		Nota elemento;
		for(int i=0; i<notas.size();i++) {
			elemento= notas.get(i);
			
			if(elemento.getClass().equals(nuevaNota)) {
				System.out.println("elementos iguales");
				
			}else  {
				notas.add(nuevaNota);
				
			}
			
		}
		
	}
	
	public void modificarNota(String codigo, double nuevaNota) {
		
		
	
		}
				
		
	
	
	public double calcularPromedioEstudiante() {
		ArrayList<Nota> notas = new ArrayList<>();
		double promedio=0;
		Nota elemento;
		for(int i=0 ; i<notas.size();i++) {
			elemento= notas.get(i);
			double nota;
			
			nota=elemento.getCalificacion();
			
			promedio= nota/elemento.getCalificacion();
			
			
		}
		return promedio;
		
		
	}
	
	public void mostrar () {
		ArrayList<Nota> notas = new ArrayList<>();
		Nota elemento;
		for(int i=0; i<notas.size();i++) {
			elemento= notas.get();
			System.out.println("notas: "+elemento.getCalificacion());
			
		}
		
	}
	

}
