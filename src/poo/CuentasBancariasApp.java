package poo;

public class CuentasBancariasApp {

	public static void main(String[] args) {
		// Creamos una cuenta bancaria
		
		CuentaBancaria cuenta1 = new CuentaBancaria();
		//Encapsulacion 
		cuenta1.setNombre("Fernanda Lescano");
		System.out.println(cuenta1.getnombre());
		cuenta1.setSeguridadSocial("4567965");
		System.out.println(cuenta1.getSeguridadSocial());
		
		cuenta1.numeroCuenta = "123123";
		//cuenta1.nombre = "Fernanda Lescano";
		cuenta1.balance = 10000;
		cuenta1.setTasa();
		cuenta1.incremento();
		
		cuenta1.deposito(1500);
		
		//POLIMORFISMO A TRAVES DE LA ESCRITURA
		System.out.println(cuenta1.toString());
		
		
		//POLIMORFISMO A TRAVES DE SOBRECARGA
		 CuentaBancaria cuenta2 = new CuentaBancaria("Cuenta corriente");
		 cuenta2.numeroCuenta = "123123";
		 
		 CuentaBancaria cuenta3 = new CuentaBancaria("Caja de Ahorro",5000);
		 cuenta3.numeroCuenta = "123123"; cuenta3.balanceCuenta();
		 /* 
		 * //Herencia CuentaCD cd1 = new CuentaCD(); cd1.balance = 1000; cd1.tasaInteres
		 * = "4.5"; cd1.nombre = "Alejandro"; cd1.tipoCuenta = "Cuenta CD";
		 * System.out.println(cd1.toString()); cd1.compuesto();
		 */
		
	}

}
