package basico;

public class Cadenas {
	public static void main(String[] args) {
		String tituloLibro = "Señor de los anillos";
		String eleccionPalabra = "anillo";
		
		if(tituloLibro.contains(eleccionPalabra)) {
			System.out.println("El libro contiene la palabra "+ eleccionPalabra);
		}
		String navegador = "Chrome";
		if(navegador.equalsIgnoreCase("chrome")) {
			System.out.println("El navegador es Chrome");
		}
		String nombre = "Fernanda";
		String apellido = "Lescano";
		String documento = "34763837";
		
		//imprimir las iniciales
		System.out.print(nombre.substring(0,1));
		System.out.print(apellido.substring(0,1));
		System.out.println(documento.substring(5));
	}

}
