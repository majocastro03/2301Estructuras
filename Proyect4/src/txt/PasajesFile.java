package txt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

import com.google.gson.Gson;

import Client.Pasaje;
import Server.Contacto;

public class PasajesFile {
	private String fileName;

	public PasajesFile(String fileName) {
		this.fileName = fileName;
	}

	public void addUser(String pasajes) throws IOException {

		FileWriter fileWriter = new FileWriter(this.fileName, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

		bufferedWriter.write(pasajes);
		bufferedWriter.newLine();

		bufferedWriter.close();
	}

	public LinkedList<Pasaje> getUsers() throws IOException {
		FileReader fileReader = new FileReader(this.fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String line;
		LinkedList<Pasaje> Pasajes;
		line = bufferedReader.readLine();
		Pasajes = new Gson().fromJson(line, LinkedList.class);
		bufferedReader.close();
		System.out.println(Pasajes.toString());
		return Pasajes;
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
