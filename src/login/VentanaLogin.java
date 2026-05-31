package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import modelo.Usuario;
import modelo.archivousuarios;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
public class VentanaLogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField contrasenia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaLogin frame = new VentanaLogin();
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
	public VentanaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 465, 339);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(236, 244, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea nombre = new JTextArea();
		nombre.setBounds(161, 109, 152, 22);
		contentPane.add(nombre);
		
		contrasenia = new JPasswordField();
		contrasenia.setBounds(161, 167, 152, 22);
		contentPane.add(contrasenia);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(59, 114, 44, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(59, 171, 92, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar");
		lblNewLabel_2.setForeground(new Color(0, 64, 128));
		lblNewLabel_2.setFont(new Font("SansSerif", Font.BOLD, 26));
		lblNewLabel_2.setBounds(180, 35, 109, 51);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Enviar");
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Usuario>usuarios = archivousuarios.leerTodos();
				
				Usuario usuarioEncontrado=null;
				for (Usuario u: usuarios) {
					if (u.getUser().equals(nombre.getText())&& u.getPswd().equals(new String(contrasenia.getPassword()))) {
						usuarioEncontrado=u;
						break;
					}
				}
				if (usuarioEncontrado !=null) {
					String msj = "Bienvenid@ "+usuarioEncontrado.getUser()+ "\nEntrando como: "+usuarioEncontrado.getTipodeUsuario();
					JOptionPane.showMessageDialog(null, msj, "LogIn", 1);
					VentanaMenu menu=new VentanaMenu();
					menu.setVisible(true);
					dispose();
				} else {
					JOptionPane.showMessageDialog(null, "Aun no te registras", "LogIn", 1);
				}
			}
		});
		btnNewButton.setBounds(301, 240, 92, 22);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrar");
		btnNewButton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSignin registro= new VentanaSignin();
				registro.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(62, 240, 89, 23);
		contentPane.add(btnNewButton_1);

	}
}
