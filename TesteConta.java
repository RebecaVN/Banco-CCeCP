package Banco;
import CartaoDeCredito.CartaoVisa;

public class TesteConta {

	public static void main(String[] args) {
	
		Conta cc1 = new ContaCorrente(2222, 22, 10000);
		Conta cc2 = new ContaCorrente(3333, 33, 100);
		Conta cp1 = new ContaPoupanca(1000, 22, 100);
		
		
		Cadastro cad1 = new Cadastro("Milene Paiva", "897.354.855-04", "(11)91234-1234", 10000.0);
		Cadastro cad2 = new Cadastro("Rebeca Nunes", "559,907.788-80", "(11)97694-3609", 2000.00);
		Cadastro cad3 = new Cadastro("Flávia Viana", "219.306.848-86", "(11)957846-6047", 3000.00);
		
		cc1.cliente = cad1;
		cc2.cliente = cad2;
		cp1.cliente = cad3;
		
		CartaoVisa cartaoAbel = new CartaoVisa(cad1);
		
		System.out.println("                                     BANCO");
		System.out.println();
		System.out.println("                                ABERTURA DE CONTAS");
		System.out.printf("Abertura de C.Corrente com R$100,00 para " + cc1.cliente.getNome() + ", Saldo R$", cc1.getSaldo());
		System.out.printf("Abertura de C.Corrente com R$100,00 para " + cc2.cliente.getNome() + ", Saldo R$", cc2.getSaldo());
		System.out.printf("Abertura de C.Poupança com R$100,00 para " + cp1.cliente.getNome() + ", Saldo R$", cp1.getSaldo());
		System.out.println();
		
		System.out.println("           |Transferência |");
		cc1.transfere(100, cc2);
		System.out.printf("Transferiu R$100,00 de " + cc1.cliente.getNome() + "(cc) para " + cc2.cliente.getNome() + ", saldo R$", cc1.getSaldo());
		System.out.printf("Saldo de " + cc2.cliente.getNome() + "(cc), R$ %.2f %n", cc2.getSaldo());
		System.out.println();
		
		cp1.transfere(10, cc2);
		System.out.println("           |Transferência |");
		System.out.printf("Transferiu R$10,00 de " + cp1.cliente.getNome() + "(cP) para " + cc2.cliente.getNome() + ", saldo R$", cp1.getSaldo());
		System.out.printf("Saldo de " + cc2.cliente.getNome() + ", R$", cc2.getSaldo());
		System.out.println();
		
		System.out.println("Limite do C.Visa: R$" + cartaoAbel.getLimite());
		
		
		if(cartaoAbel.usarCartao(3000)) {
			System.out.println("Compra Autorizada no valor de R$3000");
		}else {
			System.out.println("Contate a sua administradora de cartão");
		}
		
		if(cartaoAbel.usarCartao(2000)) {
			System.out.println("Compra Autorizada no valor de R$2000");
		}else {
			System.out.println("Contate a sua administradora de cartão");
		}
		if(cartaoAbel.usarCartao(1000)) {
			System.out.println("Compra Autorizada no valor de R$1000");
		}else {
			System.out.println("Contate a sua administradora de cartão");
		}
		if(cartaoAbel.usarCartao(0.10)) {
			System.out.println("Compra Autorizada no valor de R$0,10");
		}else {
			System.out.println("Contate a sua administradora de cartão");
		}
				
	}
}