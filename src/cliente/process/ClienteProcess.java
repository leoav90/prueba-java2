package cliente.process;

import java.net.URI;
import java.security.KeyStore;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Link;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import ejemplo.interfazcomunicacion.ServerComunication;

public class ClienteProcess  implements ServerComunication {
	
	 Client client; 
	 WebTarget serviceObjetivo;
	 
	public  ClienteProcess() {
		
		client  = ClientBuilder.newClient();
		serviceObjetivo = client.target("http://localhost:8080/Prueba_WebService/restservices/serviciooyente");
		
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("enviarinfo")
	public  Response enviarInfoAServer(@QueryParam("info") String info) {
		
		Builder builder = serviceObjetivo.path("enviarinfo").queryParam("info",info).request(MediaType.TEXT_PLAIN);
		Response response = builder.post(Entity.entity(null, MediaType.TEXT_PLAIN));
		
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("probarcomunicacion")
	public Response probarComunicacion() {
		
		Builder builder =serviceObjetivo.path("probarcomunicacion").request(MediaType.TEXT_PLAIN);
		Response response = builder.get();	
		
		return response ;

	}
		
}