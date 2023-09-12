package Banco;

public class ContaCorrente extends Conta {

	public ContaCorrente(int conta, int agencia, double saldo) {
		super(conta, agencia, saldo);
		
	}

	@Override
	public boolean saca(double valor) {
		double valorSaca = valor + 5.0;
		return super.saca(valorSaca);
	}
	
}