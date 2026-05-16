package expedientes;

import com.toedter.calendar.JCalendar;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ventana_calendario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JCalendar calendario;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana_calendario frame = new ventana_calendario();
					frame.setVisible(true); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ventana_calendario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 718, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new BorderLayout(0,10));
		
		calendario= new JCalendar();
		contentPane.add(calendario, BorderLayout.CENTER);
		
		JPanel panelBoton=new JPanel();
		
		JButton btnNewButton = new JButton("Confirmar cita");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					int dia=calendario.getDayChooser().getDay();
					int mes=calendario.getMonthChooser().getMonth()+1;
					int anio=calendario.getYearChooser().getYear();
					
					java.util.ArrayList<Cita> todaslasCitas=ArchivoCitas.leerTodas();
					boolean ocupado=false;
					for(Cita c:todaslasCitas) {
						if(c.getDia()==dia && c.getMes()==mes && c.getAnio()==anio) {
							ocupado=true;
						}
					}
					
					if (ocupado) {
						JOptionPane.showMessageDialog(null,"Ya tiene una cita para este dia","Error de cita",JOptionPane.WARNING_MESSAGE);
					}else {
						Cita nueva=new Cita(dia,mes,anio);
					
					ArchivoCitas.guardarCita(nueva);
					JOptionPane.showMessageDialog(null,"Fecha de cita:"+dia+"/"+mes+"/"+anio,"Confirmación de cita", JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		
		panelBoton.add(btnNewButton);
		contentPane.add(panelBoton, BorderLayout.SOUTH);
		
		
		
	       
  
	}

}
