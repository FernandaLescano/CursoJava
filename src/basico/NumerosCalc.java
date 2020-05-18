package basico;

public class NumerosCalc {
	public static void main(String[] args) {
		printName();
		int numA=10;
		int numB=20;
		addNumeros(numA,numB);
		int prod = multNumeros(numA,numB);
		System.out.println("La multiplicacion es :" + prod);
	}
		
		static void printName() {
			System.out.println("Mi nombre es Fer");
		}
		
		static void addNumeros(int a, int b) {
			//esta funcion agrega dos numeros
			int suma = a + b;
			System.out.println("La suma es : "+ suma);
		}
		
		static int multNumeros(int n1, int n2) {
			int producto = n1*n2;
			addNumeros(producto,producto);
			return producto;
		}

}
