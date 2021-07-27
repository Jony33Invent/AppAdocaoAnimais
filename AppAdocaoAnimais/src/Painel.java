import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
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
	    Dimension size = new Dimension(350, 622);
	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
	    setLayout(null);
  }
  public void ChangeSize(Dimension size){

	    setPreferredSize(size);
	    setMinimumSize(size);
	    setMaximumSize(size);
	    setSize(size);
  }
  
  public JButton addButton(String s, int x, int y) {

		Font font = new Font("Sansita One", Font.PLAIN, 14);
		JButton button=TranslucentButtonIconTest.makeButton(s,150,50,false);    
		button.setLocation(x,y);
        button.setSize(150, 50);

		button.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(button);
		return button;
	}
  public JScrollPane addScrollPane(int x,int y) {
	  JScrollPane pane=new JScrollPane();
      pane.setBounds(x, y, 370, 400);
      pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

	  add(pane);
	  return pane;
  }
  public JButton addButtonFlow(String s, int w, int h) {

		Font font = new Font("Sansita One", Font.PLAIN, 14);
		JButton button=TranslucentButtonIconTest.makeButton(s,w,h,true);    
		button.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		add(button);
		return button;
	}
  public JButton addButtonFlow(String s, int w, int h,JScrollPane pane) {

		Font font = new Font("Sansita One", Font.PLAIN, 14);
		JButton button=TranslucentButtonIconTest.makeButton(s,w,h,true);    
		button.setFont(font);
        //button.setOpaque(false);
        //button.setBorderPainted(false);
		pane.add(button);
		return button;
	}
	public JButton addButton(String s, int x, int y,int w) {

		Font font = new Font("Sansita One", Font.PLAIN, 14);
		JButton button=TranslucentButtonIconTest.makeButton(s,w,50,false);    
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
		JButton button=TranslucentButtonIconTest.makeButton(s,w,h,false);    
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
		public JLabel addLabelWhite(String s, int x, int y,int size) {

		Font font = new Font("Sansita One", Font.PLAIN, size);
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
	public JLabel addLabelRed(String s,Font font, int x, int y) {

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
		field.setText("");
		field.setFont(font);
        add(field);
        return field;
	}
	public JTextField addTextFieldRed(String s,int x, int y) {
        JTextField field = new JTextField(8);

		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabelRed(s,font,x-100,y-12);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		field.setLocation(x,y);
		field.setSize(180, 25);
		field.setText("");
		field.setFont(font);
        add(field);
        return field;
	}
	public JTextField addTextFieldWhite(String s,int x, int y) {
        JTextField field = new JTextField(8);

		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabel(s,font,x-100,y-12);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		field.setLocation(x,y);
		field.setSize(180, 25);
		field.setText("");
		field.setFont(font);
        add(field);
        return field;
	}
	public JComboBox<String> addComboBox(String s,int x, int y, String s1[]) {
	       
		JComboBox<String> field = new JComboBox<String>(s1);

		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabelRed(s,font,x-100,y-12);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		field.setLocation(x,y);
		field.setSize(180, 25);
		field.setFont(font);
        add(field);
        return field;
	}
	public JSpinner addNumericInput(String s,int x, int y) {
		SpinnerModel model = new SpinnerNumberModel(0, 0, 99,1);              

		JSpinner spinner = new JSpinner(model);
		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabelRed(s,font,x-100,y-12);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		 spinner.setLocation(x,y);
		 spinner.setSize(60, 25);
		 spinner.setFont(font);
        add(spinner);
        return spinner;
	}
	public JCheckBox addCheckBox(String s,int x, int y) {
		JCheckBox box = new JCheckBox(s);
		Font font = new Font("SansSerif", Font.BOLD, 15);
	    //addLabelRed(s,font,x-100,y-12);
		 box.setLocation(x,y);
		 box.setSize(150, 25);
		 box.setOpaque(false);
		 box.setFont(font);
		 box.setForeground(myRed);
        add(box);
        return box;
	}
	
	public JPasswordField addPasswordField(String s,int x, int y) {
		JPasswordField field = new JPasswordField(8);

		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabel(s,font,x-80,y-12);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		field.setLocation(x+20,y);
		field.setSize(180, 25);
		field.setFont(font);
        add(field);
        return field;
	}
	
	public JTextArea addTextArea(String s,int x, int y) {
		JTextArea area = new JTextArea();

		Font font = new Font("SansSerif", Font.BOLD, 15);
	    addLabelRed(s,font,x-80,y);
		 font = new Font("SansSerif", Font.PLAIN, 15);
		 area.setLocation(x-80,y+40);
		area.setSize(300, 120);
		 area.setFont(font);
		 Border border = BorderFactory.createLineBorder(Color.BLACK);
		    area.setBorder(BorderFactory.createCompoundBorder(border,
		            BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        add(area);
        return area;
	}
  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
}


