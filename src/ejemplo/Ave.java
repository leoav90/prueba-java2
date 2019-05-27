package ejemplo;

public class Ave extends Animal {

	public boolean alasAbiertas;
	public boolean volador;
	
	public Ave() {
	}
	
	public Ave(String especie,int edad) {
		super(especie, edad);
		alasAbiertas=false;
		volador=true;
	}
	
	public Ave(String especie,int edad,boolean alasAbiertas,boolean volador) {
		super(especie, edad);
		alasAbiertas=false;
		volador=true;
	}
	
	public void volar() {
		alasAbiertas=true;
		System.out.println("volando..");
	}
	
	/**
	 * @return the alasAbiertas
	 */
	public boolean isAlasAbiertas() {
		return alasAbiertas;
	}
	
	/**
	 * @param alasAbiertas the alasAbiertas to set
	 */
	public void setAlasAbiertas(boolean alasAbiertas) {
		this.alasAbiertas = alasAbiertas;
	}
	
	public void aterrizar() {
		alasAbiertas=false;
		System.out.println("aterrizando..");
	}
	
	public void avanzar() {
		
		this.setVelocidad(5);
		System.out.println("caminando a 5 KM/h..");
	}
}
