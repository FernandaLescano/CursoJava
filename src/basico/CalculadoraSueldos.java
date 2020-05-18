package basico;

public class CalculadoraSueldos {
	public static void main(String[] args) {
		//crear una variable 
		
		//declarar una variable
		String carrera;
		System.out.println("El programa esta comenzando");
		
		//Define una variable
		carrera = "Desarrollador de software";
		System.out.println("Mi carrera es : " + carrera);
		
		//Declarar y definir
		int horasPorSemana = 40;
		int semanasPorAnio = 50;
		double tasa = 42.5;
		
		double salario = horasPorSemana * semanasPorAnio * tasa;
		System.out.println("Mi salario como " + carrera+ " es: " + salario);
		//calcular el salario anual
		//tasa por horas por semana por semanas por año
		
	}

}
