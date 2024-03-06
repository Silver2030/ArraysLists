package banco;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayBancos {
	
	private ArrayList<Banco> bancoArrayList = new ArrayList<Banco>();

	public ArrayBancos() {
		super();
	}
	
	public void cargarDatos() {
		Banco banco = new Banco("DA1DHA141A", 2000);
		
		this.bancoArrayList.add(banco);
	}
	
	public void mostrarCuentas() {
		for(Banco cadena : this.bancoArrayList) {
			System.out.println(cadena.toString());
		}
		System.out.println();
	}
	
	public void ingresarTexto(String idBuscar, int ingreso) {
		boolean transferencia = false;
		System.out.println("Realizando ingreso...");
		System.out.println();
		transferencia = ingresar(idBuscar, ingreso, transferencia);
		if(transferencia == false) System.out.println("No ha sido posible realizar el ingreso, compruebe el ID");
		else System.out.println("Ingreso realizado exitosamente");
	}
	
	public boolean ingresar(String idBuscar, int ingreso, boolean transferencia) {
		for(Banco cadena : this.bancoArrayList) {
			if(cadena.getId().equals(idBuscar)) {
				cadena.setSaldo(cadena.getSaldo() + ingreso);
				transferencia = true;
			}
		}
		return transferencia;
	}
	
	public void retirarTexto(String idBuscar, int retirar) throws Resultado_Negativo {
		boolean transferencia = false;
		System.out.println("Realizando retiro...");
		transferencia = retirar(idBuscar, retirar, transferencia);
		System.out.println();
		if(transferencia == false) System.out.println("No ha sido posible realizar el retiro, compruebe el ID");
		else System.out.println("Retiro realizado exitosamente");
	}
	
	public boolean retirar(String idBuscar, int retirar, boolean transferencia) throws Resultado_Negativo {
		for(Banco cadena : this.bancoArrayList) {
			if(cadena.getId().equals(idBuscar)) {
				cadena.saldoNegativo(retirar);
				cadena.setSaldo(cadena.getSaldo() - retirar);
				transferencia = true;
			}
		}
		return transferencia;
	}

	public ArrayBancos(ArrayList<Banco> bancoArrayList) {
		super();
		this.bancoArrayList = bancoArrayList;
	}

	public ArrayList<Banco> getBancoArrayList() {
		return bancoArrayList;
	}

	public void setBancoArrayList(ArrayList<Banco> bancoArrayList) {
		this.bancoArrayList = bancoArrayList;
	}
	
}
