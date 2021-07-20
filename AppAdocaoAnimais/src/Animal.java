
public class Animal {
	private String nome;
	private int idade;
	private boolean vacinado;
	private boolean castrado;
	private String localizacao;
	private String descricao;

	// Construtores
	public Animal(String nom,int id, boolean vac, boolean cas, String loc, String des) {
		setNome(nom);
		setIdade(id);
		setVacinado(vac);
		setCastrado(cas);
		setLocalizacao(loc);
		setDescricao(des);
	}
	
	public Animal(String nom,int id,String loc) {
		setNome(nom);
		setIdade(id);
		setLocalizacao(loc);
	}
	
	public Animal(String nom,int id,String loc, String des) {
		setNome(nom);
		setIdade(id);
		setLocalizacao(loc);
		setDescricao(des);
	}
	
	// Getters and Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isVacinado() {
		return vacinado;
	}

	public void setVacinado(boolean vacinado) {
		this.vacinado = vacinado;
	}

	public boolean isCastrado() {
		return castrado;
	}

	public void setCastrado(boolean castrado) {
		this.castrado = castrado;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
