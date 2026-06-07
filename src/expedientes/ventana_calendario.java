package expedientes;

import com.toedter.calendar.JCalendar;

import Hilo.Hilos;
import login.VentanaMenu;
import modelo.Usuario;
import modelo.usEstatico;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
		Date DatediaActual=new Date();
		
		calendario.setMinSelectableDate(DatediaActual);
		
		
		contentPane.add(calendario, BorderLayout.CENTER);
		
		JPanel panelBoton=new JPanel();
		
		JButton btnNewButton = new JButton("Confirmar fecha");
		btnNewButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton.putClientProperty("JButton.buttonType","roundRect");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Usuario usuarioAct=usEstatico.getUsuarioLogeado();
					if (usuarioAct!=null && usuarioAct.getTipodeUsuario().equals("Doctor")) {
						JOptionPane.showMessageDialog(null, "Solo el rol de Asistente puede generar citas");
						VentanaMenu menu= new VentanaMenu();
						menu.setVisible(true);
						dispose();
					} else {
					
					int diaSel=calendario.getDayChooser().getDay();
					int mesSel=calendario.getMonthChooser().getMonth()+1;
					int anioSel=calendario.getYearChooser().getYear();
				
					java.util.Calendar ahora= java.util.Calendar.getInstance();
					int dia=ahora.get(java.util.Calendar.DAY_OF_MONTH);
					int mes=ahora.get(java.util.Calendar.MONTH)+1;
					int anio= ahora.get(java.util.Calendar.YEAR);
					int horaActual=ahora.get(java.util.Calendar.HOUR_OF_DAY);
					
					String[]horarios= {"10:00 AM","11:00 AM", "12:00 PM", "01:00 PM","02:00 PM", "03:00 PM"};
					String horaSelecc= (String) JOptionPane.showInputDialog(null,"Seleccione un horario para el "
					+diaSel+"/"+mesSel+"/"+anioSel,"Horarios", JOptionPane.QUESTION_MESSAGE,null,horarios,horarios[0]);
							
					
					if (horaSelecc != null) {
						int horaH=Integer.parseInt(horaSelecc.split(":")[0]);
							if(horaSelecc.contains("PM") && horaH !=12)  {
								horaH +=12;
						}	else if(horaSelecc.contains("AM") && horaH ==12){
							horaH =0;
							
						}
							
						if (anioSel ==anio && mesSel ==mes && diaSel == dia ) {
							if (horaH<= horaActual) {
								JOptionPane.showMessageDialog(null,"No se puede elegir este horario","Horario inválido",JOptionPane.WARNING_MESSAGE);
								return;
							}
						}
						
						java.util.ArrayList<Cita> todaslasCitas=ArchivoCitas.leerTodas();
						boolean ocupado=false;
						if (todaslasCitas !=null) {
						for(Cita c:todaslasCitas) {
							if(c.getDia()==diaSel && c.getMes()==mesSel && c.getAnio()==anioSel && c.getHora().equals(horaSelecc)){
								ocupado=true;
								break;
							}
						}
					}
					
					if (ocupado) {
						JOptionPane.showMessageDialog(null,"El horario "+horaSelecc+" ya esta ocupado","Error de cita",JOptionPane.WARNING_MESSAGE);
					}else {
						Cita nueva=new Cita(diaSel,mesSel,anioSel, horaSelecc);
						ArchivoCitas.guardarCita(nueva);
						ArchivoCitas.generarTicket(nueva);
					JOptionPane.showMessageDialog(null,"Fecha de cita:"+diaSel +"/"+mesSel+"/"+anioSel +"\n\n Hora:" +horaSelecc+"\n\n¡Ticket generado!","Confirmacion de cita", JOptionPane.INFORMATION_MESSAGE);
				}
					}
					}
			}
		});
		
		panelBoton.add(btnNewButton);
		contentPane.add(panelBoton, BorderLayout.SOUTH);
		
		JButton btnNewButton_1 = new JButton("Regresar");
		btnNewButton_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu menu= new VentanaMenu();
				menu.setVisible(true);
				dispose();
			}
		});
		panelBoton.add(btnNewButton_1);
		
		JLabel lblreloj = new JLabel("Reloj");
		panelBoton.add(lblreloj);
		Hilos hiloReloj=new Hilos(lblreloj);
		hiloReloj.start();
	}

}
