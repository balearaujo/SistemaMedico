package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import javax.swing.SwingConstants;

public class Bienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bienvenida frame = new Bienvenida();
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
	public Bienvenida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(236, 244, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 87, 174));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin login=new VentanaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(243, 190, 226, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setBackground(new Color(0, 87, 174));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSignin signin=new VentanaSignin();
				signin.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(243, 273, 226, 47);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("MediPro");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 48));
		lblNewLabel.setBounds(263, 78, 199, 69);
		contentPane.add(lblNewLabel);
		
		JLabel Imagen = new JLabel("");
		Imagen.setBounds(162, 31, 99, 102);
		Imagen.setOpaque(false);
		try {
			java.net.URL imURL= getClass().getResource("/Imagenes/Logo.png");
			if (imURL != null) {
				ImageIcon icon=new ImageIcon(imURL);
				
				java.awt.Image imgEscalada = icon.getImage().getScaledInstance(
			            Imagen.getWidth(), 
			            Imagen.getHeight(), 
			            java.awt.Image.SCALE_SMOOTH 
			        );
				ImageIcon icoEscalado = new ImageIcon(imgEscalada);
		        Imagen.setIcon(icoEscalado);
			} else {
				System.out.printf("Ruta no encontrada");
			}
			
		} catch (Exception e) {
			System.out.println("Error al cargar la imagen: " + e.getMessage());
		}
		contentPane.add(Imagen);
		
		JLabel lblNewLabel_1 = new JLabel("Sistema de Gestion: Consultorio dental");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(243, 135, 226, 12);
		
		contentPane.add(lblNewLabel_1);

	}
}
