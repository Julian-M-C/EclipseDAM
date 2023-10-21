package ModificacionPropiedadesDesdeDesignYsource;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.GridLayout;

public class Principal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 636, 384);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 20, 100));
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 16));
		contentPane.add(lblNewLabel);
		
		textUsuario = new JTextField();
		textUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		textUsuario.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textUsuario.setText("anonimo");
		textUsuario.setForeground(new Color(255, 0, 0));
		textUsuario.setBackground(new Color(192, 192, 192));
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		contentPane.add(passwordField);
		
		JButton boton_inicio = new JButton("Inicio");
		boton_inicio.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(boton_inicio);
		
		JButton boton_2 = new JButton("Salir");
		boton_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(boton_2);
	}
}
