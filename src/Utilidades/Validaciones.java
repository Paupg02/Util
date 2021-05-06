package Utilidades;

import java.util.regex.*;

/**
 * @author miguel tinjaca-paula plaza-sarah hallich
 *
 */

public class Validaciones {

	public static String validacionCadenaEnBlanco() {
		String cadena = "";
		while (cadena.equals("") || cadena.equals(" ")) {
			System.out.println("La cadena no puede estar vacia");
			cadena = Entrada.cadena();
		}
		return cadena;
	}

	public static int intPositivo() {
		int n = -5;
		while (n < 0) {
			System.out.println("El numero tiene que ser positivo");
			n = Entrada.entero();
		}
		return n;
	}

	public static double doublePositivo() {
		double n = -1;
		while (n < 0) {
			System.out.println("El numero tiene que ser positivo");
			n = Entrada.realDoble();
		}
		return n;
	}

	public static int edadValida() {
		int edad;
		do {
			System.out.println("La edad tiene que ser valida (0 -120)");
			edad = Entrada.entero();
		} while (edad < 0 || edad > 120);
		return edad;
	}

	public static String validacionRespuestaString() {
		String r = "";
		while (!r.equalsIgnoreCase("Si") && !r.equalsIgnoreCase("No")) {
			System.out.println("Introduce Si | No");
			r = Entrada.cadena();
		}
		return r;
	}

	public static char validacionRespuestaChar() {
		char rta = ' ';
		while (!(rta == 'S') && !(rta == 'N')) {
			System.out.println("Introduce S | N");
			rta = Entrada.caracter();

		}
		return rta;
	}

	public static boolean validacionRespuestaBoolean(String rta) {
		rta.toLowerCase();
		if (!rta.equalsIgnoreCase("s") && !rta.equalsIgnoreCase("n"))
			return true;
		else
			return false;
	}

	public static boolean comprobarMatricula(String matricula) {

		if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
			System.out.println("Matrícula válida");

			return true;
		} else {

			System.out.println("Matrícula inválida");
			return false;
		}

	}

	public static String EntradaMatricula() {
		String matricula;
		do {
			System.out.println("Escriba la matricula");
			matricula = Entrada.cadena();
		} while (!Validaciones.comprobarMatricula(matricula));
		return matricula;
	}

	public static String comprobacionDni() {
		String numDni;
		int n;
		boolean salida = false;
		do {
			System.out.println("Escriba sus numeros de dni ");
			numDni = Entrada.cadena();
			if ((numDni.toUpperCase().matches("^[0-9]{8}$"))) {
				System.out.println("Valido");
				salida = true;
			} else {
				System.out.println("Invalido");
			}
		} while (!salida);

		n = Integer.parseInt(numDni);
		char caracteres[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V',
				'H', 'L', 'C', 'K', 'E' };
		int resto = n % 23;
		return "" + n + caracteres[resto];
	}

	public static String validarFecha(int dia, int mes, int anio) {
		while (anio < 1900 || anio > 2050) {
			System.out.println("Intrduce un año valido entre 1900 y 2050");
			anio = Entrada.entero();
		}
		while (mes < 1 || mes > 12) {
			System.out.println("Intrduce un mes valido entre 1 y 12");
			mes = Entrada.entero();
		}
		switch (mes) {
		case 1:
			while (dia < 1 || dia > 31) {
				System.out.println("Intrduce un dia valido entre 1 y 31");
				dia = Entrada.entero();
			}
			break;
		case 2:
			if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
				while (dia < 1 || dia > 29) {
					System.out.println("Intrduce un dia valido entre 1 y 29");
					dia = Entrada.entero();
				}
			} else {
				while (dia < 1 || dia > 28) {
					System.out.println("Intrduce un dia valido entre 1 y 28");
					dia = Entrada.entero();
				}
			}
			break;
		case 3:
			while (dia < 1 || dia > 30) {
				System.out.println("Intrduce un dia valido entre 1 y 30");
				dia = Entrada.entero();
			}
			break;
		case 4:
			while (dia < 1 || dia > 31) {
				System.out.println("Intrduce un dia valido entre 1 y 31");
				dia = Entrada.entero();
			}
			break;
		case 5:
			while (dia < 1 || dia > 30) {
				System.out.println("Intrduce un dia valido entre 1 y 30");
				dia = Entrada.entero();
			}
			break;
		case 6:
			while (dia < 1 || dia > 30) {
				System.out.println("Intrduce un dia valido entre 1 y 30");
				dia = Entrada.entero();
			}
			break;
		case 7:
			while (dia < 1 || dia > 31) {
				System.out.println("Intrduce un dia valido entre 1 y 31");
				dia = Entrada.entero();
			}
			break;
		case 8:
			while (dia < 1 || dia > 31) {
				System.out.println("Intrduce un dia valido entre 1 y 31");
				dia = Entrada.entero();
			}
			break;
		case 9:
			while (dia < 1 || dia > 30) {
				System.out.println("Intrduce un dia valido entre 1 y 30");
				dia = Entrada.entero();
			}
			break;
		case 10:
			while (dia < 1 || dia > 31) {
				System.out.println("Intrduce un dia valido entre 1 y 31");
				dia = Entrada.entero();
			}
			break;
		case 11:
			while (dia < 1 || dia > 30) {
				System.out.println("Intrduce un dia valido entre 1 y 30");
				dia = Entrada.entero();
			}
			break;
		case 12:
			while (dia < 1 || dia > 31) {
				System.out.println("Intrduce un dia valido entre 1 y 31");
				dia = Entrada.entero();
			}
			break;
		}
		return "" + dia + "/" + mes + "/" + anio;
	}

	public static boolean validaNifBegona(String nif) {
		Pattern patron = Pattern.compile("^[0-9]{8}[A-HJ-NP-TV-Z]$");
		Matcher mat = patron.matcher(nif);
		if (!mat.find())
			return false;
		char letras[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		int numero = Integer.parseInt(nif.substring(0, 8));
		if (nif.charAt(8) != letras[numero % 23])
			return false;
		return true;
	}
}