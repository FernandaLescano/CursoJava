package poo;

class Persona{
	String nombre;
	String email;
	String telefono;
	
	void caminar() {
		System.out.println(nombre + " esta caminando");
	}
	
	void eat() {
		System.out.println(email);
	}
	
	void dormir() {
		System.out.println(nombre + " esta durmiendo");
	}
}

public class Demo {

	public static void main(String[] args) {
		// Instanciamos un objeto
		Persona persona1 = new Persona();
		Persona persona2 = new Persona();
		persona2.nombre = "Ale";
		persona2.dormir();
		persona2.caminar();
		
		// Define algunas propiedades
		persona1.nombre = "Fer";
		persona1.email = "fernandalescano@gmail.com";
		persona1.telefono = "1131635212";
		
		// Abstraccion
		persona1.caminar();
		
		//
		persona1.dormir();
	

	}

}
