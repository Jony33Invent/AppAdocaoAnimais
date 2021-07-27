
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;

public class Interface{
	
	private JFrame tela;
	
	public Interface() {
		tela=new JFrame("PET Adoption - App");
		try {
		     GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		     ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("fonts//SansitaOne.ttf")));

		} catch (Throwable e) {
		     //Handle exception
		}
	}
	
	private Painel PainelEntrada() {
		Painel entradaPainel=new Painel("img/bg_entrar.png");


	    JButton pessoalBtn=entradaPainel.addButton("Conta Pessoal",100,190);
	    JButton institBtn=entradaPainel.addButton("Conta Institucional",100,270);
	    
	    pessoalBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelPessoal());
	    	  } 
	    	} );
	    institBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelInstitucional());
	    	  } 
	    	} );
	    return entradaPainel;
	}
	
	
	// Sessão Pessoal
	private Painel PainelPessoal() {
		Painel p=new Painel("img/bg_solido.png");

	    p.addLabelWhite("Conta Pessoal",100,100);

	    JButton loginBtn=p.addButton("Login",100,170);
	    JButton cadastroBtn=p.addButton("Cadastro",100,240);
	    JButton backBtn=p.addButton("Voltar",100,400);
	    
	    loginBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(LoginPessoal());
	    	  } 
	    	} );
	    cadastroBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(CadastroPessoal());
	    	  } 
	    	} );
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelEntrada());
	    	  } 
	    	} );
	    return p;
	}
	
	private Painel LoginPessoal() {
		Painel p=new Painel("img/bg_solido.png");

	    p.addLabelWhite("Login",100,100);
	    JTextField email=p.addTextField("E-mail:",100, 170);
	    JPasswordField senha= p.addPasswordField("Senha:",100, 220);
	    
	    JButton enterAppBtn=p.addButton("Entrar",100,280);
	    JButton backBtn=p.addButton("Voltar",100,400);
	    enterAppBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PessoalMenu());
	    	  } 
	    	} );
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelPessoal());
	    	  } 
	    	} );
	    return p;
	}
	
	private Painel CadastroPessoal() {
		Painel p=new Painel("img/bg_solido.png");

	    p.addLabelWhite("Cadastro",100,100);
	    JTextField email=p.addTextField("E-mail:",100, 170);
	    JPasswordField senha= p.addPasswordField("Senha:",100, 220);

	    JPasswordField confSenha= p.addPasswordField("Conf. Senha:",100, 260);
	    JButton enterAppBtn=p.addButton("Cadastrar",100,320);
	    JButton backBtn=p.addButton("Voltar",100,400);
	    enterAppBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PessoalMenu());
	    	  } 
	    	} );
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelPessoal());
	    	  } 
	    	} );
	    return p;
	}
	
	private Painel PessoalMenu() {
		Painel p=new Painel("img/bg_solido2.png");

	    p.addLabelRed("O que deseja fazer?",80,100);

	    JButton adotarUmBtn=p.addButton("Adotar um bichinho",75,170,200);
	    JButton cadastrarUmBtn=p.addButton("Cadastrar um bichinho",75,240,200);
	    JButton backBtn=p.addButton("Voltar",100,400);
	    
	    adotarUmBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(AdotarMenu());
	    	  } 
	    	} );
	    cadastrarUmBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(CadastrarAnimal());
	    	  } 
	    	} );
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelPessoal());
	    	  } 
	    	} );
	    return p;
	}
	
	private Painel AdotarMenu() {
		Painel p=new Painel("img/bg_solido2.png");

	    p.addLabelRed("Qual bichinho deseja adotar?",35,100);

	    JButton caoBtn=p.addButton("Cão",100,170);
	    JButton gatoBtn=p.addButton("Gato",100,240);
	    JButton semPrefBtn=p.addButton("Sem preferência",100,310);
	    JButton backBtn=p.addButton("Voltar",100,400);
	    caoBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelPesquisar(0));
	    	  } 
	    	} );
	    gatoBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelPesquisar(1));
	    	  } 
	    	} );
	    semPrefBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PainelPesquisar(2));
	    	  } 
	    	} );
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(PessoalMenu());
	    	  } 
	    	} );
	    return p;
	}
	
	private Painel CadastrarAnimal() {
		Painel p = new Painel("img/bg_solido2.png");
	    p.addLabelRed("Cadastro", 35, 20);

	    String tipos[] = { "Gato", "Cachorro"};
	    String sexos[] = { "Macho", "Femêa"};
	    
	    JTextField nome = p.addTextFieldRed("Nome:", 130, 140);
	    String nome_animal = nome.getText();
	    
	    JTextField local = p.addTextFieldRed("Localização:", 130, 170);
	    String local_animal = local.getText();
	    
	    JComboBox<String> tipo = p.addComboBox("Tipo:", 130, 200, tipos);
	    String tipo_animal = (String) tipo.getSelectedItem();
	    
	    JComboBox<String> sexo = p.addComboBox("Sexo:", 130, 230, sexos);
	    String sexo_animal = (String) sexo.getSelectedItem();
	    
	    JButton backBtn = p.addButton("Voltar",160, 20);
	    
	    JSpinner idade = p.addNumericInput("Idade:", 130, 260);
	    int idade_animal = (int) idade.getValue();
	    
	    JCheckBox vacinado = p.addCheckBox("Vacinado", 200, 260);
	    boolean vacina_animal;
	    if(vacinado.getSelectedObjects()==null)
	    	vacina_animal = false;
	    else
	    	vacina_animal = true;
	    
	    JCheckBox castrado = p.addCheckBox("Castrado", 200, 290);
	    boolean castrado_animal;
	    if(vacinado.getSelectedObjects()==null)
	    	castrado_animal = false;
	    else
	    	castrado_animal = true;
	    
	    JTextArea descricao = p.addTextArea("Descrição", 100, 310);
	    String descricao_animal = descricao.getText();
	    
	    JButton cadastrarBtn = p.addButton("Cadastrar", 160, 500);
	    cadastrarBtn.addActionListener(new ActionListener() { 
	    	public void actionPerformed(ActionEvent e) {
	    		if(tipo_animal == "Gato") {
	    			Gato animal = new Gato(nome_animal, idade_animal, vacina_animal, castrado_animal, local_animal, descricao_animal, sexo_animal);
	    		}
	    		else if(tipo_animal == "Cachorro") {
	    			Cachorro animal = new Cachorro(nome_animal, idade_animal, vacina_animal, castrado_animal, local_animal, descricao_animal, sexo_animal);
	    		}
	    		else {
		    		Animal animal = new Animal(nome_animal, idade_animal, vacina_animal, castrado_animal, local_animal,
		    		    		descricao_animal, sexo_animal);	
	    		}
	    		OpenNewPainel(PerfilAnimal(animal));
	    	} 
	    } );
	    
	    backBtn.addActionListener(new ActionListener() { 
	    	public void actionPerformed(ActionEvent e) { 
	    		OpenNewPainel(PessoalMenu());
	    	} 
	    } );
	    
	    return p;
	}
	
	private Painel PerfilAnimal(Animal a) {
		Painel p=new Painel("img/bg_solido.png");
		
	    p.addLabelWhite("Nome: ", 100, 100);

	    p.addLabelWhite("Idade: ", 100, 130);

	    p.addLabelWhite("Castrado: ", 100, 160);

	    p.addLabelWhite("Localização: ", 100, 190);

	    p.addLabelWhite("Descrição: ", 100, 220);
	    
	    JButton backBtn = p.addButton("Voltar", 100, 400);
	    
	    backBtn.addActionListener(new ActionListener() { 
	    	public void actionPerformed(ActionEvent e) { 
	    		OpenNewPainel(PessoalMenu());
	    	}
	    } );
		
	    return p;
	}
	
	private Painel PainelPesquisar(int tipo) {
		Painel p = new Painel("img/bg_solido2.png");
		
		/* tipo
		 *  0 -> cão
		 *  1 -> gato
		 *  2 -> ambos
		 */
		String str="";
		switch(tipo) {
			case 0:
				str="Pesquisar por cão";
			break;
			case 1:
				str="Pesquisar por gato";
			break;
			case 2:
				str="Pesquisar";
			break;
		}
				
	    p.addLabelRed(str,35,100);
	    JButton backBtn=p.addButton("Voltar",100,400);
	    
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenNewPainel(AdotarMenu());
	    	  } 
	    	} );
	    return p;
	}
	
	// Sessão Institucional
	private Painel PainelInstitucional() {
		Painel p=new Painel("img/bg_solido.png");

	    tela.setLayout(new GridBagLayout());
	    p.addLabelRed("Conta Institucional",85,100);

	    JButton loginBtn=p.addButton("Login",100,170);
	    JButton cadastroBtn=p.addButton("Cadastro",100,240);
	    JButton backBtn=p.addButton("Voltar",100,400);
	    
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    		  OpenNewPainel(PainelEntrada());
	    	  } 
	    	} );
	    return p;
	}

	
	
	public void ExibeTelaEntrada() {
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Painel p=CadastrarAnimal();

		tela.add(p);
		tela.pack();
		tela.setSize(350,622);
	    CenterJFrame(tela);
	    tela.setResizable(false);
	    tela.setVisible(true);
	}
	
	private void CenterJFrame(JFrame jf) {
		  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		  jf.setLocation(dim.width/2-jf.getSize().width/2, dim.height/2-jf.getSize().height/2);
		    
	}
	
	private void OpenNewPainel(Painel p) {
		tela.getContentPane().removeAll();
		
		tela.getContentPane().add(p);

		tela.revalidate();
		tela.repaint();

	}
	
}
