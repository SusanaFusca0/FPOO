package Atividades_Susana_Fusca;

public class ProdutoPadaria implements Produto{
	//atributos
	private String nome;
	private double preco;
	//construtor padrao
	ProdutoPadaria(){
	}
	//construtor c/ parametros
	ProdutoPadaria(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}
	@Override
	public String getNome() {
		return nome;
	}
	@Override
	public double getPreco() {
		return preco ;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public void setPreco(double preco) {
		this.preco = preco;
	}
	//metodo exibir
	public void exibir() {
		System.out.println("O nome do produto e: " + getNome());
		System.out.println("O preco do produto e: " + getPreco());
	}
}
