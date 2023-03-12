package Client;

import java.io.IOException;
import java.lang.reflect.Type;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.rmi.RemoteException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import org.json.*;

import Server.Contacto;
import Server.Pasajero;
import Server.Ruta;
import Server.Tren;
import Server.Vagon;
import txt.*;
import ListaSimple.*;

public class Main implements JsonDeserializer<LocalDateTime> {

	public static void main(String[] args) throws IOException {
		
		Gson gson = new Gson();

		Vagon vagon = new Vagon(true, null);

		UserFile userFile = new UserFile("Pasajeros.txt");
		ContactoFile contactoFile = new ContactoFile("Contactos.txt");
		PasajesFile pasajesFile = new PasajesFile("Pasajes.txt");
		//userFile.eliminarUser();
		//contactoFile.eliminarUser();
		//pasajesFile.eliminarUser();
		
		Scanner scanner = new Scanner(System.in);
		Scanner nums = new Scanner(System.in);
		// Crear las listas para cada cosita :)
		LinkedList<Pasajero> pasajeros = new LinkedList<Pasajero>();
		LinkedList<Contacto> contactos = new LinkedList<Contacto>();
		LinkedList<Vagon> vagones = new LinkedList<Vagon>();
		LinkedList<Tren> trenes = new LinkedList<Tren>();
		LinkedList<Ruta> rutas = new LinkedList<Ruta>();
		LinkedList<Pasaje> pasajes = new LinkedList<Pasaje>();

		// INICIO DEL PROGRAMA
		scanner.useDelimiter("\n");
		System.out.println("Bienvenido a la maquina expendedora de boletos de tren");
		System.out.println("Por favor realizar el registro para acceder a nuestros servicios\n");
		System.out.println("Ingrese su nombre por favor: ");
		String nombre = scanner.next();

		System.out.println("Ingrese su apellido por favor: ");
		String apellido = scanner.next();
		System.out.println("Escoja por favor su tipo de identificacion");
		System.out.println(
				"(1). Cedula de ciudadania\n(2). Tarjeta de identidad\n(3). Cedula de extranjeria\n(4). Pasaporte");
		int tipoIdentificacion = nums.nextInt();
		String identificacion;
		switch (tipoIdentificacion) {
		case 1: {
			identificacion = "Cedula de ciudadania";
			break;
		}
		case 2: {
			identificacion = "Tarjeta de identidad";
			break;
		}
		case 3: {
			identificacion = "Cedula de extranjeria";
			break;
		}
		case 4: {
			identificacion = "Pasaporte";
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: ");
		}
		System.out.println("Ingrese su identificacion: ");
		long id = nums.nextLong();
		System.out.println("Ingrese su lugar de residencia por favor: ");
		String direccion = scanner.next();
		System.out.println("Ingrese su telefono por favor: ");
		long telefono = nums.nextLong();
		Pasajero pasajero = new Pasajero(nombre, apellido, identificacion, id, direccion, telefono);
		pasajeros.add(pasajero);
		
		try {

			String json = gson.toJson(pasajeros);
			userFile.addUser(json);
			System.out.println("El usuario ha sido agregado correctamente.");
		} catch (IOException e) {
			System.out.println("Error al agregar el usuario: " + e.getMessage());

		}

		// INFORMACIÓN DE CONTACTO
		System.out.println("Ingrese el nombre del contacto por favor: ");
		String nombreContacto = scanner.next();
		System.out.println("Ingrese el apellido del contacto por favor: ");
		String apellidoContacto = scanner.next();
		System.out.println("Ingrese el parentezco con esta persona por favor: ");
		String personaContacto = scanner.next();
		System.out.println("Ingrese el lugar de residencia de la persona por favor: ");
		String direccionContacto = scanner.next();
		System.out.println("Ingrese el telefono por favor: ");
		long telefonoContacto = nums.nextLong();
		Contacto contacto = new Contacto(nombreContacto, apellidoContacto, personaContacto, direccionContacto,
				telefonoContacto);
		contactos.add(contacto);
		try {
			String jsonContc = gson.toJson(contactos);
			contactoFile.addUser(jsonContc);
			System.out.println("El usuario ha sido agregado correctamente.");
		} catch (IOException e) {
			System.out.println("Error al agregar el usuario: " + e.getMessage());
		}

		if (pasajeros.size() <= 30) {
			vagon.addPasajero(pasajero);
		}
		vagones.add(vagon);
		Tren tren1 = new Tren(null, 01);
		Tren tren2 = new Tren(null, 02);
		Tren tren3 = new Tren(null, 03);
		Tren tren4 = new Tren(null, 04);
		Tren tren5 = new Tren(null, 05);
		Tren tren6 = new Tren(null, 06);
		Tren tren7 = new Tren(null, 07);
		Tren tren8 = new Tren(null, 8);

		Ruta ruta1 = new Ruta(tren1, "Bucaramanga", "Bogota", "8:00a.m", "9:00a.m");
		Ruta ruta2 = new Ruta(tren2, "Bucaramanga", "Bogota", "10:00a.m", "11:00a.m");
		Ruta ruta3 = new Ruta(tren3, "Bucaramanga", "Bogota", "2:00p.m", "3:00p.m");
		Ruta ruta4 = new Ruta(tren4, "Bucaramanga", "Bogota", "4:00pm", "5:00pm");
		Ruta ruta5 = new Ruta(tren5, "Bucaramanga", "Barranquilla", "8:00a.m", "9:00a.m");
		Ruta ruta6 = new Ruta(tren6, "Bucaramanga", "Barranquilla", "10:00a.m", "11:00p.m");
		Ruta ruta7 = new Ruta(tren7, "Bucaramanga", "Barranquilla", "2:00p.m", "3:00p.m");
		Ruta ruta8 = new Ruta(tren8, "Bucaramanga", "Barranquilla", "4:00p.m", "5:00p.m");

		System.out.println("Seleccione la ruta deseada: ");
		System.out.println("1. Bucaramanga - Bogotá");
		System.out.println("2. Bucaramanga - Barranquilla");
		int ruta = nums.nextInt();
		int rutaEscogida;
		switch (ruta) {
		case 1: {
			System.out.println("Para esta ruta contamos con: " + "\n1)" + ruta1.toString() + "\n2)" + ruta2.toString()
					+ "\n3)" + ruta3.toString() + "\n4)" + ruta4.toString());
			System.out.println("Ruta Escogida: ");
			rutaEscogida = nums.nextInt();
			switch (rutaEscogida) {
			case 1: {
				if (vagones.size() <= 40) {
					tren1.addVagon(vagon);
				}
				break;
			}
			case 2: {
				if (vagones.size() <= 40) {
					tren2.addVagon(vagon);
				}
				break;
			}
			case 3: {
				if (vagones.size() <= 40) {
					tren3.addVagon(vagon);
				}
				break;
			}
			case 4: {
				if (vagones.size() <= 40) {
					tren4.addVagon(vagon);
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + rutaEscogida);
			}
			break;
		}
		case 2: {
			System.out.println("Para esta ruta contamos con: " + "\n1)" + ruta5.toString() + "\n2)" + ruta6.toString()
					+ "\n3)" + ruta7.toString() + "\n4)" + ruta8.toString());
			System.out.println("Ruta Escogida: ");
			rutaEscogida = nums.nextInt();
			switch (rutaEscogida) {
			case 1: {
				if (vagones.size() <= 40) {
					tren5.addVagon(vagon);
				}
				break;
			}
			case 2: {
				if (vagones.size() <= 40) {
					tren6.addVagon(vagon);
				}
				break;
			}
			case 3: {
				if (vagones.size() <= 40) {
					tren7.addVagon(vagon);
				}
				break;
			}
			case 4: {
				if (vagones.size() <= 40) {
					tren8.addVagon(vagon);
				}
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + rutaEscogida);
			}
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + ruta);
		}

		System.out.println("Ingrese por favor el peso de su carga. Recuerde que debe ser menor a 150kg");
		int carga = nums.nextInt();
		if (carga < 150) {
			System.out.println("Nuestras ofertas: \n");
			System.out.println("(1). Premium: 1'000.000.\n");
			System.out.println("(2) Ejecutivo: $200.000. \n");
			System.out.println("(3) Economico: $75.000. \n");
			System.out.println("Elija la opcion de su preferencia");
			int opcion = nums.nextInt();

			LocalDateTime fecha = LocalDateTime.now();
			DateTimeFormatter isoHora = DateTimeFormatter.ISO_LOCAL_TIME;
			DateTimeFormatter isoFecha = DateTimeFormatter.ISO_LOCAL_DATE;

			switch (opcion) {
			case 1: {

				Pasaje pasaje = new Pasaje(ruta1.getTren().getIdtren(), "Premium", 10000000, carga);
				System.out.println("Su pasaje es: " + pasaje.toString());
				System.out.println(
						"Hora y fecha de compra del pasaje: " + fecha.format(isoHora) + fecha.format(isoFecha));
				pasajes.add(pasaje);
				break;
			}
			case 2: {
				Pasaje pasaje = new Pasaje(ruta2.getTren().getIdtren(), "Ejecutivo", 200000, carga);
				System.out.println("Su pasaje es: " + pasaje.toString());
				System.out.println(
						"Hora y fecha de compra del pasaje: " + fecha.format(isoHora) + fecha.format(isoFecha));
				pasajes.add(pasaje);
				break;
			}
			case 3: {
				Pasaje pasaje = new Pasaje(ruta3.getTren().getIdtren(), "Economico", 75000, carga);
				System.out.println("Su pasaje es: " + pasaje.toString());
				System.out.println(
						"Hora y fecha de compra del pasaje: " + fecha.format(isoHora) + "  " + fecha.format(isoFecha));
				pasajes.add(pasaje);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opcion);
			}
			;
		} else {
			System.out.println("ERROR");
		}
		try {
			String jsonFile = gson.toJson(pasajes);
			pasajesFile.addUser(jsonFile);
			System.out.println("El usuario ha sido agregado correctamente.");
		} catch (IOException e) {
			System.out.println("Error al agregar el usuario: " + e.getMessage());
		}
		userFile.getUsers();
		contactoFile.getUsers();
		pasajesFile.getUsers();
	}

	@Override
	public LocalDateTime deserialize(JsonElement arg0, Type arg1, JsonDeserializationContext arg2)
			throws JsonParseException {
		JsonElement json = null;
		return LocalDateTime.parse(json.getAsString(),
				DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss").withLocale(Locale.ENGLISH));
	}

}
