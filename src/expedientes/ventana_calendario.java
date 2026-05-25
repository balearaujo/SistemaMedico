package expedientes;

import com.toedter.calendar.JCalendar;

import login.VentanaMenu;

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
					
					String[]horarios= {"10:00 AM","11:00 AM", "12:00 PM", "01:00 PM","02:00 PM", "03:00 PM"};
					String horaSelecc= (String) JOptionPane.showInputDialog(null,"Seleccione un horario para el "
					+dia+"/"+mes+"/"+anio,"Horarios", JOptionPane.QUESTION_MESSAGE,null,horarios,horarios[0]);
							
					if (horaSelecc !=null) {
						java.util.ArrayList<Cita> todaslasCitas=ArchivoCitas.leerTodas();
						boolean ocupado=false;
					for(Cita c:todaslasCitas) {
						if(c.getDia()==dia && c.getMes()==mes && c.getAnio()==anio && c.getHora().equals(horaSelecc)){
							ocupado=true;
							break;
						}
					}
					
					if (ocupado) {
						JOptionPane.showMessageDialog(null,"El horario "+horaSelecc+" ya esta ocupado","Error de cita",JOptionPane.WARNING_MESSAGE);
					}else {
						Cita nueva=new Cita(dia,mes,anio, horaSelecc);
						ArchivoCitas.guardarCita(nueva);
					JOptionPane.showMessageDialog(null,"Fecha de cita:"+dia+"/"+mes+"/"+anio+" Hora:" +horaSelecc,"Confirmacion de cita", JOptionPane.INFORMATION_MESSAGE);
				}
					}
			}
		});
		
		panelBoton.add(btnNewButton);
		contentPane.add(panelBoton, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu menu= new VentanaMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		panelBoton.add(btnNewButton_1);
		
		
		
	       
  
	}

}
