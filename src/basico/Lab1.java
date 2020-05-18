package basico;

public class Lab1 {

	public static void main(String[] args) {
		// Una funcion que toma un valor n y devuelve la suma
		System.out.println("Suma : " + suma(5));
		System.out.println("**********************");
		
		// Una funcion que saque el factorial de un numero
		System.out.println("Factorial : " + factorial(5));
		System.out.println("**********************");
		
		//Devolver el promedio de hombre y minimo de una matriz
		int[] numeros = {5,-2,0,234,-430,63};
		System.out.println("Minimo : " + encontrarMinimo(numeros));
		System.out.println("**********************");
		
		//Devolver el promedio de hombre y minimo de una matriz
		System.out.println("Maximo : " + encontrarMaximo(numeros));
		System.out.println("**********************");		
		
		System.out.println("Promedio : "+promedio(numeros));
	}
	public static int suma(int n) {
		int suma = 0;
		for(int i=1;i<=n;i++) {
			System.out.print(suma + " + " + i);
			suma = suma + i;
			System.out.println(" = "+suma);
		}
		return suma;
	}
	
	public static int promedio(int[] arr) {
		// tomar la suma, y dividir por numero de elementos 
		int suma = 0;
		for(int n=1;n<arr.length;n++) {
			suma = suma + arr[n];
		}
		System.out.println("Suma : " + suma);
		return suma/arr.length;
	}
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		return factorial(n-1)*n;
	}
	
	public static int encontrarMinimo(int[] arr) {
		int min = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public static int encontrarMaximo(int[] arr) {
		int max = arr[0];
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

}
