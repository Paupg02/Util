package Utilidades;

public class OrdenacionBusqueda {
	public static void seleccion(int[] array) {
		int min, aux;
		for (int i = 0; i < array.length; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min])
					min = j;
			}
			if (i != min) {
				aux = array[i];
				array[i] = array[min];
				array[min] = aux;
			}
		}
	}

	public static void insercion(int[] array) {
		int aux, p;
		for (int i = 0; i < array.length; i++) {
			aux = array[i];
			p = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < aux) {
					aux = array[j];
					p = j;
				}
			}
			array[p] = array[i];
			array[i] = aux;
		}
	}

	public static void burbuja(int[] array) {
		int aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}

	public static void seleccion2(String[] array) {
		int min;
		String aux;
		for (int i = 0; i < array.length; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[min].compareTo(array[j]) > 0)
					min = j;
			}
			if (min != i) {
				aux = new String(array[i]);
				array[i] = array[min];
				array[min] = aux;
			}
		}
	}

	public static void insercion2(String[] array) {
		int p;
		String aux;
		for (int i = 0; i < array.length; i++) {
			aux = array[i];
			p = i;
			for (int j = i; j < array.length; j++) {
				if (array[j].compareTo(aux) < 0) {
					aux = array[j];
					p = j;
				}
			}
			array[p] = array[i];
			array[i] = aux;
		}
	}

	public static void burbuja2(String[] array) {
		String aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].compareTo(array[j + 1]) > 0) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
	}

}
