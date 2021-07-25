
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Interface{
	
	private JFrame telaEntrada;
	private JFrame telaAdocao;
	
	public Interface() {
		 telaEntrada=new JFrame("PET Adoption - App");
		 telaAdocao=new JFrame("PET Adoption - App");
	
	}
	
	private Painel PainelEntrada() {
		Painel entradaPainel=new Painel("img/bg_entrar.png");


	    //labelPanel.addTextLabel("Olá, tudo bem?");
	    JButton adoptBtn=entradaPainel.addButton("Adotar",100,190);
	    JButton registerBtn=entradaPainel.addButton("Cadastro",100,270);
	    
	    adoptBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    AdoptButtonPressed(telaEntrada);
	    	  } 
	    	} );
	    return entradaPainel;
	}
	
	private Painel PainelAdocao() {
		Painel adocaoPainel=new Painel("img/bg_solido.png");


	    JButton backBtn=adocaoPainel.addButton("Voltar",100,270);
	    
	    backBtn.addActionListener(new ActionListener() { 
	    	  public void actionPerformed(ActionEvent e) { 
	    	    OpenHomeScreen(telaEntrada);
	    	  } 
	    	} );
	    return adocaoPainel;
	}
	
	public void ExibeTelaEntrada() {
		telaEntrada.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Painel p=PainelEntrada();

	    telaEntrada.add(p);
	    telaEntrada.pack();
	    telaEntrada.setSize(350,622);
	    CenterJFrame(telaEntrada);
	    telaEntrada.setResizable(false);
	    telaEntrada.setVisible(true);
	}
	
	private void CenterJFrame(JFrame jf) {
		  Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		  jf.setLocation(dim.width/2-jf.getSize().width/2, dim.height/2-jf.getSize().height/2);
		    
	}
	private void OpenHomeScreen(JFrame currScreen) {
		currScreen.getContentPane().removeAll();
		
		Painel p=PainelEntrada();

		currScreen.getContentPane().add(p);

		currScreen.revalidate();
		currScreen.repaint();

	}
	private void AdoptButtonPressed(JFrame currScreen) {
		currScreen.getContentPane().removeAll();
		Painel p=PainelAdocao();

		currScreen.getContentPane().add(p);

		currScreen.revalidate();
		currScreen.repaint();
	}
	
}
