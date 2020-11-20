package impresora;

public class Impresora {

	private static void Cabezal cabezal;
	private static void Cabezal cabezalAux;
	private boolean ocupada = true;
	
	public void trazar(String recorrido) {
		//viene por defecto
	}
	
	public void imprimir(Documento documento) {
		if(ocupada) {
			throw new NoPuedeImprimirException();
		}
		try {
			cabezal.eyectar(documento.tinta());
			
		}
		catch (InvalidArgumentException ia) {
			System.out.println("No hay tinta suficiente para realizar la operación");
			cabezalAux.eyectar(documento.tinta())
		}
		
		trazar(documento.recorrido());
		ocupada = false;
	}

}
