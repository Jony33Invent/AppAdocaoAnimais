
public class ContaEmpresa extends Conta{
	private int CNPJ;
	
	public ContaEmpresa(String email, String senha, String nome, String endereco, int cNPJ) {
		super(email, senha, nome, endereco);
		setCNPJ(cNPJ);
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	
}
