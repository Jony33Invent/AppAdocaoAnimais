
public class Conta {
	private String nome;
	private String endereco;
	
	public Conta (String nom, String end) {
		setNome(nom);
		setEndereco(end);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
