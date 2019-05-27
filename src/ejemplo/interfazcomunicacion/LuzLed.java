package ejemplo.interfazcomunicacion;

public class LuzLed  implements Comunicacion {

	private boolean luzEncendida;
	private String color;
	private boolean	parpadeo;
	
	
	
	public String crearMensaje() {

		String mensaje="";
		
		if (luzEncendida==true) {
			
			mensaje= mensaje + "\nLa Luz esta encendida";
		
		}
		else {
			
			mensaje= mensaje + "\nLa Luz esta apagada";
			
		}
		
		mensaje=mensaje + "\n el Color es " + color;
		
		if(parpadeo==true)
			
			mensaje=mensaje + "\n La luz esta parpadeando";
		
		else
			
			mensaje=mensaje + "\n La luz  no esta parpadeando";
		
		
		return mensaje;

	}
	
				
	@Override
	public boolean transmitirInfo() {

		if(probarComunicacion() ==true)
			
		{
			System.out.println(crearMensaje());
			return true;
		}
		else
			return false;
	}

	@Override
	public String solicitarInfo() {
		return crearMensaje();
	}

	@Override
	public boolean cambiarServidor(String server) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean probarComunicacion() {
		// TODO Auto-generated method stub
		return true;
	}

	public boolean isLuzEncendida() {
		return luzEncendida;
	}

	public void setLuzEncendida(boolean luzEncendida) {
		this.luzEncendida = luzEncendida;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isParpadeo() {
		return parpadeo;
	}

	public void setParpadeo(boolean parpadeo) {
		this.parpadeo = parpadeo;
	}

	
}
