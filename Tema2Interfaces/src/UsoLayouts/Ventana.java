package UsoLayouts;

import javax.swing.*;

public class Ventana extends JFrame {
	
	private JPanel panel1;
	
	private JButton b1, b2, b3, b4;
	
	public Ventana() {
		panel1 = new JPanel();
		
		b1 = new JButton("Botón 1");
		b2 = new JButton("Botón 2");
		b3 = new JButton("Botón 3");
		b4 = new JButton("Botón 4");
		
		this.add(panel1);
		
		panel1.add(b1);
		panel1.add(b2);
		panel1.add(b3);
		panel1.add(b4);
		
	}
}
