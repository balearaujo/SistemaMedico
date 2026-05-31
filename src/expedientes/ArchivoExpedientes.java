package expedientes;
import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import modelo.Usuario;

public class ArchivoExpedientes {
private static final String RUTA_ARCH_EX="expedientes.dat";
	
	public static void guardarExpediente(Expedientes nuevoEx) {
		ArrayList<Expedientes> lista=leerTodos();
		lista.add(nuevoEx);
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(RUTA_ARCH_EX))){
			oos.writeObject(lista);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static ArrayList<Expedientes> leerTodos(){
		File file = new File (RUTA_ARCH_EX);
		if(!file.exists()) return new ArrayList<>();
			
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(RUTA_ARCH_EX))){
			return (ArrayList<Expedientes>) ois.readObject();
		} catch (Exception e) {
			return new ArrayList<>();
		}
	}
}