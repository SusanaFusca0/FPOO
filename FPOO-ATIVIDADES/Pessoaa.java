package Atividades_Susana_Fusca;

public class Pessoaa {
	//atributos
	public String nome;
	//get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//método
	public void exibirNome() {
		System.out.println("Nome do cliente: " + getNome());
	}
	public void comer() {
		System.out.println(getNome() + " comeu todos produtos comprados...");
	}
}
