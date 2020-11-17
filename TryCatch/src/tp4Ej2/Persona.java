package tp4Ej2;

import java.util.Scanner;

public class Persona {
	Scanner input = new Scanner(System.in);

	private int anioNacimiento;
	private int anioActual;
	private int anioMuerte;
	private static final int AUN_VIVE = -9999;
	
	public Persona(int anioNacimiento, int anioActual, int anioMuerte) {
		
		setAnioMuerte(anioMuerte);
		setAnioActual(anioActual);
		setAnioNacimiento(anioNacimiento);
	}
	
	public int getAnioMuerte() {
		return anioMuerte;
	}

	public void setAnioMuerte(int anioMuerte) {
		if(anioMuerte != this.AUN_VIVE) {
			if(anioMuerte > anioActual) {
				throw new IllegalArgumentException("No puede fallecer en el futuro");
			} else if (anioMuerte < anioNacimiento){
				throw new IllegalArgumentException("No puede fallecer antes de nacer");
			}
			} else {
		this.anioMuerte = anioMuerte;
			}
	}

	public int getAnioActual() {
		return anioActual;
	}

	public void setAnioActual(int anioActual) {
		this.anioActual = anioActual;
	}

	public int getAnioNacimiento() {
		return anioNacimiento;
	}

	public void setAnioNacimiento(int anioNacimiento) {
		if(anioNacimiento > anioActual) {
			throw new IllegalArgumentException("El nacimiento no puede ser en el futuro");
			
		} else {
		this.anioNacimiento = anioNacimiento;
		}
	}

	public boolean vive() {
		boolean vive = true;
		
		if(anioMuerte != this.AUN_VIVE) {
			vive = false;
		}
		
		return vive;
	}
}
