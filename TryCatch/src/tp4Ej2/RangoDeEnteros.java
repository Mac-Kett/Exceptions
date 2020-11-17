package tp4Ej2;

public class RangoDeEnteros {

	private int limiteInferior;
	private int limiteSuperior;

	public RangoDeEnteros(int limiteInferior, int limiteSuperior) {
		// TODO implementar
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public boolean incluye(int aux) {
		return (aux >= getLimiteInferior() && aux <= getLimiteSuperior());
	}

	private void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}
	
	private void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}
	
}
