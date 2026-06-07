package login;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.formdev.flatlaf.FlatLightLaf;

import expedientes.VentanaBusqueda;
import expedientes.VentanaExpedientes;
import expedientes.ventana_calendario;
import modelo.Usuario;

public class VentanaMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
		        	FlatLightLaf.setup();
		           
		            UIManager.put("Button.arc", 15); // Botones redondeados
		            UIManager.put("Component.focusWidth", 1); // Borde de enfoque más fino
		            UIManager.put("TextComponent.arc", 10); // Campos de texto redondeados
		            
		        } catch (Exception e) {
		            System.err.println("Error al aplicar FlatLaf");
		        }
				
				try {
					VentanaMenu frame = new VentanaMenu();
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
	public VentanaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 733, 460);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(236, 244, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Nuevo Expediente");
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaExpedientes expediente=new VentanaExpedientes();
				expediente.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(231, 100, 257, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar Expediente");
		btnNewButton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBusqueda buscarV=new VentanaBusqueda();
				buscarV.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(231, 188, 257, 65);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generar Citas");
		btnNewButton_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventana_calendario citaV=new ventana_calendario();
				citaV.setVisible(true);
				dispose();
				
				
				
			}
		});
		btnNewButton_2.setBounds(231, 276, 257, 65);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("INICIO");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 28));
		lblNewLabel.setBounds(317, 25, 92, 65);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_3 = new JButton("Cerrar Sesión");
		btnNewButton_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 87, 130));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin login= new VentanaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton_3.setBounds(288, 363, 134, 36);
		contentPane.add(btnNewButton_3);

	}
}
