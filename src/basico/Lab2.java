package basico;

public class Lab2 {

	public static void main(String[] args) {
		// Creamos un estudiante
		Estudiante est1 = new Estudiante("Fernanda","123456789");
		Estudiante est2 = new Estudiante("Luis","456789123");
		Estudiante est3 = new Estudiante("Alejandro","987654321");
		
		est1.incripcion("Matematica151");
		est1.incripcion("Ingles255");
		est1.incripcion("Historia211");
		
		//est1.mostarCursos();
		//est1.saldo();
		est1.pago(600);
		//est1.saldo();
		
		System.out.println(est1.toString());
		

	}

}

class Estudiante {
	//Propiedades
	private static int ID = 0;
	private String usuarioId;
	private String  nombre;
	private String ssn;
	private String mail;
	private String telefono;
	private String ciudad;
	private String estado;
	private String cursos = "";
	private static final int costoCurso = 800;
	private int saldo=0;
	

	
	
	// CONSTRUCTOR
	public Estudiante(String nombre, String ssn) {
		ID++;
		this.nombre = nombre;
		this.ssn = ssn;
		setUsuarioId();
		setMail();
	}
	
	private void setMail() {
		mail = nombre.toLowerCase()+"."+ ID + "@estudiante.com";
		System.out.println("Su mail es : " + mail);
	}
	
	
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getMail() {
		return mail;
	}
	
	private void setUsuarioId() {
		int max = 9000;
		int min = 1000;
		int randNum = (int) (Math.random() * ((max - min)));
		randNum = randNum + min;
		usuarioId = ID +""+ randNum + ssn.substring(5);
		System.out.println("Su ID de usuario es : " + usuarioId);
	}
	
	public void incripcion(String cursos) {
		this.cursos = this.cursos + " "
				+ ""
				+ "" + cursos;
		saldo = saldo + costoCurso;
	}
	
	public void pago(int cantidad) {
		System.out.println("Pago : " + cantidad);
		saldo = saldo - cantidad;
		
	}
	
	public void saldo() {
		System.out.println("El saldo es : " + saldo);
	}
	
	public void mostarCursos() {
		System.out.println(cursos);
	}
	
	public String toString() {
		return "Nombre : " + nombre + ".\nCursos : " + cursos + "\nSaldo : $" + saldo;
	}
}