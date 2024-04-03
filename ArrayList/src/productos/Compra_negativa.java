package productos;

public class Compra_negativa extends Exception {
	public Compra_negativa() {}
	
	public Compra_negativa(String msj_error) {
		super(msj_error);
	}
}
