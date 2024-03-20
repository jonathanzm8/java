package krakedev.entidades;

import java.util.ArrayList;



public class Curso {
	private ArrayList<Estudiante> estudiante= new ArrayList<>();

	public Curso(ArrayList<Estudiante> estudiante) {
		
		this.estudiante = estudiante;
	}
	
	public Estudiante buscarEstudiantePorCedula(Estudiante estudiante) {
		ArrayList<Estudiante> buscar= new ArrayList<>();
		Estudiante elemento;
		Estudiante busqueda= null;
		for(int i=0; i<buscar.size();i++) {
			elemento= buscar.get(i);
			
			if(elemento.getCedula().equals(estudiante)) {
				System.out.println("esta dentro de un curso");
				
			}
			
		}
		return busqueda;
		
		
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante buscarCedula = buscarEstudiantePorCedula(estudiante);
		ArrayList<Estudiante> estudiantes= new ArrayList<>();
		Estudiante elemento;
		for(int i=0; i<estudiantes.size();i++) {
			elemento= estudiantes.get(i);
			if(elemento.getCedula().equals(estudiante)) {
				estudiantes.add(buscarCedula);
				
			}
	
		}
		
	}
	
	public Curso calcularPromedioCurso() {
		Curso promedio = null;
		Estudiante elemento;
		ArrayList<Estudiante> estudiantes= new ArrayList<>();
		for(int i=0; i<estudiantes.size();i++) {
			elemento = estudiantes.get(i);
			
			
		}
		return promedio;
		
		
		
	}
	
	public void mostrar() {
		ArrayList<Estudiante> estudiantes= new ArrayList<>();
		Estudiante elemento;
		for(int i=0; i<estudiantes.size();i++) {
			elemento= estudiantes.get(i);
			
			System.out.println("Estudiantes: "+elemento);
			
		}
		
	}

}
