package krakedev.entidades;

public class Materia {
	private String codigo;
	private String nombre;
	public String getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Materia(String codigo, String nombre) {
	
		this.codigo = codigo;
		this.nombre = nombre;
	}
	
	

}
