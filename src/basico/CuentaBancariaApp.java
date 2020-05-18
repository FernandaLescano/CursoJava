package basico;

public class CuentaBancariaApp {

	public static void main(String[] args) {
		CuentaBancaria cuenta1 = new CuentaBancaria("123456",1000);
		CuentaBancaria cuenta2 = new CuentaBancaria("654321",2000);
		CuentaBancaria cuenta3 = new CuentaBancaria("456789",2500);

		cuenta1.setNombre("Fernanda Lescano");
		System.out.println(cuenta1.getNombre());
		
		cuenta1.deposito(500);
		cuenta1.deposito(600);
		cuenta1.retirar(1000);	
		cuenta1.acumular();
		System.out.println(cuenta1.toString());
		
	}

}

class CuentaBancaria implements IIntereses{
	//PROPIEDADES DE LA CUENTA
	private static int ID = 1000; // ID interna
	private String numeroCuenta; // ID + 2 numeros random + los dos primeros numeros de Seguro social
	private static final String numeroRuta = "005400657";
	private String nombre;
	private String ssn;
	private double saldo;
	
	//CONSTRUCTORES
	public CuentaBancaria(String ssn, double depositoInicial) {
		this.ssn = ssn;
		saldo = depositoInicial;
		ID++;
		setnumeroCuenta();
	}
	
	private void setnumeroCuenta() {
		int random = (int) (Math.random() * 100);
		numeroCuenta = ID+""+random+ssn.substring(0,2);
		System.out.println("Tu numero de cuenta es : "+numeroCuenta);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void retirar(double cantidad) {
		saldo = saldo - cantidad;
		mostrarSaldo();
	}
	
	public void deposito(double cantidad) {
		saldo = saldo + cantidad;
		mostrarSaldo();
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo : " + saldo);
	}

	@Override
	public void acumular() {
		saldo = saldo * (1 + tasa/100);
		mostrarSaldo();		
	}
	
	public String toString() {
		return "Nombre : " + nombre + ".\nNumero De Cuenta :" + numeroCuenta + ".\nNumero de ruta : " + numeroRuta +".\nSaldo : " + saldo;
	}
}