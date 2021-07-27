import java.util.ArrayList;
import java.util.List;

public class ListaContas {
	private List<Conta> contas;
	private int num_contas;
	
	public ListaContas() {
		contas = new ArrayList<Conta>();
		num_contas = 0;
	}
	
	public int getNumContas() {
		return num_contas;
	}
	
	public Conta pegaConta(int i) {
		return this.contas.get(i);
	}
	
	public boolean contaExistente(String email) {
		for(int i = 0; i < num_contas; i++) {
			if(this.contas.get(i).getEmail().compareTo(email) == 0) return true;
		}
		
		return false;
	}
	
	public boolean addConta(int key, String nome, String endereco, String email, String senha) {
		if(this.contaExistente(email)) return false;
		
		Conta novaConta = new Conta(key, nome, endereco, email, senha);
		
		this.contas.add(novaConta);
		num_contas++;
		return true;
	}
	
	public void addConta(Conta novaConta) {
		this.contas.add(novaConta);
		this.num_contas++;
	}
	
	public boolean checkSenha(String email, String senha) {
		if(!(this.contaExistente(email))) return false;
		for(int i = 0; i < num_contas; i++) {
			if(this.contas.get(i).getEmail().compareTo(email) == 0) {
				if(this.contas.get(i).getSenha().compareTo(senha) == 0) return true;
				else return false;
			}
		}
		return false;
	}
}
