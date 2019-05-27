package ejemplo.interfazcomunicacion;

import java.net.URI;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

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
		
		
		
		ComunicacionInterna comunicacionInterna = new ComunicacionInterna();
		comunicacionInterna.enviarInfoDispositivos(dispositivosComunicativos);
		
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
			
			enviarInfoAServerProcess(mensajeAEnviar);
			
		}
		
		
	}
	
	
	public  boolean enviarInfoAServerProcess(String info) {
		
		Builder builder =crearInvocador("enviarinfo");
		Response response = builder.post(Entity.entity("", MediaType.TEXT_PLAIN));
		
		if(response.toString().equals("true"))
				return true;
		else 
				return false;
	}
	
	public String probarComunicacionProcess() {
		
		Builder builder =crearInvocador("probarcomunicacion");
		Response response = builder.get();	
		
		return response.toString() ;

	}
	
	public Builder crearInvocador(String finalPath) {
	
		 Client client = ClientBuilder.newClient();
		  String path= "http://localhost:8080/Prueba_WebService/restservices/serviciooyente/" + finalPath;
		  UriBuilder uriBuilder = UriBuilder.fromUri(path);
		  
		  URI urlServicioSaludo = uriBuilder.build();
		  
		  WebTarget serviceObjetivo = client.target(urlServicioSaludo);
		  Builder invocationBuilder = serviceObjetivo.request(MediaType.TEXT_PLAIN);
		  return invocationBuilder;
	}
	
	
}
