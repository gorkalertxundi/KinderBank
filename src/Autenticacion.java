import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Autenticacion extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNDCuenta;
	private JTextField textFieldPin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Autenticacion frame = new Autenticacion();
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
	public Autenticacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 498);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon("/home/kinder/Documentos/Proyects/KinderBank/img/KinderBank2.png"));
		lblLogo.setBounds(12, 12, 706, 158);
		contentPane.add(lblLogo);
		
		JLabel lblNumeroDeCuenta = new JLabel("Numero de cuenta:");
		lblNumeroDeCuenta.setFont(new Font("Dialog", Font.BOLD, 18));
		lblNumeroDeCuenta.setForeground(Color.WHITE);
		lblNumeroDeCuenta.setBounds(88, 217, 212, 37);
		contentPane.add(lblNumeroDeCuenta);
		
		JLabel lblPin = new JLabel("Pin:");
		lblPin.setForeground(Color.WHITE);
		lblPin.setFont(new Font("Dialog", Font.BOLD, 18));
		lblPin.setBounds(88, 266, 184, 37);
		contentPane.add(lblPin);
		
		textFieldNDCuenta = new JTextField();
		textFieldNDCuenta.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldNDCuenta.setBounds(335, 217, 297, 37);
		contentPane.add(textFieldNDCuenta);
		textFieldNDCuenta.setColumns(10);
		
		textFieldPin = new JTextField();
		textFieldPin.setFont(new Font("Dialog", Font.PLAIN, 14));
		textFieldPin.setColumns(10);
		textFieldPin.setBounds(335, 266, 297, 37);
		contentPane.add(textFieldPin);
		
		JButton btnIniciarSesion = new JButton("Iniciar Sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciarSesion.setBounds(335, 326, 134, 25);
		contentPane.add(btnIniciarSesion);
		
		JButton btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.setBounds(492, 326, 140, 25);
		contentPane.add(btnCrearCuenta);
	}
}
