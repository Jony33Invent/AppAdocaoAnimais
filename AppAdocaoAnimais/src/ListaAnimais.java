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
		
		/**/
		public void add_animal_cao(String nom,int id, int porte, boolean vac, boolean cas, String loc, String des,String sexo) {
			Animal cao = new Cachorro(nom, id, porte, vac, cas, loc, des,sexo);
			animais.add(cao);
			num_animais++;
			num_caes++;
		}
		
		/**/
		public void add_animal_gato(String nom,int id, int porte, boolean vac, boolean cas, String loc, String des,String sexo) {
			Animal gato = new Gato(nom, id, porte, vac, cas, loc, des, sexo);
			animais.add(gato);
			num_animais++;
			num_gatos++;
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
		
		public List<Animal> pesquisaPorTipo(int Tipo) {
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorTipo();
			
			if(Tipo == 1) {
				for(int i = 0; i < this.num_caes; i++) {
					matchList.add(animais.get(i));
				}
			}
			else if(Tipo == 2) {
				for(int i = this.num_caes; i < this.num_animais; i++) {
					matchList.add(animais.get(i));					
				}
			}
			
			return matchList;
		}
		
		public List<Animal> pesquisaPorLocalizacao(String Localizacao) {
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorLocalizacao();
			
			int i = 0;
			while(animais.get(i).getLocalizacao().compareTo(Localizacao) < 0 && i < this.num_animais) {
				i++;
			}
			
			while(animais.get(i).getLocalizacao().compareTo(Localizacao) == 0 && i < this.num_animais) {
				matchList.add(animais.get(i));
				i++;
			}
			
			return matchList;
		}
		
		public List<Animal> pesquisaPorIdade(int Idade) {
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorIdade();
			
			int i = 0;
			while(animais.get(i).getIdade() < Idade && i < this.num_animais) {
				i++;
			}
			
			while(animais.get(i).getIdade() == Idade && i < this.num_animais) {
				matchList.add(animais.get(i));
				i++;
			}
			
			return matchList;
		}
		
		public List<Animal> pesquisaPorNome(String Nome) {
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorNome();
			
			int i = 0;
			while(animais.get(i).getNome().compareTo(Nome) < 0 && i < this.num_animais) {
				i++;
			}
			
			while(animais.get(i).getNome().compareTo(Nome) == 0 && i < this.num_animais) {
				matchList.add(animais.get(i));
				i++;
			}
			
			return matchList;
		}
		
		public List<Animal> pesquisaPorPorte(int Porte) {
			List<Animal> matchList = new ArrayList<Animal>();
			
			this.ordenaAnimaisPorPorte();
			
			int i = 0;
			while(animais.get(i).getPorte() < Porte && i < this.num_animais) {
				i++;
			}
			
			while(animais.get(i).getPorte() == Porte && i < this.num_animais) {
				matchList.add(animais.get(i));
				i++;
			}
			
			return matchList;
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

