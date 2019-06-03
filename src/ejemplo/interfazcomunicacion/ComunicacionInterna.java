package ejemplo.interfazcomunicacion;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import cliente.process.ClienteProcess;

public class ComunicacionInterna {	

	public static void main(String[] argumentos) {
		
		

		
		Cafetera cafeteraA = new Cafetera();
		cafeteraA.setTemperaturaCafe(50);
		cafeteraA.setNivelAgua(true);
		
		Cafetera cafeteraB = new Cafetera();
		cafeteraB.setTemperaturaCafe(100);
		cafeteraB.setNivelAgua(true);
		
		LuzLed ledA = new LuzLed();
		ledA.setLuzEncendida(true);
		ledA.setColor("rojo");
		ledA.setParpadeo(true);
		
		LuzLed ledB = new LuzLed();
		ledB.setLuzEncendida(true);
		ledB.setColor("azul");
		ledB.setParpadeo(false);
		
		Comunicacion[] dispositivosComunicativos = {(Comunicacion)cafeteraA, (Comunicacion)cafeteraB, (Comunicacion)ledA, (Comunicacion)ledB};
		
		ClienteProcess clienteProcess = new ClienteProcess();
		clienteProcess.enviarInfoAServer("Prueba1");
		
		

		
		
	}
	
	
	public static void imprimirInfoDispositivos(Comunicacion[] dispositivosComunicativos) {
		
		for(int i = 0 ; i<=dispositivosComunicativos.length - 1; i++) {
			
			Comunicacion dispositivo = dispositivosComunicativos[i];
			dispositivo.transmitirInfo();
			
		}
		
	}
	
	
	public  void enviarInfoDispositivos(Comunicacion[] dispositivosComunicativos) {
		
		for(int i = 0 ; i<=dispositivosComunicativos.length - 1; i++) {
			
			Comunicacion dispositivo = dispositivosComunicativos[i];
			
			String mensajeAEnviar = dispositivo.solicitarInfo();
			
		//	boolean exitoso= enviarInfoAServerProcess(mensajeAEnviar);
			
//			if(exitoso == true)
//				System.out.println("la informacion se envio");
//		else 
//				System.out.println("la informacion NO  se envio");
			
		}	
	}
}
