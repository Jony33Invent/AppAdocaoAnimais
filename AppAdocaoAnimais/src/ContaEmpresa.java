
public class ContaEmpresa extends Conta{
	private int CNPJ;
	
	public ContaEmpresa(String nome, String endereco, int cNPJ) {
		super(nome, endereco);
		setCNPJ(cNPJ);
	}

	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	
}
