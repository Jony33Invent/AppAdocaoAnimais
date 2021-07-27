import java.util.ArrayList;
import java.util.List;

public class ListaContas {
	private List<Conta> contas;
	private int num_contas;
	
	public ListaContas() {
		contas = new ArrayList<Conta>();
		num_contas = 0;
	}
	
	public boolean contaExistente(String email) {
		for(int i = 0; i < num_contas; i++) {
			if(this.contas.get(i).getEmail().equals(email)) return true;
		}
		
		return false;
	}
	public boolean contaInstitucionalExistente(String email) {
		Conta c;
		for(int i = 0; i < num_contas; i++) {
			c=this.contas.get(i);
			if(c instanceof ContaEmpresa && c.getEmail().equals(email)) return true;
		}
		
		return false;
	}
	public boolean contaPessoalExistente(String email) {
		Conta c;
		for(int i = 0; i < num_contas; i++) {
			c=this.contas.get(i);
			if(c instanceof ContaPessoa && c.getEmail().equals(email)) return true;
		}
		
		return false;
	}
	public boolean addConta(String nome, String endereco, String email, String senha) {
		if(this.contaExistente(email)) return false;
		
		Conta novaConta = new Conta(nome, endereco, email, senha);
		
		this.contas.add(novaConta);
		num_contas++;
		return true;
	}

	public boolean addPessoa(String nome, String endereco, String email, String senha) {
		if(this.contaExistente(email)) return false;
		
		ContaPessoa novaConta = new ContaPessoa(nome, endereco, email, senha);
		
		this.contas.add(novaConta);
		num_contas++;
		return true;
	}
	public boolean addEmpresa(String nome, String endereco, String email, String senha) {
		if(this.contaExistente(email)) return false;
		
		ContaEmpresa novaConta = new ContaEmpresa(nome, endereco, email, senha);
		
		this.contas.add(novaConta);
		num_contas++;
		return true;
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
