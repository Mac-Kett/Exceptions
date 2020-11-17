package tp4Ej2;

public class Alumno extends Persona{

	private String legajo;
	private String dni;
		public static final RangoDeEnteros RANGO = new RangoDeEnteros(10000000, 99999999);

	public Alumno(String dni, int anioNacimiento, int anioActual, int anioMuerte) {
		super(anioNacimiento, anioActual, anioMuerte);
		setLegajo(dni);
		setDni(dni);
	}
		public String getLegajo() {
			return legajo;
		}
		private void setLegajo(String dni) {
			int miDNI = Integer.parseInt(dni);
			
			if(miDNI < RANGO.getLimiteInferior()) {
				throw new IllegalArgumentException("El n�mero no puede ser menor que el l�mite m�s bajo");
			}
			else if(miDNI > RANGO.getLimiteSuperior()) {
				throw new IllegalArgumentException("El n�mero no puede ser mayor que el l�mite m�s alto");
			}
						
			this.legajo = dni;
		}
		public String getDni() {
			return dni;
		}
		
		private void setDni(String dni) {
			int miDNI = Integer.parseInt(dni);
			
			if(miDNI < RANGO.getLimiteInferior()) {
				throw new IllegalArgumentException("El n�mero no puede ser menor que el l�mite m�s bajo");
			}
			else if(miDNI > RANGO.getLimiteSuperior()) {
				throw new IllegalArgumentException("El n�mero no puede ser mayor que el l�mite m�s alto");
			}
			
			this.dni = dni;
		}
	
	
	
}
