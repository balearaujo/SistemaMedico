package expedientes;
import java.io.*;
import java.util.ArrayList;


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
	public static ArrayList<Cita>leerTodas(){
		File file=new File (RUTA_ARCH_CITAS);
		if(!file.exists()) return new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCH_CITAS))){
			return (ArrayList<Cita>) ois.readObject();
		} catch (Exception e) {
			return new ArrayList<>();
	}
	
}
}
