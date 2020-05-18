package basico;

public class Dias {
	public static void main(String[] args) {
		//diferente bloque de codigo basado en el valor de una condicion
		String diaSemana = "Martes" ;
		
		switch(diaSemana) {
		case "Lunes" : 
			System.out.println("Hoy es Lunes");
			break;
		case "Martes" : 
			System.out.println("Hoy es Martes");
			break;
		case "Miercoles" : 
			System.out.println("Hoy es Miercoles");
			break;
		case "Jueves" : 
			System.out.println("Hoy es Jueves");
			break;
		case "Viernes" : 
			System.out.println("Hoy es Viernes");
			break;
		case "Sabado" : 
			System.out.println("Hoy es Sabado");
			break;
		case "Domingo" : 
			System.out.println("Hoy es Domingo");
			break;
		}
	}

}
