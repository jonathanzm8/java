package clearminds.cuentas;

public class Cuenta {
	
	private String id ;
	private String tipo= "A";
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	private double saldo;
	
	public String getId() {
		return id;
	}
	
	// constructores 
	
	public Cuenta(String id) {
		this.id= id;
	}
	
	public Cuenta( String id, String tipo,double saldo ) {
		this.id= id;
		this.tipo= tipo;
		this.saldo= saldo;
		
	}
	
	//metodos 
	
	public void Imprimir() {
		System.out.println("numero de cuenta: " +id);
		System.out.println("tipo: " +tipo);
		System.out.println("saldo: " +saldo);
		
	}
	
	public void imprimirConMiEStilo() {
		
		System.out.println("+++++++++++++++ IMPRIMIENDO A MI ESTILO+++++++++++");
		System.out.println("NUMERO DE CUENTA:= " +id);
		System.out.println("TIPO DE CUENTA:= " +tipo);
		System.out.println("SALDO EN LA CUENTA:= " +saldo);
		
	}

}
