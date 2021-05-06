package Utilidades;

public class Fecha {
	public int dia, mes, anio;
	public Fecha() {
		dia=1;
		mes=1;
		anio=1900;
	}
	public void setDia(int dia) {
		this.dia=dia;
	}
	public void setMes(int mes) {
		this.mes=mes;
	}
	public void setAnio(int anio) {
		this.anio=anio;
	}
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public int getAnio() {
		return anio;
	}
	public void validar() {
		do{
			System.out.println("Intrduce un año valido entre 1900 y 2050");
			anio=Entrada.entero();
		}while(anio<1900 || anio>2050);
		do{
			System.out.println("Intrduce un mes valido entre 1 y 12");
			mes=Entrada.entero();
		}while(mes<1 || mes>12);
		switch (mes) {
			case 1:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 31");
					dia=Entrada.entero();
				}while(dia<1 || dia>31);
				break;
			case 2:
				if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
					do{
						System.out.println("Intrduce un dia valido entre 1 y 29");
						dia=Entrada.entero();
					}while(dia<1 || dia>29);
				}else {
					do{
						System.out.println("Intrduce un dia valido entre 1 y 28");
						dia=Entrada.entero();
					}while(dia<1 || dia>28);
				}
				break;
			case 3:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 30");
					dia=Entrada.entero();
				}while(dia<1 || dia>30);
				break;
			case 4:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 31");
					dia=Entrada.entero();
				}while(dia<1 || dia>31);
				break;
			case 5:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 30");
					dia=Entrada.entero();
				}while(dia<1 || dia>30);
				break;
			case 6:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 30");
					dia=Entrada.entero();
				}while(dia<1 || dia>30);
				break;
			case 7:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 31");
					dia=Entrada.entero();
				}while(dia<1 || dia>31);
				break;
			case 8:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 31");
					dia=Entrada.entero();
				}while(dia<1 || dia>31);
				break;
			case 9:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 30");
					dia=Entrada.entero();
				}while(dia<1 || dia>30);
				break;
			case 10:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 31");
					dia=Entrada.entero();
				}while(dia<1 || dia>31);
				break;
			case 11:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 30");
					dia=Entrada.entero();
				}while(dia<1 || dia>30);
				break;
			case 12:
				do{
					System.out.println("Intrduce un dia valido entre 1 y 31");
					dia=Entrada.entero();
				}while(dia<1 || dia>31);
				break;
		}
		
	}

}
