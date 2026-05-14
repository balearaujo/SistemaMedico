package expedientes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		setBounds(100, 100, 398, 506);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos del Paciente");
		lblNewLabel_1.setBounds(28, 103, 92, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Expediente");
		lblNewLabel.setBounds(160, 20, 50, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(28, 126, 44, 12);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Edad");
		lblNewLabel_3.setBounds(28, 148, 44, 12);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Sexo");
		lblNewLabel_4.setBounds(28, 182, 44, 12);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Peso");
		lblNewLabel_5.setBounds(217, 126, 44, 12);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Altura");
		lblNewLabel_6.setBounds(217, 172, 44, 12);
		contentPane.add(lblNewLabel_6);
		
		nombre = new JTextField();
		nombre.setBounds(76, 126, 96, 18);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		edad = new JTextField();
		edad.setBounds(76, 151, 96, 18);
		contentPane.add(edad);
		edad.setColumns(10);
		
		sexo = new JTextField();
		sexo.setBounds(76, 179, 96, 18);
		contentPane.add(sexo);
		sexo.setColumns(10);
		
		peso = new JTextField();
		peso.setBounds(254, 123, 96, 18);
		contentPane.add(peso);
		peso.setColumns(10);
		
		altura = new JTextField();
		altura.setBounds(254, 169, 96, 18);
		contentPane.add(altura);
		altura.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Informacion Medica");
		lblNewLabel_7.setBounds(28, 231, 111, 12);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("¿Padece de Alergias?");
		lblNewLabel_8.setBounds(28, 253, 111, 12);
		contentPane.add(lblNewLabel_8);
		
		alergias = new JTextField();
		alergias.setBounds(139, 250, 96, 18);
		contentPane.add(alergias);
		alergias.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("¿Padece alguna enfermedad crónica?");
		lblNewLabel_9.setBounds(28, 275, 188, 12);
		contentPane.add(lblNewLabel_9);
		
		enfermedad = new JTextField();
		enfermedad.setBounds(204, 272, 96, 18);
		contentPane.add(enfermedad);
		enfermedad.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("¿Cuál?");
		lblNewLabel_10.setBounds(28, 297, 44, 12);
		contentPane.add(lblNewLabel_10);
		
		cualEnfermedad = new JTextField();
		cualEnfermedad.setBounds(64, 294, 96, 18);
		contentPane.add(cualEnfermedad);
		cualEnfermedad.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Tipo de Sangre");
		lblNewLabel_11.setBounds(28, 319, 111, 12);
		contentPane.add(lblNewLabel_11);
		
		Sangre = new JTextField();
		Sangre.setBounds(107, 316, 96, 18);
		contentPane.add(Sangre);
		Sangre.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Padecimiento");
		lblNewLabel_12.setBounds(28, 341, 76, 12);
		contentPane.add(lblNewLabel_12);
		
		Padecimiento = new JTextField();
		Padecimiento.setBounds(107, 341, 96, 18);
		contentPane.add(Padecimiento);
		Padecimiento.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Información de contacto");
		lblNewLabel_13.setBounds(28, 390, 111, 12);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Domicilio");
		lblNewLabel_14.setBounds(28, 412, 44, 12);
		contentPane.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Telefono");
		lblNewLabel_15.setBounds(28, 437, 44, 12);
		contentPane.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setBounds(268, 20, 44, 12);
		contentPane.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Estomatologo");
		lblNewLabel_17.setBounds(28, 44, 92, 12);
		contentPane.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Fecha de inicio");
		lblNewLabel_18.setBounds(28, 62, 76, 22);
		contentPane.add(lblNewLabel_18);
		
		estomatologo = new JTextField();
		estomatologo.setBounds(107, 43, 96, 18);
		contentPane.add(estomatologo);
		estomatologo.setColumns(10);
		
		fecha = new JTextField();
		fecha.setBounds(107, 66, 96, 18);
		contentPane.add(fecha);
		fecha.setColumns(10);
		
		Domicilio = new JTextField();
		Domicilio.setBounds(76, 409, 96, 18);
		contentPane.add(Domicilio);
		Domicilio.setColumns(10);
		
		Telefono = new JTextField();
		Telefono.setBounds(76, 434, 96, 18);
		contentPane.add(Telefono);
		Telefono.setColumns(10);
		
		JButton btnNewButton = new JButton("Guardar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Estoma=estomatologo.getText();
				String nom=nombre.getText();
				int Ed=Integer.parseInt(edad.getText());
				//char s=((CharSequence) sexo).charAt(sexo.getLength-1);
				int alt=Integer.parseInt(altura.getText());
				int pe=Integer.parseInt(peso.getText());
				String ale=alergias.getText();
				//char enf=
				
			}
		});
		btnNewButton.setBounds(266, 433, 84, 20);
		contentPane.add(btnNewButton);

	}
}
