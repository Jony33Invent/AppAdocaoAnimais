
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 637515007435428095L;
	public Painel(Color c) {
	    super();
	    setBackground(c);
	}
	
	public void addTextComp(String s) {
	    add(new Componente(s));
	}
	public JLabel addTextLabel(String s) {
		JLabel label=new JLabel(s);
		add(label);
		return label;
	}
	public JButton addButton(String s) {
		JButton button=new JButton(s);
		button.setBounds(10, 10, 100, 20);
		add(button);
		return button;
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
