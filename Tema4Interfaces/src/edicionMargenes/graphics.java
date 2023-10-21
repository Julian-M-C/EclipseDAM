package edicionMargenes;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class graphics extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final JSpinner sp1 = null;
	protected static final JSpinner sp2 = null;
	private JPanel contentPane;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					graphics frame = new graphics();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public graphics() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 647, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Página");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(35, 10, 55, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblMargenSuperior = new JLabel("Margen superior");
		lblMargenSuperior.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMargenSuperior.setBounds(202, 10, 116, 27);
		contentPane.add(lblMargenSuperior);
		
		JLabel lblOrientacinDeLa = new JLabel("Orientación de la página");
		lblOrientacinDeLa.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblOrientacinDeLa.setBounds(412, 10, 175, 27);
		contentPane.add(lblOrientacinDeLa);
		
		JSpinner spinner = new JSpinner();
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner.setBounds(212, 47, 55, 32);
		contentPane.add(spinner);
		
		JLabel lblMargenInferior = new JLabel("Margen inferior");
		lblMargenInferior.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMargenInferior.setBounds(202, 133, 116, 27);
		contentPane.add(lblMargenInferior);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		spinner_1.setBounds(212, 170, 55, 32);
		contentPane.add(spinner_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setMaximumRowCount(2);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"horizontal", "verical"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(422, 47, 165, 21);
		contentPane.add(comboBox);
		
		JButton btnInicializar = new JButton("Inicializar");
		btnInicializar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				sp2.setValue(0);
				sp1.setValue(0);
				comboBox.setSelectedIndex(0);
				repaint();
			}
		});
		btnInicializar.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInicializar.setBounds(35, 289, 157, 32);
		contentPane.add(btnInicializar);
	}
	
	public void paint (Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawRect(30,80,100,140);
		
		int ms=Integer.parseInt(sp1.getValue().toString());
		int mi=Integer.parseInt(sp2.getValue().toString());
		
		g.setColor(Color.red);
		g.drawLine(30,80+ms,130,80+ms);
		g.drawLine(30,220-mi,130,220-mi);
		
		String direccion = (String)comboBox.getSelectedItem();
		if (direccion.equals("horizontal"))
			g.drawRect(320,120,200,100   );
		else
			g.drawRect(320,120,200,200   );
		
		
	}
}
