import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JFrame;

public class Interface extends JFrame{
	
	private static final long serialVersionUID = -5529336786288984928L;

	public Interface() {
		 super("hello world");
	
	}
	
	public void Exibe() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(1,2));
	    add(new Painel(new Color(119,187,230,255), "painel azul"));
	    add(new Painel(Color.RED,  "painel vermelho"));
	    add(new Painel(Color.PINK, "painel rosa"));
		setSize(400,200);
		setVisible(true);
	}
}
