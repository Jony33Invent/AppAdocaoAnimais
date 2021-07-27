import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
	public class ListaAnimais {
		
		private List<Animal> animais;
		private int num_animais;
		private int num_caes;
		private int num_gatos;
		
		public ListaAnimais() {
			animais = new ArrayList<Animal>();
			num_animais = 0;
			num_caes = 0;
			num_gatos = 0;
		}
		
		public Animal pegaAnimal(int i) {
			return this.animais.get(i);
		}
		
		/**/
		public void add_animal_cao(int key,String nom,int id, int porte, boolean vac, boolean cas, String loc, String des,String sexo) {
			Animal cao = new Cachorro(key,nom, id, porte, vac, cas, loc, des,sexo);
			animais.add(cao);
			num_animais++;
			num_caes++;
		}
		public void add_animal_nome(String nom) {
			Animal cao = new Cachorro(0,nom, 0, 0, true, true, "", "","Macho");
			animais.add(cao);
			num_animais++;
			num_caes++;
		}
		/**/
		public void add_animal_gato(int key,String nom,int id, int porte, boolean vac, boolean cas, String loc, String des,String sexo) {
			Animal gato = new Gato(key,nom, id, porte, vac, cas, loc, des, sexo);
			animais.add(gato);
			num_animais++;
			num_gatos++;
		}
		
		public void add_animal_gato(Gato gato) {
			animais.add(gato);
			num_animais++;
			num_gatos++;
		}
		
		public void add_animal_cao(Cachorro cao) {
			animais.add(cao);
			num_animais++;
			num_caes++;
		}
		
		public int getNumAnimais() {
			return num_animais;
		}
		
		public int getNumCaes() {
			return num_caes;
		}
		
		public int getNumGatos() {
			return num_gatos;
		}
		
		public void ordenaAnimaisPorTipo() {
			Collections.sort(animais, new SortByTipo());
		}
		
		public void ordenaAnimaisPorLocalizacao() {
			Collections.sort(animais, new SortByLocalizacao());
		}
		
		public void ordenaAnimaisPorIdade() {
			Collections.sort(animais, new SortByIdade());
		}
		
		public void ordenaAnimaisPorPorte() {
			Collections.sort(animais, new SortByPorte());
		}
		
		public void ordenaAnimaisPorNome() {
			Collections.sort(animais, new SortByNome());
		}
		
		public ListaAnimais pesquisaPorTipo(int Tipo) {
			ListaAnimais novaLista = new ListaAnimais();
			
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorTipo();
			
			if(Tipo == 1) {
				novaLista.num_caes = this.num_caes;
				novaLista.num_animais = this.num_caes;
				for(int i = 0; i < this.num_caes; i++) {
					matchList.add(animais.get(i));
				}
			}
			else if(Tipo == 2) {
				novaLista.num_caes = this.num_gatos;
				novaLista.num_animais = this.num_gatos;
				for(int i = this.num_caes; i < this.num_animais; i++) {
					matchList.add(animais.get(i));					
				}
			}
			
			novaLista.SetLista(matchList);
			
			return novaLista;
		}
		
		public ListaAnimais pesquisaPorLocalizacao(String Localizacao) {
			ListaAnimais novaLista = new ListaAnimais();
			
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorLocalizacao();
			
			int i = 0;
			while(i < this.num_animais && animais.get(i).getLocalizacao().compareTo(Localizacao) < 0) {
				i++;
			}
			
			while(i < this.num_animais && animais.get(i).getLocalizacao().compareTo(Localizacao) == 0) {
				matchList.add(animais.get(i));
				novaLista.num_animais++;
				if(animais.get(i) instanceof Cachorro) novaLista.num_caes++;
				else novaLista.num_gatos++;
				i++;
			}

			novaLista.SetLista(matchList);
			
			return novaLista;
		}
		
		public ListaAnimais pesquisaPorIdade(int Idade) {
			ListaAnimais novaLista = new ListaAnimais();
			
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorIdade();
			
			int i = 0;
			while(i < this.num_animais && animais.get(i).getIdade() < Idade) {
				i++;
			}
			
			while(i < this.num_animais && animais.get(i).getIdade() == Idade) {
				matchList.add(animais.get(i));
				novaLista.num_animais++;
				if(animais.get(i) instanceof Cachorro) novaLista.num_caes++;
				else novaLista.num_gatos++;
				i++;
			}

			novaLista.SetLista(matchList);
						
			return novaLista;
		}
		
		public ListaAnimais pesquisaPorNome(String Nome) {
			ListaAnimais novaLista = new ListaAnimais();
			
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorNome();
			System.out.print(this.num_animais);
			int i = 0;
			
			while(i < this.num_animais && animais.get(i).getNome().compareTo(Nome) < 0) {
				i++;
			}
			
			while(i < this.num_animais && animais.get(i).getNome().compareTo(Nome) == 0) {
				matchList.add(animais.get(i));
				novaLista.num_animais++;
				if(animais.get(i) instanceof Cachorro) novaLista.num_caes++;
				else novaLista.num_gatos++;
				i++;
			}

			novaLista.SetLista(matchList);
						
			return novaLista;
		}
		
		public ListaAnimais pesquisaPorPorte(int Porte) {
			ListaAnimais novaLista = new ListaAnimais();
			
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorPorte();
			
			int i = 0;
			while(i < this.num_animais && animais.get(i).getPorte() < Porte) {
				i++;
			}
			
			while(i < this.num_animais && animais.get(i).getPorte() == Porte) {
				matchList.add(animais.get(i));
				novaLista.num_animais++;
				if(animais.get(i) instanceof Cachorro) novaLista.num_caes++;
				else novaLista.num_gatos++;
				i++;
			}

			novaLista.SetLista(matchList);
									
			return novaLista;
		}
		public List<Animal> getAll(){
			return animais;
		}
		
		public void SetLista(List<Animal> novaLista){
			animais=novaLista;
		}
		
		public int getSize(){
			return animais.size();
		}
	}
	class SortByTipo implements Comparator<Animal>
	{
	    public int compare(Animal a, Animal b)
	    {
	    	if(a instanceof Gato && b instanceof Cachorro) return 1;
	    	else return -1;
	    }
	}
	
	class SortByLocalizacao implements Comparator<Animal>
	{
	    public int compare(Animal a, Animal b)
	    {
	    	return a.getLocalizacao().compareTo(b.getLocalizacao());
	    }
	}
	
	class SortByIdade implements Comparator<Animal>
	{
	    public int compare(Animal a, Animal b)
	    {
	    	return a.getIdade() - b.getIdade();
	    }
	}
	
	class SortByPorte implements Comparator<Animal>
	{
	    public int compare(Animal a, Animal b)
	    {
	    	return a.getPorte() - b.getPorte();
	    }
	}
	
	class SortByNome implements Comparator<Animal>
	{
	    public int compare(Animal a, Animal b)
	    {
	    	return a.getNome().compareTo(b.getNome());
	    }
	}

