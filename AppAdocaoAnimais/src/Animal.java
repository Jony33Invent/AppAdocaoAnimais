
public class Animal {
	private int key;
	private String nome;
	private int idade;
	private int porte;
	private boolean vacinado;
	private boolean castrado;
	private String localizacao;
	private String descricao;
	private String sexo;

	// Construtores

	public Animal(int key, String nom, int id, int porte, boolean vac, boolean cas, String loc, String des, String sexo) {
		setKey(key);
		setNome(nom);
		setIdade(id);
		setPorte(porte);
		setVacinado(vac);
		setCastrado(cas);
		setLocalizacao(loc);
		setDescricao(des);
		setSexo(sexo);
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
	
	public String toString() {
		String str = new String();
		
		str.concat(String.valueOf(this.key) + '|' + this.nome + '|' + String.valueOf(this.idade) + '|' + String.valueOf(this.porte)
		+ '|' + String.valueOf(this.vacinado) + '|' + String.valueOf(this.castrado) + '|' + this.localizacao + '|' + this.descricao + '|' 
		+ this.sexo + '\n');
		
		return str;
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
	
	public int getPorte() {
		return porte;
	}

	public void setPorte(int porte) {
		this.porte = porte;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}
}
