package comunicaciones;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClienteTCPSimple {
	public static final int PUERTO = 6000;
	public static final String DIRECCION = "localhost";

	public static void main(String[] args) throws IOException {
		
		/*
		 * No conectamos al servidor para enviar un 
		 * mensaje y recibir la respuesta:
		 */
		
		System.out.println("Conectando a " + DIRECCION + " en el puerto " + PUERTO);
		Socket cliente = new Socket (DIRECCION, PUERTO);
		
		/*
		 * Conseguimos el DataOutput e imprimimos el mensaje en el:
		 */
		System.out.println("Ya conectado a " + cliente.getRemoteSocketAddress());
		OutputStream outToServer = cliente.getOutputStream();
		DataOutputStream out = new DataOutputStream(outToServer);
		out.writeUTF("SALUDOS DESDE... " + cliente.getLocalSocketAddress());
		
		
		/*
		 * Conseguimos los datos de entrada para recibir el mensaje del servidor que 
		 * leeremos e imprimiremos:
		 */
		
		InputStream inFromServer = cliente.getInputStream();
		DataInputStream in = new DataInputStream(inFromServer);
		System.out.println("El servidor me ha contestado " + in.readUTF());
		
		/*
		 * Ahora si, cerramos la conexion con el cliente:
		 * 
		 */
		
			cliente.close();
	}

}
