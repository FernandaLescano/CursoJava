package poo;

public class CuentaApp {

	public static void main(String[] args) {
		// 
		CuentaPrestamo cp = new CuentaPrestamo();
		cp.incremento();
		cp.setTasa();
		cp.setcalendarioAmortizacion();
		cp.setTermino(20);
		
		// POLIMORFISMO CAMBIA HACIA DONDE APUNTAMOS
		Tasa cuenta1 = new CuentaPrestamo();
		cuenta1.incremento();
		cuenta1.setTasa();
		
		
	}

}
