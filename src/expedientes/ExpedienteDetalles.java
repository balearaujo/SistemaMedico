package expedientes;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class ExpedienteDetalles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Expedientes expediente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpedienteDetalles frame = new ExpedienteDetalles(null);
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
	public ExpedienteDetalles(Expedientes expSeleccionado) {
		this.expediente= expSeleccionado;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 457, 677);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		contentPane.setLayout(null);
		JTextArea textArea = new JTextArea();
		textArea.setBounds(108, 126, 411, 383);
		contentPane.add(textArea);

		if (expediente!=null) {
			textArea.setText("Nombre: " + expediente.getNombre());
		} else {
			textArea.setText("Este expediente no tiene informacion. ");
		}
		
	}
}
