package ejemplo.interfazcomunicacion;

public class Cafetera implements Comunicacion {

	private String servidor;
	private int temperaturaCafe;
	private boolean nivelAgua;
	
	
	public boolean transmitirInfo() {
		
		if(probarComunicacion() ==true)
			
		{
			System.out.println(crearMensaje());
			return true;
		}
		else
			return false;
			
	}
	
		
	public String crearMensaje() {

		String mensaje="";
		
		mensaje="La temperatura del cafe es:" + getTemperaturaCafe();
		if (nivelAgua==true) {
			
			mensaje= mensaje + "\nEl nivel del agua esta completo";
		
		}
		else {
			
			mensaje= mensaje + "\nEl nivel del agua esta vacio";
			
		}
		return mensaje;

	}
	
	public String solicitarInfo() {
		
		return crearMensaje();
	}
	
	public boolean cambiarServidor(String server) {
	
		setServidor(server);		
		
		return true;
	}
	
	public boolean probarComunicacion() {
			
		return true;
	}

	public String getServidor() {
		
		return servidor;
	}

	public void setServidor(String nuevoservidor) {
		
		this.servidor = nuevoservidor;
	}

	public int getTemperaturaCafe() {
		return temperaturaCafe;
	}

	public void setTemperaturaCafe(int temperaturaCafe) {
		this.temperaturaCafe = temperaturaCafe;
	}

	public boolean isNivelAgua() {
		return nivelAgua;
	}

	public void setNivelAgua(boolean nivelAgua) {
		this.nivelAgua = nivelAgua;
	}
	
	
}
