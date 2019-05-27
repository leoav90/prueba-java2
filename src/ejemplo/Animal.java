package ejemplo;

public class Animal {
	
	private String especie;//Attributes
	private int edad;//Attributes
	private int patas;//Attributes
	private boolean saciado;
	private boolean	dormido;
	private String tipoespecie;
	private double velocidad;
	
	//constructor vacio
	public Animal() {
	}
	
	public Animal(String especie,int edad) {
		this.especie=especie;
		this.edad=edad;
	}
    
	public String getEspecie() {
        return especie;
    }
	
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
	public int getEdad() {
        return edad;
    }
	
    public void setEdad(int edad) {
        this.edad = edad;
    }

	/**
	 * @return the patas
	 */
	public int getPatas() {
		return patas;
	}

	/**
	 * @param patas the patas to set
	 */
	public void setPatas(int patas) {
		this.patas = patas;
	}

	/**
	 * @return the saciado
	 */
	public boolean isSaciado() {
		return saciado;
	}

	/**
	 * @param saciado the saciado to set
	 */
	public void setSaciado(boolean saciado) {
		this.saciado = saciado;
	}

	/**
	 * @return the tipoespecie
	 */
	public String getTipoespecie() {
		return tipoespecie;
	}

	/**
	 * @param tipoespecie the tipoespecie to set
	 */
	public void setTipoespecie(String tipoespecie) {
		this.tipoespecie = tipoespecie;
	}

	/**
	 * @return the dormido
	 */
	public boolean isDormido() {
		return dormido;
	}

	/**
	 * @param dormido the dormido to set
	 */
	public void setDormido(boolean dormido) {
		this.dormido = dormido;
	}
	
	/**
	 * @return the velocidad
	 */
	public double getVelocidad() {
		return velocidad;
	}

	/**
	 * @param velocidad the velocidad to set
	 */
	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}

	public void comer() {
		saciado=true;
		System.out.println("comiendo..");
	}
	
	public void avanzar() {
		velocidad=10;
		System.out.println("caminando a 10km/h..");
	}
	
	public void parar() {
		velocidad=0;
		System.out.println("detenido..");
	}
	
	public void despertar() {
		dormido=false;
		System.out.println("despierto..");
	}
	
	public void dormir() {
		dormido=true;
		System.out.println("durmiendo..");
	}
	
}

