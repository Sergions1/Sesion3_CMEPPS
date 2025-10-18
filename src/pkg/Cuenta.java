package pkg;

import java.util.List;

public class Cuenta { 
    String mNumero; 
    String nTitular; 
    Double saldo;
    List <Movimiento> mMovimientos;
    
	public Cuenta(Double saldo) {
		super();
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public void ingresar(double x) {
		this.saldo += x;
	}
	public void retirar(double x) {
		if(saldo-x >= -500)
			this.saldo -= x;
	}
}
