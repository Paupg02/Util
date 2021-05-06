package Utilidades;

public class pruebaOrdenacion {
	public static void mostrar (int[]array) {
		for(int numero:array) {
			System.out.println(numero+"    ");
		}
	}
	public static void main(String[] args) {
		int[] array= {3, 5, 9, 2, 0, 8, 4, 5, 3, 0};
		System.out.println("Antes de la ordenacion");
		mostrar(array);
		OrdenacionBusqueda.burbuja(array);
		System.out.println("\nTras la ordenacion");
		mostrar(array);
	}


}
