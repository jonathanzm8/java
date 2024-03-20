package krakedev.entidades;

public class Nota {
	private String materia;
	private double calificacion;
	public String getMateria() {
		return materia;
	}
	public double getCalificacion() {
		return calificacion;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	public Nota(Materia lenguaje, double calificacion) {
		
		this.materia = lenguaje;
		this.calificacion = calificacion;
	}
	
	public void mostrar() {
		System.out.println("materia: "+materia +"calificacion: "+ calificacion);
	}

}
