package ejemplo;

public class PruebaAnimales {

	public static void main(String[] args) {
		
		Animal perro = new Animal("Labrador" , 5);
		Ave aguila = new Ave("Aguila Calva" , 5);
		
		describirAnimal(aguila);
		describirAnimal(perro);
		;		
	
		
	
	}

	public static void describirAnimal(Animal animal) {
		
		System.out.println("especie: " + animal.getEspecie() );
		System.out.println("edad: " + animal.getEdad() );
		animal.avanzar();
		
	}
}
