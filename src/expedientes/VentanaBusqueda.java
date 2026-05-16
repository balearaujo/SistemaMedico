package expedientes;

import java.awt.EventQueue;
import javax.swing.table.DefaultTableModel;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Font;

public class VentanaBusqueda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTable table;

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
		contentPane.setBackground(new Color(248, 248, 248));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(150, 78, 491, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Lupita imagen");
		lblNewLabel.setBounds(49, 77, 91, 12);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Buscador");
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setBackground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(150, 47, 108, 20);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton docBtn = new JRadioButton("Doctor");
		docBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		docBtn.setBackground(new Color(248, 248, 248));
		buttonGroup.add(docBtn);
		docBtn.setBounds(150, 148, 102, 20);
		contentPane.add(docBtn);
		
		JRadioButton PacBtn = new JRadioButton("Paciente");
		PacBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PacBtn.setBackground(new Color(248, 248, 248));
		buttonGroup.add(PacBtn);
		PacBtn.setBounds(150, 185, 102, 20);
		contentPane.add(PacBtn);
		
		JRadioButton AgeBtn = new JRadioButton("Edad");
		AgeBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		AgeBtn.setBackground(new Color(248, 248, 248));
		buttonGroup.add(AgeBtn);
		AgeBtn.setBounds(249, 148, 102, 20);
		contentPane.add(AgeBtn);
		
		JRadioButton SxBtn = new JRadioButton("sexo");
		SxBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SxBtn.setBackground(new Color(248, 248, 248));
		SxBtn.setBounds(249, 185, 102, 20);
		contentPane.add(SxBtn);
		
		JRadioButton PadBtn = new JRadioButton("Padecimiento");
		PadBtn.setBackground(new Color(248, 248, 248));
		PadBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PadBtn.setBounds(353, 148, 102, 20);
		contentPane.add(PadBtn);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean encontrado=false;
				ArrayList<Expedientes>expBusq = ArchivoExpedientes.leerTodos();
				ArrayList<Expedientes>resultados=new ArrayList<>();
				
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
					
					if (encontrado) {
						System.out.print("Si encontramos el Expediente (Esta es una prueba) ");
						resultados.add(e1);
					} 
				}
				if (!encontrado) {
					JOptionPane.showMessageDialog(null, "No esta bajo este filtro", "No encontrado", 1);
				} else {
					mostrarEnTabla(resultados);
				}
			}
		});
		
		btnNewButton.setBounds(557, 249, 84, 20);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(94, 280, 551, 321);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

	}
	
	public void mostrarEnTabla(ArrayList<Expedientes>resultados) {
		String COL[]={"Doctor", "Paciente", "Edad", "Sexo", "Padecimiento"};
		DefaultTableModel modelo= new DefaultTableModel(COL, 0);
		
		for (Expedientes e: resultados) {
			Object[] fila= {e.getEstomatologo(), e.getNombre(), e.getEdad(), e.getSexo(), e.getPadecimiento()};
			modelo.addRow(fila);
		}
		table.setModel(modelo);
	}
}
