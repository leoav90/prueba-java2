package cliente;

import java.io.IOException;
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

public class Cliente {
	
	 public static void main(String[] args) throws  IOException {
	
		 Client client = ClientBuilder.newClient();
		  
		  UriBuilder uriBuilder = UriBuilder.fromUri("http://localhost:8080/Prueba_WebService/restservices/saludo");
		  URI urlServicioSaludo = uriBuilder.build();
		  
		  WebTarget serviceObjetivo = client.target(urlServicioSaludo);
		  
		  Builder invocationBuilder = serviceObjetivo.request(MediaType.TEXT_PLAIN);
		  
		  String response = invocationBuilder.get(String.class);
		  
		  
		  System.out.println(response);
		 
	 }
}