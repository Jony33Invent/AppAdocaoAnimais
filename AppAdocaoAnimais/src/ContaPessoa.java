
public class ContaPessoa extends Conta{
	private int CPF;

	public ContaPessoa(String email, String senha, String nome, String endereco, int cPF) {
		super(email, senha, nome, endereco);
		setCPF(cPF);
	}
	public ContaPessoa(String nom, String end, String email, String senha) {
		super(nom,end,email,senha);
	}
	
	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	
}
