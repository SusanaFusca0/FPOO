package Atividades_Susana_Fusca;

public class Visitante {
	//atributos
	private String nome;
	private int idade;
	private double altura;
	
	//construtor padrão
	Visitante(){
	}
	
	//construtor com parâmetros
	Visitante(String nome, int idade, double altura){
		this.nome = nome;
		this.idade =idade;
		this.altura = altura;
	}
	
	//getters e setters
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private int getIdade() {
		return idade;
	}
	private void setIdade(int idade) {
		this.idade = idade;
	}
	private double getAltura() {
		return altura;
	}
	private void setAltura(double altura) {
		this.altura = altura;
	}
	
	//métodos especiais
	public boolean podeAndarNoBrinquedo() {
		if(idade >= 10 && altura >= 1.50){
			System.out.println("pode ir no brinquedo");
			return true;
		}
		else{
			System.out.println("nao pode ir no brinquedo");
			return false;
		}
	}
	public void exibirInfo() {
		System.out.println("Informacoes do visitante");
		System.out.println("Visitante: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
	}
}
