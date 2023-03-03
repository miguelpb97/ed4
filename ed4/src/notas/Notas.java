package notas;

public class Notas {
	public static void main(String[] args) {
		notas.califica.califica();
	}

	/**
	 * @deprecated Use {@link notas.califica#califica()} instead
	 * 
	 */
	public static void cali() {
		notas.califica.califica();
	}

	/**
	 * @deprecated Use {@link califica#califica()} instead
	 * 
	 */
	public static void califica() {
		califica.califica();
	}
}
