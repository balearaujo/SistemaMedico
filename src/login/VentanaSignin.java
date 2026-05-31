package login;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Usuario;
import modelo.archivousuarios;
import modelo.Odontologo;
import modelo.Asistente;


import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;


public class VentanaSignin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;
	private JCheckBox chckbxDoctor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaSignin frame = new VentanaSignin();
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
	public VentanaSignin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 339);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(236, 244, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registar");
		lblNewLabel.setBounds(177, 35, 104, 51);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel.setForeground(new Color(0, 64, 128));
		contentPane.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(161, 109, 152, 22);
		contentPane.add(textPane);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(161, 167, 152, 22);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(59, 114, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(59, 171, 92, 12);
		contentPane.add(lblNewLabel_2);
		
		JCheckBox chckbxDoctor = new JCheckBox("¿Es Odontólogo?");

		chckbxDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		chckbxDoctor.setBackground(new Color(233, 244, 253));
		chckbxDoctor.setBounds(161, 196, 152, 23);
		contentPane.add(chckbxDoctor);

		
		JButton btnNewButton = new JButton("Registrar Usuario");
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario nuevo;
				String user=textPane.getText();
				String pswd= new String (passwordField.getPassword()); 
				
				if (chckbxDoctor.isSelected()) {
					nuevo=new Odontologo(user,pswd);
				}else {
					nuevo=new Asistente(user,pswd);
				}
				archivousuarios.guardarUsuario(nuevo);
				JOptionPane.showMessageDialog(null,"Usuario "+nuevo.getTipodeUsuario()+" guardado", "Nuevo doccc", 3);
				
			}
		});
		btnNewButton.setBounds(257, 238, 152, 22);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ingresar");
		btnNewButton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin login= new VentanaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(59, 238, 89, 23);
		contentPane.add(btnNewButton_1);
		
	
	}
	
}
