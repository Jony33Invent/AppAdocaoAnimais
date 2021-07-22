import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.GridLayout;

import javax.swing.JFrame;

public class Interface extends JFrame{
	
	private static final long serialVersionUID = -5529336786288984928L;

	public Interface() {
		 super("PET Adoption - App");
	
	}
	
	public void ExibeTelaEntrada() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(new FlowLayout());
	    //Painel labelPanel=new Painel(new Color(255,90,80,255));
	    ImagePainel entradaPainel=new ImagePainel("img/bg_entrar.png");


	    //labelPanel.addTextLabel("Olá, tudo bem?");
	    entradaPainel.addButton("Adotar",100,190);
	    entradaPainel.addButton("Cadastro",100,270);
	    //add(labelPanel);
	    add(entradaPainel);
	    
	    pack();
		setSize(350,622);
		setResizable(false);
		setVisible(true);
	}
	
	public void ExibeTela2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setLayout(new FlowLayout());
	    Painel labelPanel=new Painel(new Color(255,90,80,255));
	    //ImagePainel buttonPanel=new ImagePainel("img/bg.png");


	    labelPanel.addTextLabel("Olá, tudo bem?");
	    //buttonPanel.addButton("Clique aqui");
	    add(labelPanel);
	    //add(buttonPanel);
	    
	    pack();
		setSize(350,622);
		setResizable(false);

		setVisible(true);
	}
}
