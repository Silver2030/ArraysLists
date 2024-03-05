package banco;

public class Resultado_Negativo extends Exception {
	public Resultado_Negativo() {}
	
	public Resultado_Negativo(String msj_error) {
		super(msj_error);
	}
}
