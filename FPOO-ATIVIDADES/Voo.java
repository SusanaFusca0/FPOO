package Atividades_Susana_Fusca;

import java.time.LocalDate;

public class Voo {
	//atributos
	private String numeroVoo;
	private String origem;
	private String destino;
	private double preco;
	private LocalDate dataIda;
	private LocalDate dataVolta;
	//construtores
	Voo(){
		
	}
	Voo(String numeroVoo, String origem, String destino, double preco, LocalDate dataIda, LocalDate dataVolta){
		this.setNumeroVoo(numeroVoo);
		this.setOrigem(origem);
		this.setDestino(destino);
		this.setPreco(preco);
		this.setDataIda(dataIda);
		this.setDataVolta(dataVolta);
	}
	Voo(String numeroVoo, double preco){
		this.setNumeroVoo(numeroVoo);
		this.setPreco(preco);
	}
	//getters e setters
	public String getNumeroVoo() {
		return this.numeroVoo;
	}
	public void setNumeroVoo(String numeroVoo) {
		this.numeroVoo = numeroVoo;
	}
	public String getOrigem() {
		return this.origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return this.destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public LocalDate getDataIda() {
		return this.dataIda;
	}
	public void setDataIda(LocalDate dataIda) {
		this.dataIda = dataIda;
	}
	public LocalDate getDataVolta() {
		return this.dataVolta;
	}
	public void setDataVolta(LocalDate dataVolta) {
		this.dataVolta = dataVolta;
	}
	//metodo
	public void mostrarDetalhes() {
		System.out.println("Numero voo: " + numeroVoo);
		System.out.println("Origem: " + origem);
		System.out.println("Destino: " + destino);
		System.out.println("Preco: " + preco);
		System.out.println("Data ida: " + dataIda);
		System.out.println("Data volta: " + dataVolta);
	}
		
}
