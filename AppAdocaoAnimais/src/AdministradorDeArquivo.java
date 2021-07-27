import java.io.*;

public class AdministradorDeArquivo {
	File arqAnimal;
	BufferedReader animalBr;
	File arqContas;
	BufferedReader contaBr;
	
	
	public AdministradorDeArquivo() throws IOException{
		arqAnimal = new File("cadastros/animais.csv");
		animalBr = new BufferedReader(new FileReader(arqAnimal)) ;
		arqContas = new File("cadastros/contas.csv");
		contaBr = new BufferedReader(new FileReader(arqContas));
	}
	
	public void escreveAnimaisNoArquivo(ListaAnimais ListinhaDeAnimais) throws IOException {
		RandomAccessFile f = new RandomAccessFile("cadastros/animais", "rw");
		f.setLength(0);
		for(int i = 0; i < ListinhaDeAnimais.getNumAnimais(); i++) {
			f.writeChars(ListinhaDeAnimais.pegaAnimal(i).toString());
		}
		f.close();
	}
	
	public ListaAnimais leAnimaisDoArquivo() throws IOException{
		Animal novoAnimal;
		ListaAnimais animais = new ListaAnimais();
		while((novoAnimal = leAnimal()) != null) {
			if(novoAnimal instanceof Cachorro) animais.add_animal_cao((Cachorro)novoAnimal);
			else animais.add_animal_gato((Gato)novoAnimal);
		}
		
		return animais;
	}
	
	public Animal leAnimal() throws IOException{
		String st;
		Animal novoAnimal;
		
		if((st = animalBr.readLine()) == null) return null;
		else {
			String[] num = st.split("|");
			int key = Integer.valueOf(num[0]);
			String nome = num[1];
			int idade = Integer.valueOf(num[2]);
			int porte = Integer.valueOf(num[3]);
			boolean vac = Boolean.valueOf(num[4]);
			boolean cas = Boolean.valueOf(num[5]);
			String localizacao = num[6];
			String descricao = num[7];
			String sexo = num[8];
			
			novoAnimal = new Animal(key, nome, idade, porte, vac, cas, localizacao, descricao,sexo);
		}
		return (novoAnimal);
	}

	public void escreveContasNoArquivo(ListaContas ListaDeContas) throws IOException {
		RandomAccessFile f = new RandomAccessFile("cadastros/animais", "rw");
		f.setLength(0);
		for(int i = 0; i < ListaDeContas.getNumContas(); i++) {
			f.writeChars(ListaDeContas.pegaConta(i).toString());
		}
		f.close();
	}
	
	public ListaContas leContasDoArquivo() throws IOException{
		Conta novaConta;
		ListaContas contas = new ListaContas();
		
		while((novaConta = leConta()) != null) {
			contas.addConta(novaConta);
		}
		
		return contas;
	}
	
	public Conta leConta() throws IOException{
		String st;
		Conta novaConta;
		
		if((st = contaBr.readLine()) == null) return null;
		else {
			String[] num = st.split("|");
			int key = Integer.valueOf(num[0]);
			String nome = num[1];
			String endereco = num[2];
			String email = num[3];
			String senha = num[4];
			
			novaConta = new Conta(key, nome, endereco, email, senha);
		}
		return (novaConta);
	}
	
}

//String[] num = s.split(" ");
//for(int i = 0; i < num.length; i++) {
//	resultados[num[i].charAt(0) - '1'] = dado[num[i].charAt(0) - '1'].getLado(); 
//}