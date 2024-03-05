package banco;

public class Banco {
	private String id;
	private int saldo;
	
	public Banco() {
		super();
	}

	public Banco(String id, int saldo) {
		super();
		this.id = id;
		this.saldo = saldo;
	}
	
	public void saldoNegativo(int cantidad, int saldo) throws Resultado_Negativo{
		if(saldo < cantidad) throw new Resultado_Negativo("No se puede retirar más de lo que se tiene disponible");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return 	"ID: " + id + "\n" +
				"Saldo: " + saldo;
	}

}
