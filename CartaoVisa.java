package CartaoDeCredito;

import Banco.Cadastro;

public class CartaoVisa {
	Cadastro titular;
	private double limite;
	private double totalFatura;
	
	public CartaoVisa(Cadastro titular) {
		this.limite = titular.getRendaBruta() * 0.6;
	}
	
	public boolean usarCartao(double valor) {
		if((totalFatura + valor) <= limite) {
			this.totalFatura += valor;
			return true;
		}else {
			return false;
		}
	}

	public void pagarFatura(double valor) {
		this.totalFatura -= valor;
	}
	
	public double getLimite() {
		return limite;
	}

	public double getTotalFatura() {
		return totalFatura;
	}
}