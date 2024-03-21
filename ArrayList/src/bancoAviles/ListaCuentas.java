package bancoAviles;

import java.util.ArrayList;

public class ListaCuentas {
	private ArrayList <CuentaCorriente> listaCuentasCorrientes = new ArrayList <CuentaCorriente>();
	
	public ListaCuentas() {
		super();
	}
	
	public void cargarDatos() {
		Titular titular1 = new Titular("Noe", "Tira Donada", 39);
		
		this.listaCuentasCorrientes.add(new CuentaCorriente(titular1, "000001", 0.0));
		this.listaCuentasCorrientes.add(new CuentaAhorro(titular1, "000002", 0.0, 0.025));
	}
	
	public void ingresoInterfaz(String numCuentaBuscar) {
		boolean encontrado = ingresoBuscar(numCuentaBuscar);
		
		if(encontrado == false) {
			System.out.println();
			System.out.println("Numero de Cuenta erroneo, por favor vuelta a intentarlo.");
			System.out.println();
		}
	}
	
	public boolean ingresoBuscar(String numCuentaBuscar) {
		boolean encontrado = false;
		
		for(CuentaCorriente cuenta : this.listaCuentasCorrientes) {
			if(cuenta.getNumCuenta().equals(numCuentaBuscar)) {
				encontrado = true;
				cuenta.sumarSaldo();
			}
		}
		
		return encontrado;
	}
	
	public void retiroInterfaz(String numCuentaBuscar) {
		boolean encontrado = retiroInterfazBuscar(numCuentaBuscar);
		
		if(encontrado == false) {
			System.out.println();
			System.out.println("Numero de Cuenta erroneo, por favor vuelta a intentarlo.");
			System.out.println();
		}
	}
	
	public boolean retiroInterfazBuscar(String numCuentaBuscar) {
		boolean encontrado = false;
		
		for(CuentaCorriente cuenta : this.listaCuentasCorrientes) {
			if(cuenta.getNumCuenta().equalsIgnoreCase(numCuentaBuscar)) {
				encontrado = true;
				cuenta.restarSaldo();
			}
		}
		
		return encontrado;
	}
	
	public void interesesInterfaz(String numCuentaBuscar) {
		boolean encontrado = interesesBuscar(numCuentaBuscar);
		
		if(encontrado == false) {
			System.out.println();
			System.out.println("Numero de Cuenta erroneo, por favor vuelta a intentarlo.");
			System.out.println();
		}
	}
	
	public boolean interesesBuscar(String numCuentaBuscar) {
		boolean encontrado = false;
		
		for(CuentaCorriente cuenta : this.listaCuentasCorrientes) {
			if((cuenta.getNumCuenta().equalsIgnoreCase(numCuentaBuscar)) && (cuenta instanceof CuentaAhorro)) {
				CuentaAhorro cuentaAhorro = (CuentaAhorro)cuenta;
				encontrado = true;
				cuentaAhorro.intereses();
			}
		}
		
		return encontrado;
	}
	
	public void mostrarCuentas() {
		for(CuentaCorriente cuenta : this.listaCuentasCorrientes) {
			System.out.println(cuenta.toString());
			System.out.println();
		}
	}
	
	public ListaCuentas(ArrayList<CuentaCorriente> listaCuentasCorrientes) {
		super();
		this.listaCuentasCorrientes = listaCuentasCorrientes;
	}
	public ArrayList<CuentaCorriente> getListaCuentasCorrientes() {
		return listaCuentasCorrientes;
	}
	public void setListaCuentasCorrientes(ArrayList<CuentaCorriente> listaCuentasCorrientes) {
		this.listaCuentasCorrientes = listaCuentasCorrientes;
	}
	
}