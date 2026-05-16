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
import javax.swing.border.EmptyBorder;

import expedientes.VentanaBusqueda;
import expedientes.VentanaExpedientes;

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
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaExpedientes expediente=new VentanaExpedientes();
				expediente.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(232, 122, 257, 65);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Buscar Expediente");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBusqueda buscarV=new VentanaBusqueda();
				buscarV.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(232, 210, 257, 65);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Generar Citas");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(232, 298, 257, 65);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("INICIO");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(306, 51, 126, 65);
		contentPane.add(lblNewLabel);

	}
}
