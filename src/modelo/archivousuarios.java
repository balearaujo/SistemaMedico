package modelo;
import java.io.*;
import java.util.ArrayList;

public class archivousuarios {
	private static final String RUTA_ARCH="usuarios.dat";
	
	public static void guardarUsuario(Usuario nuevoU) {
		ArrayList<Usuario> lista=leerTodos();
		lista.add(nuevoU);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCH))){
			oos.writeObject(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Usuario> leerTodos(){
		File file = new File (RUTA_ARCH);
		if(!file.exists()) return new ArrayList<>();
			
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCH))){
			return (ArrayList<Usuario>) ois.readObject();
		} catch (Exception e) {
			return new ArrayList<>();
		}
	}
}