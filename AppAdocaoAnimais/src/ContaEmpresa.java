
public class ContaEmpresa extends Conta{
	private int CNPJ;
	
	public ContaEmpresa(int key, String email, String senha, String nome, String endereco, int cNPJ) {
		super(key, email, senha, nome, endereco);
		setCNPJ(cNPJ);
	}

	public ContaEmpresa(int key,String nom, String end, String email, String senha) {
		super(key,nom,end,email,senha);
	}
	public int getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(int cNPJ) {
		CNPJ = cNPJ;
	}

	
}
