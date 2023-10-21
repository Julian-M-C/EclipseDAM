package añadirComponenteGraficoAlModoDesign;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import com.toedter.calendar.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame frame = new frame();
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
	public frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 713, 467);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre y apellidos:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(31, 34, 149, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre y apellidos:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(31, 141, 149, 20);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(343, 10, 347, 99);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(343, 144, 70, 19);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("-");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(420, 148, 19, 13);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(440, 144, 70, 19);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(531, 144, 70, 19);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("-");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_1.setBounds(515, 147, 19, 13);
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("-");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_2_2.setBounds(608, 147, 19, 13);
		contentPane.add(lblNewLabel_2_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(620, 144, 70, 19);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(31, 215, 160, 20);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Detalles del cliente:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(31, 292, 160, 20);
		contentPane.add(lblNewLabel_1_1_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Pedidos anteriores");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(343, 294, 149, 21);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxPuntosFidelizacin = new JCheckBox("Puntos fidelización");
		chckbxPuntosFidelizacin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxPuntosFidelizacin.setBounds(343, 317, 149, 21);
		contentPane.add(chckbxPuntosFidelizacin);
		
		JCheckBox chckbxTiendaMsCercana = new JCheckBox("Tienda más cercana al usuario");
		chckbxTiendaMsCercana.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxTiendaMsCercana.setBounds(343, 340, 231, 21);
		contentPane.add(chckbxTiendaMsCercana);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(140, 393, 115, 27);
		contentPane.add(btnNewButton);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNuevo.setBounds(287, 393, 103, 27);
		contentPane.add(btnNuevo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBuscar.setBounds(420, 393, 103, 27);
		contentPane.add(btnBuscar);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.getCalendarButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		dateChooser.setBounds(343, 215, 115, 27);
		contentPane.add(dateChooser);
	}
}
