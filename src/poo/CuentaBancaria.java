package poo;

public class CuentaBancaria implements Tasa{
	//Definir variables
	String numeroCuenta;
	//Static indicara que pertenece a la clase no a la instancia del objeto
	private static final String numeroRuta = "123123";
	private String nombre;
	private String seguridadSocial;
	String tipoCuenta;
	double balance;
	
	//DEFINIR CONSTRUCTORES, METODOS UNICOS
		//1. se usan para definir/configurar/ inicializar propiedades de un objeto
		//2. estan implicitamente llamados a la instanciacion
		//3. EL mismo nombre que la clase
		//4. no tienen ningun tipo de retorno
	CuentaBancaria(){
		System.out.println("CREAR NUEVA CUENTA");
		
	}
	//SOBRECARGA es cuando se llama con el mismo nombre de metodos con diferentes argumentos
	CuentaBancaria(String tipoCuenta){
		System.out.println("NUEVA CUENTA : "+tipoCuenta);
		
	}
	
	CuentaBancaria(String tipoCuenta, double depositoInicial){
		System.out.println("NUEVA CUENTA : "+tipoCuenta);
		System.out.println("DEPOSITO INICIAL DE : "+ depositoInicial);
		String Mensaje;
		if(depositoInicial < 1000) {
			Mensaje = "ERROR! El deposito no debe ser menor a 1000";
		}
		else {
			Mensaje = "Gracias por tu deposito inicial de : $"+depositoInicial;
		}
		System.out.println(Mensaje);
		balance = balance + depositoInicial;
		
	}
	
	//SETTER encapculamiento
	//el usuario define la variable nombre
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setSeguridadSocial(String seguridadSocial) {
		this.seguridadSocial = seguridadSocial;
	}
	
	public String getSeguridadSocial() {
		return seguridadSocial;
	}
	
	//METODOS DE INTERFAZ*************
	public void setTasa() {
		System.out.println("Tasa establecida");
	}
	 
	public void incremento() {
		System.out.println("Incrementando la tasa");
	}
	
	// Definir metodos
	void deposito(double cantidad) {
		balance = balance + cantidad;
		actividadReciente("DEPOSITO");
	}
	
	//si es privado solo se llamara desde la clase
	// es como una funcion automatica que se llamara desde otros metodos
	private void actividadReciente(String actividad) {
		System.out.println("Transaccion reciente :" + actividad);
		System.out.println("Su nuevo saldo es : $"+balance);
	}
	
	void retirar(double cantidad) {
		balance = balance - cantidad;
		actividadReciente("RETIRAR");
	}
	
	void balanceCuenta() {
		System.out.println("Balance : " + balance);
	}
	
	void estado() {
		
	}
	
	@Override
	public String toString() {
		return "{ NOMBRE : " + nombre + ". Numero de cuenta : " + numeroCuenta + ". Numero de ruta : " + numeroRuta + ". BALANCE : $" + balance + "}";
	}

}
