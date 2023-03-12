package txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import com.google.gson.Gson;

import Server.Contacto;
import Server.Pasajero;

public class ContactoFile {
	private String fileName;

	public ContactoFile(String fileName) {
		this.fileName = fileName;
	}

	public void addUser(String contactos) throws IOException {

		FileWriter fileWriter = new FileWriter(this.fileName, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		bufferedWriter.write(contactos);
		bufferedWriter.newLine();

		bufferedWriter.close();
	}

	public LinkedList<Contacto> getUsers() throws IOException {
		FileReader fileReader = new FileReader(this.fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String line;
		LinkedList<Contacto> Contactos;
		line = bufferedReader.readLine();
		Contactos = new Gson().fromJson(line, LinkedList.class);
		bufferedReader.close();
		System.out.println(Contactos.toString());
		return Contactos;
	}

	public void eliminarUser() {
		try {
			FileWriter fileWriter = new FileWriter(this.fileName);
			fileWriter.write("");
			fileWriter.close();
			System.out.println("Todos los datos han sido eliminados del archivo " + this.fileName);
		} catch (IOException e) {
			System.err.println("Ha ocurrido un error al eliminar los datos del archivo " + this.fileName);
			e.printStackTrace();
		}
	}
}
