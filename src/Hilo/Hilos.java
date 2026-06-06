package Hilo;

import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.text.SimpleDateFormat;


public class Hilos extends Thread{
	private JLabel verhora;
	
	public Hilos (JLabel verhora) {
		this.verhora=verhora;
	}
		@Override
		public void run() {
				SimpleDateFormat formateador = new SimpleDateFormat  ("hh:mm:ss a");
			while (true) {
				String horaActual= formateador.format(new Date());
				verhora.setText(horaActual);
				try {Thread.sleep(100);}
				catch (InterruptedException e) {break;}
			}
		}	
}
