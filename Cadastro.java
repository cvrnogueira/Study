import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Cadastro {
	ArrayList<Funcionario> cadastros;
	
	public Cadastro(){
		cadastros = new ArrayList<>();
	}
	
	public void inclui(Funcionario f){
		cadastros.add(f);
	}
	public boolean exclui(String codigo){
		for(Funcionario aux: cadastros){
			if(aux.getCodigo().equals(codigo)){
				aux = null;
				return true;
			}
		}
		return false;
	}
	public void ordenaNome(){
		cadastros.sort(Comparator.comparing(Funcionario :: getNome));
	}
	public void ordenaSalarioBruto(){
		cadastros.sort(Comparator.comparing(Funcionario :: getSalarioBruto));
	}
	public void ordenaSalarioBrutoEOrdenaNome(){
		cadastros.sort(Comparator.comparing((Funcionario a)-> a.getNome()).thenComparing(a-> a.getSalarioBruto()));
	}

}


