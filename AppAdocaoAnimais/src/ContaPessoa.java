
public class ContaPessoa extends Conta{
	private int CPF;

	public ContaPessoa(String nome, String endereco, int cPF) {
		super(nome, endereco);
		setCPF(cPF);
	}
	
	public int getCPF() {
		return CPF;
	}

	public void setCPF(int cPF) {
		CPF = cPF;
	}
	
	
}
