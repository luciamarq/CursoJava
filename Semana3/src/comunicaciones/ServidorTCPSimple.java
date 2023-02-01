package comunicaciones;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class ServidorTCPSimple {

	public static final String saludo = "Servidor activo para escuchar";
	public static final int TIMEOUT = 10000;
	public static final int PUERTO = 6000;
	
	private static ServerSocket serverSocket;
	
	public static void main(String[] args) throws IOException {
		
		/*
		 * Abrimos el servidor y establecemos el tiempo de espera:
		 */
		serverSocket = new ServerSocket(PUERTO);
		serverSocket.setSoTimeout(TIMEOUT);
		
		/*
		 * Si no se conecta nadie en 10 segundos, seguiremos esperando
		 * ademas de tratar de capturar los Time Exceptions que puedan haber 
		 * durante el lanzamiento del ServerSocket.
		 */
		
		
		/*
		 * Cuando se acepta la conexion se ejecutan todas las 
		 * instrucciones del bucle while.
		 */
		while(true) {
			
			try {
				
				System.out.println(saludo + serverSocket.getLocalPort() + "...");
				Socket servidor = serverSocket.accept();
				System.out.println("Conexion desde " + servidor.getRemoteSocketAddress());
				
				DataInputStream in = new DataInputStream(servidor.getInputStream()); //Recogemos los datos de la entrada para usarlo en lectura/escritura:
				System.out.println(in.readUTF());
				
				DataOutputStream out = new DataOutputStream(servidor.getOutputStream());
				out.writeUTF("Gracias por conectarte a " + servidor.getLocalSocketAddress() + "\nAdios!! :)");
				
				servidor.close(); //Cerramos el servidor
				break;
				
			}catch(SocketTimeoutException e) {
				System.out.println("Socket time out!");
			}
			
			catch(IOException s) {
				s.printStackTrace();
				break;
			}
	
		}
		
	}

}
