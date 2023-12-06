package Atividades_Susana_Fusca;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Brinquedo {
	//atributos
	private String nome;
	private double alturaMinima;
	private int capacidadeMaxima;
	
	//construtor padrão
	Brinquedo(){
		
	}
	//construtor com parâmetros
	Brinquedo(String nome, double alturaMinima, int capacidadeMaxima){
		this.nome = nome;
		this.alturaMinima = alturaMinima;
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	//getters e setter
	private String getNome() {
		return nome;
	}
	private void setNome(String nome) {
		this.nome = nome;
	}
	private double getAlturaMinima() {
		return alturaMinima;
	}
	private void setAlturaMinima(double altura) {
		this.alturaMinima = altura;
	}
	private float getCapacidadeMaxima() {
		return (int) capacidadeMaxima;
	}
	private void setCapacidadeMaxima(int capacidadeMaxima) {
		this.capacidadeMaxima = capacidadeMaxima;
	}
	
	//métodos especiais
	public void exibirInfo() {
		System.out.println("Informacoes do brinquedo:");
		System.out.println("Nome: " + nome);
		System.out.println("Altura Minima: " + alturaMinima);
		System.out.println("Capacidade Maxima: " + capacidadeMaxima);
	}
}
