
public class Conta {
	private String nome;
	private String endereco;
	private String email;
	private String senha;
	
	public Conta (String email, String senha, String nom, String end) {
		setEmail(email);
		setSenha(senha);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
