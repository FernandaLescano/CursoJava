package basico;

public class Clima {
	public static void main(String[] args) {
		//Sugerencia de que ponerse segun el clima
		int temperatura = 45;
		String sol = "nublado";
		
		if (temperatura > 80) {
			System.out.println("Pantalones cortos y remera liviana");
		}
		else if(temperatura>60 && sol == "soleado") {
			System.out.println("Un poco fresco, tal vez use una caminsa manga larga y jeans");
			System.out.println("Llevar algo para protegerse del sol");
		}
		else if(temperatura > 50 || sol == "nublado") {
			System.out.println("Usar ropa un poco mas abrigada");
		}
		else {
			System.out.println("Mucho frio, abrigarse");
		}
		System.out.println("El programa termino");
	}
}
