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
	public double ingresar(double x) {
		return 200;
	}
	public double retirar(double x) {
		return 0;
	}
}
