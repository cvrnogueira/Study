
public class App {

	public static void main(String args[]){
		Vendedor v1 = new Vendedor("01", "Catarina", 10);
		Vendedor v2 = new Vendedor("01", "Catarina", 10, 10);
		System.out.println(v1);
		System.out.println(v2);
		Funcionario f2 = v1;
		Funcionario f3 = v2;
		Vendedor v3 = (Vendedor) f2;
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(v3);
	}
}
