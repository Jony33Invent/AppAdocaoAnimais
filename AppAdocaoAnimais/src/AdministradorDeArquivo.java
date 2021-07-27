import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdministradorDeArquivo {
	File arqAnimal;
	BufferedReader animalBr;
	File arqContas;
	BufferedReader contaBr;
	
	public AdministradorDeArquivo() throws FileNotFoundException{
		arqAnimal = new File("cadastros/animais.csv");
		animalBr = new BufferedReader(new FileReader(arqAnimal)) ;
		arqContas = new File("cadastros/contas.csv");
		contaBr = new BufferedReader(new FileReader(arqContas));
	}
	
	public void leArquivo() {
		
	}
	
	public boolean leAnimal() throws IOException{
		String st;
		
		if((st = animalBr.readLine()) == null) return false;
		else {
			String[] num = st.split(" ");
			String nome = num[0];
			int idade = num[1];
			int porte = num[2];
			vacinado = num[3];
			castrado = num[4];
			localizacao = num[5];
			descricao = num[6];
			sexo = num[7];
		}
		return true;
	}
}

//String[] num = s.split(" ");
//for(int i = 0; i < num.length; i++) {
//	resultados[num[i].charAt(0) - '1'] = dado[num[i].charAt(0) - '1'].getLado(); 
//}