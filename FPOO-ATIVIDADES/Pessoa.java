package Atividades_Susana_Fusca;

public class Pessoa {
	//atributos
	private String nome;
	private String endereco;
	private int telefone;
	private int cpf;
	private int celular;
	
	//construtor
	Pessoa(){
		
	}
	//metodos getters e setters
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setTelefon(int telefone) {
		this.telefone = telefone;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public int getCelular() {
		return celular;
	}
}
