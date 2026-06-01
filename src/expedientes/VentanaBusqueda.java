package expedientes;

import java.awt.EventQueue;
import javax.swing.table.DefaultTableModel;

import com.formdev.flatlaf.FlatLightLaf;

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
import javax.swing.UIManager;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
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
	private ArrayList<Expedientes> resAct=new ArrayList<>();
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
		setBounds(100, 100, 722, 664);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(248, 248, 248));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(150, 78, 491, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel Imagen = new JLabel("");
		Imagen.setBounds(86, 77, 69, 40);
		Imagen.setOpaque(false);
		try {
			java.net.URL imURL= getClass().getResource("/Imagenes/lupita.png");
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
		
		JLabel lblNewLabel_1 = new JLabel("Buscador");
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setBackground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(150, 47, 108, 20);
		contentPane.add(lblNewLabel_1);
		
		JRadioButton docBtn = new JRadioButton("Doctor");
		docBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		docBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		docBtn.setBackground(new Color(248, 248, 248));
		buttonGroup.add(docBtn);
		docBtn.setBounds(90, 148, 91, 20);
		contentPane.add(docBtn);
		
		JRadioButton PacBtn = new JRadioButton("Paciente");
		PacBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		PacBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		PacBtn.setBackground(new Color(248, 248, 248));
		buttonGroup.add(PacBtn);
		PacBtn.setBounds(90, 185, 91, 20);
		contentPane.add(PacBtn);
		
		JRadioButton AgeBtn = new JRadioButton("Edad");
		AgeBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		AgeBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		AgeBtn.setBackground(new Color(248, 248, 248));
		buttonGroup.add(AgeBtn);
		AgeBtn.setBounds(321, 148, 102, 20);
		contentPane.add(AgeBtn);
		
		JRadioButton SxBtn = new JRadioButton("Sexo");
		SxBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		SxBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		SxBtn.setBackground(new Color(248, 248, 248));
		buttonGroup.add(SxBtn);
		SxBtn.setBounds(321, 185, 102, 20);
		contentPane.add(SxBtn);
		
		JRadioButton PadBtn = new JRadioButton("Padecimiento");
		PadBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		PadBtn.setBackground(new Color(248, 248, 248));
		PadBtn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		buttonGroup.add(PadBtn);
		PadBtn.setBounds(539, 148, 102, 20);
		contentPane.add(PadBtn);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 87, 130));
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<Expedientes>expBusq = ArchivoExpedientes.leerTodos();
				ArrayList<Expedientes>resultados=new ArrayList<>();
				
				for (Expedientes e1: expBusq) {
					boolean encontrado=false;
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
				if (resultados.isEmpty()) {
					JOptionPane.showMessageDialog(null, "No esta bajo este filtro", "No encontrado", 1);
				} else {
					mostrarEnTabla(resultados);
				}
			}
		});
		
		btnNewButton.setBounds(545, 186, 84, 20);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(90, 228, 551, 292);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.addMouseListener(new java.awt.event.MouseAdapter(){
			@Override
			public void mouseClicked (java.awt.event.MouseEvent e) {
				if (e.getClickCount() == 2) {
					int filaSeleccionada=table.getSelectedRow();
					Expedientes ExpSeleccionado=resAct.get(filaSeleccionada);
					
					ExpedienteDetalles ExpedienteDets= new ExpedienteDetalles(ExpSeleccionado);
					ExpedienteDets.setVisible(true);
					dispose();
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 87, 130));
		btnNewButton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu menu= new VentanaMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(318, 545, 123, 33);
		contentPane.add(btnNewButton_1);

	}
	
	public void mostrarEnTabla(ArrayList<Expedientes>resultados) {
		this.resAct = resultados;
		
		String COL[]={"Doctor", "Paciente", "Edad", "Sexo", "Padecimiento"};
		DefaultTableModel modelo= new DefaultTableModel(COL, 0) {
			@Override
	        public boolean isCellEditable(int row, int column) {
	            return false;
	        }
		};
		for (Expedientes e: resultados) {
			Object[] fila= {e.getEstomatologo(), e.getNombre(), e.getEdad(), e.getSexo(), e.getPadecimiento()};
			modelo.addRow(fila);
		}
		table.setModel(modelo);
	}
}
