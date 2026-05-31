package expedientes;
import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.VentanaMenu;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JScrollPane;

public class VentanaExpedientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField nombre;
	private JTextField edad;
	private JTextField sexo;
	private JTextField peso;
	private JTextField altura;
	private JTextField alergias;
	private JTextField enfermedad;
	private JTextField cualEnfermedad;
	private JTextField Sangre;
	private JTextField Padecimiento;
	private JTextField estomatologo;
	private JTextField fecha;
	private JTextField Domicilio;
	private JTextField Telefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaExpedientes frame = new VentanaExpedientes();
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
	public VentanaExpedientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 677);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 248));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del Paciente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setBounds(27, 156, 188, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Expediente");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setBackground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(145, 20, 160, 53);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(27, 186, 76, 12);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(27, 219, 44, 12);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(27, 252, 44, 12);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(235, 223, 33, 12);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Altura");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(235, 252, 33, 12);
		contentPane.add(lblNewLabel_6);
		
		nombre = new JTextField();
		nombre.setBounds(75, 186, 322, 18);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		edad = new JTextField();
		edad.setBounds(75, 221, 123, 18);
		contentPane.add(edad);
		edad.setColumns(10);
		
		sexo = new JTextField();
		sexo.setBounds(73, 250, 125, 18);
		contentPane.add(sexo);
		sexo.setColumns(10);
		
		peso = new JTextField();
		peso.setBounds(272, 220, 125, 18);
		contentPane.add(peso);
		peso.setColumns(10);
		
		altura = new JTextField();
		altura.setBounds(272, 250, 125, 18);
		contentPane.add(altura);
		altura.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Informacion Medica");
		lblNewLabel_7.setForeground(new Color(0, 64, 128));
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(27, 290, 158, 17);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("¿Padece de Alergias?");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(27, 317, 132, 18);
		contentPane.add(lblNewLabel_8);
		
		alergias = new JTextField();
		alergias.setBounds(249, 317, 148, 18);
		contentPane.add(alergias);
		alergias.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("¿Padece alguna enfermedad crónica?");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(27, 338, 216, 26);
		contentPane.add(lblNewLabel_9);
		
		enfermedad = new JTextField();
		enfermedad.setBounds(249, 343, 148, 18);
		contentPane.add(enfermedad);
		enfermedad.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Indique su enfermedad");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(27, 372, 171, 12);
		contentPane.add(lblNewLabel_10);
		
		cualEnfermedad = new JTextField();
		cualEnfermedad.setBounds(249, 372, 148, 18);
		contentPane.add(cualEnfermedad);
		cualEnfermedad.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Tipo de Sangre");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(27, 403, 111, 12);
		contentPane.add(lblNewLabel_11);
		
		Sangre = new JTextField();
		Sangre.setBounds(249, 401, 148, 18);
		contentPane.add(Sangre);
		Sangre.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Padecimiento");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(27, 430, 92, 12);
		contentPane.add(lblNewLabel_12);
		
		Padecimiento = new JTextField();
		Padecimiento.setBounds(249, 428, 148, 18);
		contentPane.add(Padecimiento);
		Padecimiento.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Información de contacto");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_13.setForeground(new Color(0, 64, 128));
		lblNewLabel_13.setBounds(27, 472, 289, 19);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Domicilio");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_14.setBounds(27, 500, 76, 12);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Teléfono");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_15.setBounds(27, 528, 76, 12);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBounds(268, 20, 44, 12);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Estomatologo");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_17.setBounds(27, 86, 92, 17);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Fecha de\r\n inicio");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_18.setBounds(27, 113, 111, 19);
		contentPane.add(lblNewLabel_18);
		
		estomatologo = new JTextField();
		estomatologo.setBounds(119, 85, 278, 18);
		contentPane.add(estomatologo);
		estomatologo.setColumns(10);
		
		fecha = new JTextField();
		fecha.setBounds(119, 113, 278, 18);
		contentPane.add(fecha);
		fecha.setColumns(10);
		
		Domicilio = new JTextField();
		Domicilio.setBounds(119, 498, 278, 18);
		contentPane.add(Domicilio);
		Domicilio.setColumns(10);
		
		Telefono = new JTextField();
		Telefono.setBounds(119, 526, 278, 18);
		contentPane.add(Telefono);
		Telefono.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				String estoma = estomatologo.getText();
	            String nom = nombre.getText();
	            String ale = alergias.getText();
	            String cualEnf = cualEnfermedad.getText();
	            String san = Sangre.getText();
	            String pad = Padecimiento.getText();
	            String fech = fecha.getText();
	            String dom = Domicilio.getText();
	            String tel = Telefono.getText();
	            
	            
	            int ed = Integer.parseInt(edad.getText());
	            int alt = Integer.parseInt(altura.getText());
	            int pe = Integer.parseInt(peso.getText());
	            
	            char sx = (sexo.getText().length() > 0) ? sexo.getText().charAt(0) : ' ';
	            char enf = (enfermedad.getText().length() > 0) ? enfermedad.getText().charAt(0) : ' ';
	            
	            Expedientes nuevoEX= new Expedientes(estoma, nom, ed, sx,  alt, pe, ale,
	        			enf, cualEnf, san, pad, fech, dom, tel);
	            
	            ArchivoExpedientes.guardarExpediente(nuevoEX);
	            JOptionPane.showMessageDialog(null, "Guardado", "Guardar", 2);;
				} catch (NumberFormatException Ex) {
	            	JOptionPane.showMessageDialog(null, "Ingresa un numero correcto para edad, altura y peso", "Numeros", 1);
	            }
			}
			
		
		});
		btnNewButton.setBounds(184, 589, 84, 20);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Leer expediente");
		btnNewButton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Expedientes> expPrueba=ArchivoExpedientes.leerTodos();
				for (Expedientes u: expPrueba) {
					System.out.println(u);
				}
			}
		});
		btnNewButton_1.setBounds(27, 589, 124, 20);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Regresar");
		btnNewButton_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu menu= new VentanaMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnNewButton_2.setBounds(308, 588, 89, 23);
		contentPane.add(btnNewButton_2);

		
		
	}
}
