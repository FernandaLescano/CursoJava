package basico;

public class FibonacciApp {

	public static void main(String[] args) {
		// La suma de Fibonacci se define por la suma de los numeros de Fibonacci anteriores
		// fibo(0)=0
		// fibo(1)=1
		// fibo(2)=fibo(0)+fibo(1)
		System.out.println(fibo(7));

	}
	public static int fibo(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		return( ( (fibo(n-1)) + (fibo(n-2)) ) );
	}

}
