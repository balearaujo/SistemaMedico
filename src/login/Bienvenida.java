package login;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Canvas;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

public class Bienvenida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
        try {
        	FlatLightLaf.setup();
           
            UIManager.put("Button.arc", 15); // Botones redondeados
            UIManager.put("Component.focusWidth", 1); // Borde de enfoque más fino
            UIManager.put("TextComponent.arc", 10); // Campos de texto redondeados
            
        } catch (Exception e) {
            System.err.println("Error al aplicar FlatLaf");
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bienvenida frame = new Bienvenida();
                    frame.setLocationRelativeTo(null); 
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
		setTitle("MediPro-Bienvenida");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 472);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(236, 244, 253));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MediPro",JLabel.CENTER);
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 44));
		lblNewLabel.setForeground(new Color(30, 58, 138));
		lblNewLabel.setBounds(222, 80, 300, 80);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");

		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton.setBounds(243, 190, 250, 50);
		btnNewButton.addActionListener(e -> {
			new VentanaLogin().setVisible(true);
				dispose();
		});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		btnNewButton_1.setBounds(243, 270, 250, 50);
		btnNewButton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(e -> {
			new VentanaSignin().setVisible(true);
				dispose();
		});
		contentPane.add(btnNewButton_1);	
	}
}
