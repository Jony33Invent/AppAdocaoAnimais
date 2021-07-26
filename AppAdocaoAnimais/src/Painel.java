import java.awt.*;
import javax.swing.*;
//import java.awt.FlowLayout;

/**
 *
 * @author Sachi
 */
class Painel extends JPanel {
	static Color myWhite = new Color(255, 255, 255); 
	static Color myRed = new Color(255, 90, 80); 
  /**
	 * 
	 */
	private static final long serialVersionUID = 7441642089495026890L;
private Image img;
  public Painel(String img) {
    this(new ImageIcon(img).getImage());
  }
  public Painel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }
	public JButton addButton(String s, int x, int y) {

		Font font = new Font("Sansita One", Font.PLAIN, 14);
		JButton button=TranslucentButtonIconTest.makeButton(s,150,50);    
		button.setLocation(x,y);
        button.setSize(150, 50);

		button.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(button);
		return button;
	}
	public JButton addButton(String s, int x, int y,int w) {

		Font font = new Font("Sansita One", Font.PLAIN, 14);
		JButton button=TranslucentButtonIconTest.makeButton(s,w,50);    
		button.setLocation(x,y);
        button.setSize(w, 50);

		button.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(button);
		return button;
	}
	
	public JButton addButton(String s, int x, int y,int w,int h) {

		Font font = new Font("Sansita One", Font.PLAIN, 14);
		JButton button=TranslucentButtonIconTest.makeButton(s,w,h);    
		button.setLocation(x,y);
        button.setSize(w, h);

		button.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(button);
		return button;
	}
	
	public JLabel addLabelWhite(String s, int x, int y) {

		Font font = new Font("Sansita One", Font.PLAIN, 20);
		JLabel label=new JLabel(s);    
		label.setLocation(x,y);
		label.setSize(300, 50);
		label.setForeground(myWhite);

		label.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(label);
		return label;
	}
	public JLabel addLabelRed(String s, int x, int y) {

		Font font = new Font("Sansita One", Font.PLAIN, 20);
		JLabel label=new JLabel(s);    
		label.setLocation(x,y);
		label.setSize(300, 50);
		label.setForeground(myRed);

		label.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(label);
		return label;
	}
	public JLabel addLabel(String s,Font font, int x, int y) {

		JLabel label=new JLabel(s);    
		label.setLocation(x,y);
		label.setSize(300, 50);
		label.setForeground(myWhite);

		label.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(label);
		return label;
	}
	
	public JTextField addTextField(String s,int x, int y) {
        JTextField field = new JTextField(8);

		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabel(s,font,x-80,y-12);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		field.setLocation(x,y);
		field.setSize(200, 25);
		field.setFont(font);
        add(field);
        return field;
	}
	
	public JPasswordField addPasswordField(String s,int x, int y) {
		JPasswordField field = new JPasswordField(8);

		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabel(s,font,x-80,y-12);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		field.setLocation(x,y);
		field.setSize(200, 25);
		field.setFont(font);
        add(field);
        return field;
	}
  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
}


