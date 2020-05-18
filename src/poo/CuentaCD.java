package poo;

public class CuentaCD extends CuentaBancaria implements Tasa{
	String tasaInteres;
	
	void compuesto() {
		System.out.println("INTERES COMPUESTO");
	}

}
