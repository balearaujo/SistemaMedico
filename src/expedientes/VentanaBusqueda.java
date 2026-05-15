package expedientes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import login.VentanaMenu;
import modelo.Usuario;
import modelo.archivousuarios;

import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JEditorPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class VentanaBusqueda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBusqueda frame = new VentanaBusqueda();
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
	public VentanaBusqueda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 673);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(151, 41, 500, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lupita imagen");
		lblNewLabel.setBounds(50, 54, 91, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buscador");
		lblNewLabel_1.setBounds(151, 19, 71, 12);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton docBtn = new JRadioButton("Doctor");
		buttonGroup.add(docBtn);
		docBtn.setBounds(100, 178, 102, 20);
		contentPane.add(docBtn);
		
		JRadioButton PacBtn = new JRadioButton("Paciente");
		buttonGroup.add(PacBtn);
		PacBtn.setBounds(100, 238, 102, 20);
		contentPane.add(PacBtn);
		
		JRadioButton AgeBtn = new JRadioButton("Edad");
		buttonGroup.add(AgeBtn);
		AgeBtn.setBounds(100, 296, 102, 20);
		contentPane.add(AgeBtn);
		
		JRadioButton SxBtn = new JRadioButton("sexo");
		SxBtn.setBounds(434, 200, 102, 20);
		contentPane.add(SxBtn);
		
		JRadioButton PadBtn = new JRadioButton("Padecimiento");
		PadBtn.setBounds(434, 272, 102, 20);
		contentPane.add(PadBtn);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrado=false;
				ArrayList<Expedientes>expBusq = ArchivoExpedientes.leerTodos();
				
				for (Expedientes e1: expBusq) {
					if (docBtn.isSelected()) {
						if (e1.getEstomatologo().equals(textField.getText())) {
							encontrado=true;
						}
					}
					if (PacBtn.isSelected()) {
						if (e1.getNombre().equals(textField.getText())) {
							encontrado=true;
						}
					}
					
					if (AgeBtn.isSelected()) {
						int ag=Integer.parseInt(textField.getText());
						if (e1.getEdad() == ag){
							encontrado=true;
						}
					}
					
					if (SxBtn.isSelected()) {
						char sx = (textField.getText().length() > 0) ? textField.getText().charAt(0) : ' ';
						
						if (e1.getSexo() == sx) {
							encontrado=true;
						}
					}
					
					if (PadBtn.isSelected()) {
						if (e1.getPadecimiento().equals(textField.getText())) {
							encontrado=true;
						}
					}
				}
				if (encontrado) {
					System.out.print("Si encontramos el Expediente (Esta es una prueba) ");
				} else {
					System.out.print("No esta bajo este filtro");
				}
				
			
			}
		});
		
		btnNewButton.setBounds(546, 371, 84, 20);
		contentPane.add(btnNewButton);

	}
}
