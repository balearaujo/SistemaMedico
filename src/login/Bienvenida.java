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
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Log-In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaLogin login=new VentanaLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(273, 191, 174, 47);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign-In");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaSignin signin=new VentanaSignin();
				signin.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(273, 285, 174, 47);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("MediPro");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 36));
		lblNewLabel.setBounds(279, 56, 168, 111);
		contentPane.add(lblNewLabel);

	}

}
