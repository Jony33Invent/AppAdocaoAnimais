
public class ContaPessoa extends Conta{
	private int CPF;

	public ContaPessoa(int key, String email, String senha, String nome, String endereco, int cPF) {
		super(key, email, senha, nome, endereco);
		setCPF(cPF);
	}
	
	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	
}
