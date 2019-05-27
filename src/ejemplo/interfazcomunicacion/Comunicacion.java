package ejemplo.interfazcomunicacion;

public interface Comunicacion {
		
	public boolean transmitirInfo();
	public String solicitarInfo();
	public boolean cambiarServidor(String server);
	public boolean probarComunicacion();

}
