
public abstract class Funcionario {
	private String codigo;
	private String nome;
	private double salario;
	
	public Funcionario(String codigo, String nome, double salario){
		this.codigo = codigo;
		this. salario = salario;
		this.nome =  nome;
	}
	
	public String getNome(){
		return nome;
	}
	public String getCodigo(){
		return codigo;
	}
	public abstract double getSalarioLiquido();
	
	public void setSalarioLiquido(double salario){
		this.salario = salario;
	}
	public double getSalarioBruto(){
		return salario;
	}
	@Override 
	public String toString(){
		return "\tNome " + nome + "->codigo-> " + codigo + "\n>> Salario Bruto " + salario;
	}
}
