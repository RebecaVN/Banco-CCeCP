package Banco;

public abstract class Conta {

	private int conta;
	private int agencia;
	private double saldo;
	Cadastro cliente;
	
	public Conta(int conta, int agencia, double saldo) {
		this.conta = conta;
		this.agencia = agencia;
		this.saldo = saldo;
	}


	public int getConta() {
		return conta;
	}


	public void setConta(int conta) {
		this.conta = conta;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public double getSaldo() {
		return saldo;
	}

	
	public void deposito(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saca(valor)) {
			destino.deposito(valor);
			return true;
		}else {
			return false;
		}
	}
}
