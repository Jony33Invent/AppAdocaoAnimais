
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JPanel;

public class Painel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 637515007435428095L;
	public Painel(Color c, String s) {
	    super();
	    setBackground(c);
	    add(new Componente(s));
	}
}

class Componente extends JComponent {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9143209223343491709L;
	String mensagem;
	  public Componente(String s) {
	    super();
	    this.mensagem = s;
	  }
	  @Override
	  public void paintComponent(Graphics g) {
	    g.setFont(new Font("SansSerif", Font.BOLD, 18));
	    g.drawString(this.mensagem, 10, 50);
	  }
	  @Override
	  public Dimension getPreferredSize() {
	    return new Dimension(150,100);
	  }
	}
