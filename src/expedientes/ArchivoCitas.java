package expedientes;
import java.io.*;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;


public class ArchivoCitas {
	private static final String RUTA_ARCH_CITAS="citas.dat";
	
	public static void guardarCita(Cita nuevaCita) {
		ArrayList<Cita> lista= leerTodas();
		lista.add(nuevaCita);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCH_CITAS))){
			oos.writeObject(lista);
			} 
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	@SuppressWarnings ("Unchecked")
	public static ArrayList<Cita>leerTodas(){
		File file=new File (RUTA_ARCH_CITAS);
		if(!file.exists()||file.length() ==0) {
			return new ArrayList<>();
		}
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCH_CITAS))){
			return (ArrayList<Cita>) ois.readObject();
		} catch (Exception e) {
			return new ArrayList<>();
	}
}

	public static void generarTicket(Cita cita) {
		String horaLimpia= cita.getHora().replace(":","-").replace(" ","-");
		String nombreArchivo= "Ticket_"+cita.getDia()+"_"+cita.getMes()+"_"+horaLimpia+".txt";
	
	try (PrintWriter writer = new PrintWriter(new FileWriter (nombreArchivo))){
		writer.println("***********************************");
		writer.println("              MEDIPRO              ");
		writer.println("          TICKET DE CITA           ");
		writer.println("***********************************");
		writer.println("Fecha: "+cita.getDia()+"/"+cita.getMes()+"/"+cita.getAnio());
		writer.println("Hora: "+cita.getHora());
		writer.println("***********************************");
		writer.println(" Favor de llegar 10 minutos antes. ");
		writer.println("Gracias por agendar con nosotros :)");
		writer.println("***********************************");
		System.out.println("Ticket guardado"+nombreArchivo);
		if (java.awt.Desktop.isDesktopSupported()) {
			java.awt.Desktop.getDesktop().open(new java.io.File (nombreArchivo));
		}
		} catch (IOException e) {
		e.printStackTrace();
		}
	}
	
}




