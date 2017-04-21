
public class Vendedor extends Funcionario {
	private double totalVendas;
	private static int totalObjetos = 0; //LEMBRAR Q TEM DE INICIALIZAR!!
	public Vendedor(String c, String n, double s){
		super(c, n, s);
		totalObjetos++;
	}
	public Vendedor (String c, String n, double s, double t){
		super(c, n, s);
		this.totalVendas = t;
		totalObjetos++;
	}
	public void setTotalVendas(double t){
		this.totalVendas = t;
	}
	public double getTotalVendas(){
		return this.totalVendas;
	}
	public static int getTotalObjetos(){
		return totalObjetos;
	}
	
	@Override 
	public double getSalarioLiquido(){
		double salario = getSalarioBruto();
		if(salario > 2500){
			salario =salario*0.6*0.9;
		}
		else salario=salario*0.9;
		if(totalVendas > 0){
		salario =salario+ (0.05*totalVendas);
		}
		return salario;
		
	}
	@Override 
	public String toString(){
		return super.toString() + "\nSalario Liquido: " + getSalarioLiquido() +  "\nTotal de vendas: " + totalVendas + "\nTotal de objetos=> " + totalObjetos;
	}
}
