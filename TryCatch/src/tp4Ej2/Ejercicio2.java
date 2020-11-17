package tp4Ej2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LectorEnteros lector = new LectorEnteros(input);
		final RangoDeEnteros RANGO_NRO_DOCUMENTO = new RangoDeEnteros(1000000, 99999999);
		final RangoDeEnteros RANGO_ANIO_NACIMIENTO = new RangoDeEnteros(1900, 2019);
		Alumno alu = null;
		int dni = 0, anioNacimiento = 0;
		String nombreCompleto;
		int anioActual = 0;
		int anioFallecimiento = 0;

		while (alu == null) {
			System.out.println("Ingrese el nombre de la persona");
			nombreCompleto = input.nextLine();
			//validar eso
			
			try { System.out.println("Ingrese año de nacimiento");
			anioNacimiento = input.nextInt();
			}
			//validar eso
			catch (NumberFormatException nfe) {
				System.out.println("Hubo un error en la carga del año de nacimiento");
			}
			
			try {
			System.out.println("Ingrese el año actual");
			anioActual = input.nextInt();
			}
			//validar eso
			catch (NumberFormatException nfe) {
				System.out.println("Hubo un error en la carga del año actual");
			}
			
			try {
			System.out.println("Ingrese año de fallecimiento");
			anioFallecimiento = input.nextInt();
			}
			//validar eso
			catch(NumberFormatException nfe) {
				System.out.println("Hubo un error en la carga del año de fallecimiento");
			}
			
			alu = new Alumno(nombreCompleto, anioNacimiento, anioActual, anioFallecimiento);
		}
		input.close();
		System.out.println(alu.toString());

		if (alu.vive()) {
			System.out.println("La persona vive");
		} else {
			System.out.println("La persona no vive");
		}

	}
}
