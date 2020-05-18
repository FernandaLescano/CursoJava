package poo;

public class CuentaPrestamo implements Tasa {

	@Override
	public void setTasa() {
		System.out.println("Tasa");	
	}

	@Override
	public void incremento() {
		System.out.println("Incremento la tasa");		
	}
	
	public void setTermino(int termino) {
		System.out.println("Ajustando los terminos a : "+ termino +" años");
	}
	
	public void setcalendarioAmortizacion() {
		System.out.println("Horario de amortizacion ");
	}


}
