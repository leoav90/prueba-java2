package ejemplo.interfazcomunicacion;


import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface ServerComunication {
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.TEXT_PLAIN)
	@Path("enviarinfo")
	public Response enviarInfoAServer(@QueryParam("info") String info);
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("probarcomunicacion")
	public Response probarComunicacion();
	
}
