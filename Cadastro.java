package Banco;

public class Cadastro {
	private String nome;
	private String cpf;
	private String telefone;
	private double rendaBruta;
	
	public Cadastro(String nome, String cpf, String telefone, double rendaBruta) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rendaBruta = rendaBruta;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public double getRendaBruta() {
		return rendaBruta;
	}
	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}
	

}