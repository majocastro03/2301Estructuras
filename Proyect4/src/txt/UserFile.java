package txt;


import java.io.*;
import com.google.gson.*;
import ListaSimple.*;

import Server.Pasajero;

public class UserFile {
        private String fileName;

    public UserFile(String fileName) {
        this.fileName = fileName;
    }

    public void addUser(String pasajeros) throws IOException {

            FileWriter fileWriter = new FileWriter(this.fileName, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(pasajeros);
            bufferedWriter.newLine();

            bufferedWriter.close();
        }

    public LinkedList<Pasajero> getUsers() throws IOException {
        FileReader fileReader = new FileReader(this.fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line;
        LinkedList<Pasajero> Pasajeros;

       /* while ((line = bufferedReader.readLine()) != null) {
            String[] parts = line.split(",");
            String nombre = parts[0];
            String apellido = parts[1];
            String direccion = parts[2];

         //   client.Client user = new client.Client(nombre, apellido, direccion);
         //   users.add(user);

            String row = String.format("| %-8s | %-10s | %-20s   | ", nombre, apellido, direccion);
            System.out.println(row);
        }
*/		//Lee solo la primera linea
        line = bufferedReader.readLine();
        
        Pasajeros = new Gson().fromJson(line, LinkedList.class);
        bufferedReader.close();
        //Object o = new JSONParser().parse(new FileReader(File.json));

        //JSONObject j = (JSONObject) o;
        
        return Pasajeros;
    }
    public  void eliminarUser(){
        try {
            FileWriter fileWriter = new FileWriter(this.fileName);
            fileWriter.write(""); // escribir una cadena vacía para eliminar todos los datos
            fileWriter.close();
            System.out.println("Todos los datos han sido eliminados del archivo " + this.fileName);
        } catch (IOException e) {
            System.err.println("Ha ocurrido un error al eliminar los datos del archivo " + this.fileName);
            e.printStackTrace();
        }
    }

}
