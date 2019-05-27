package ejemplo.interfazcomunicacion;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

public interface ServerComunication {
	@POST
	@Produces("text/plain")
	@Path("enviarinfo")
	public boolean enviarInfoAServer(String info);
	@GET
	@Produces("text/plain")
	@Path("probarcomunicacion")
	public String probarComunicacion();
	
}

