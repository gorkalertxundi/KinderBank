import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Account extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_5;
	private JTextField textField_3;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Account frame = new Account();
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
	public Account() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1132, 720);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/kinder/Documentos/Proyects/KinderBank/img/KinderBank2.png"));
		lblNewLabel.setBounds(220, 12, 700, 111);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Numero de cuenta:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1.setBounds(103, 177, 224, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Numero MICR:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_1.setBounds(103, 245, 224, 28);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Pin:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_1_1.setBounds(103, 316, 224, 28);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tipo de cuenta:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_1_1_1.setBounds(103, 393, 224, 28);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Genero:");
		lblNewLabel_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1.setBounds(103, 464, 224, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("Direccion:");
		lblNewLabel_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_1_1_1_1_1.setBounds(103, 535, 224, 28);
		contentPane.add(lblNewLabel_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField.setBounds(328, 177, 212, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField_1.setColumns(10);
		textField_1.setBounds(328, 245, 212, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField_2.setColumns(10);
		textField_2.setBounds(328, 316, 212, 28);
		contentPane.add(textField_2);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField_5.setColumns(10);
		textField_5.setBounds(328, 535, 212, 28);
		contentPane.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Elegir...", "Credito", "Debito"}));
		comboBox.setBounds(328, 394, 212, 29);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnHombre = new JRadioButton("Hombre");
		rdbtnHombre.setForeground(Color.WHITE);
		rdbtnHombre.setBackground(Color.DARK_GRAY);
		rdbtnHombre.setBounds(328, 468, 86, 23);
		contentPane.add(rdbtnHombre);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Mujer");
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(Color.DARK_GRAY);
		rdbtnNewRadioButton.setBounds(429, 468, 86, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nombre:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_2.setBounds(589, 177, 224, 28);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Fecha de nacimiento:");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_2_1.setBounds(589, 245, 224, 28);
		contentPane.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("Nacionalidad:");
		lblNewLabel_1_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_2_1_1.setBounds(589, 316, 224, 28);
		contentPane.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1 = new JLabel("Nacionalidad:");
		lblNewLabel_1_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_2_1_1_1.setBounds(589, 393, 224, 28);
		contentPane.add(lblNewLabel_1_2_1_1_1);
		
		JLabel lblNewLabel_1_2_1_1_1_1 = new JLabel("Movil:");
		lblNewLabel_1_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1_1_1_1.setFont(new Font("Dialog", Font.BOLD, 17));
		lblNewLabel_1_2_1_1_1_1.setBounds(589, 464, 224, 28);
		contentPane.add(lblNewLabel_1_2_1_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField_3.setColumns(10);
		textField_3.setBounds(844, 177, 212, 28);
		contentPane.add(textField_3);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField_7.setColumns(10);
		textField_7.setBounds(844, 393, 212, 28);
		contentPane.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField_8.setColumns(10);
		textField_8.setBounds(844, 464, 212, 28);
		contentPane.add(textField_8);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Elegir...", "España", "Portugal", "Francia", "Italia", "Suiza", "Alemania", "Gran Bretaña", "Irlanda", "Islandia", "Austria", "Republica Checa", "Paises Bajos", "Croacia", "Serbia", "Bulgaria", "Hungria", "Ucrania", "Polonia", "Bielorrusia", "Lituania", "Noruega", "Suecia", "Finlandia", "Estonia"}));
		comboBox_1.setBounds(844, 315, 212, 29);
		contentPane.add(comboBox_1);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 17));
		textField_4.setColumns(10);
		textField_4.setBounds(844, 245, 212, 28);
		contentPane.add(textField_4);
		
		JButton btnCrear = new JButton("Crear");
		btnCrear.setFont(new Font("Dialog", Font.BOLD, 17));
		btnCrear.setBounds(328, 614, 117, 25);
		contentPane.add(btnCrear);
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.setFont(new Font("Dialog", Font.BOLD, 17));
		btnAtras.setBounds(513, 614, 117, 25);
		contentPane.add(btnAtras);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.setFont(new Font("Dialog", Font.BOLD, 17));
		btnLimpiar.setBounds(696, 614, 117, 25);
		contentPane.add(btnLimpiar);
	}
}
