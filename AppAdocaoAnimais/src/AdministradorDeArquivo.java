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
			st.split(" ");
		}
		return true;
	}
}
