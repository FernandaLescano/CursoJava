package basico;

public class Ciudades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declarar y definir un array
		String[] ciudades = {"New York", "San Francisco","Miami","Dallas"};
		System.out.println(ciudades[0]);
		System.out.println(ciudades[1]);
		System.out.println(ciudades[2]);
		System.out.println(ciudades[3]);
		
		
		//Declarar array
		String[] paises;
		
		//Declarar matriz
		paises = new String[3];
		paises[0] = "Estados Unidos";
		paises[1] = "Canada";
		paises[2] = "Reino unido";
		System.out.println(paises[2]);
		System.out.println("***********************");
		
		//Declarar un array
		String[] estados = new String[5];
		estados[0] = "California";
		estados[1] = "Ohio";
		estados[2] = "New Jersey";
		estados[3] = "Texas";
		estados[4] = "Utah";
		int i = 0;
		// doo loop ejecuta la entrada, rompe el bucle y luego prueba la condicion 
		do {
			System.out.println("PAIS:"+estados[i]);
			i++;
		}while(i<5);
		System.out.println("***********************");
		
		//While loop prueba primero la condicion y luego ingresa
		int n = 0;
		boolean encontro = false;
		while(!encontro) {
			String estado = estados[n];
			System.out.println(estado);
			if(estado == "Ohio") {
				System.out.println("Estado encontrado");
				encontro = true;
			}
			n++;
		}
		
		System.out.println("\nImprimiendo el bucle FOR");
		//For loop  
		for(int x = 0;x<5;x++) {
			System.out.println(estados[x]);
		}
		
	}

}
