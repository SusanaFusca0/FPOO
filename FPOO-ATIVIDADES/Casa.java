package Atividades_Susana_Fusca;

public class Casa {
	//atributos
	private String cor;
	private float preco;
	private float metragem;
	//construtores
	Casa(){
		System.out.println("Voce criou uma casa...");
	}
	Casa(String cor, float preco, float metragem){
		this.setCor(cor);
		this.setPreco(preco);
		this.setMetragem(metragem);
	}
	//getters e setters
	public String getCor() {
		return this.cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getPreco() {
		return this.preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	public float getMetragem() {
		return this.metragem;
	}
	public void setMetragem(float metragem) {
		this.metragem = metragem;
	}
	//metodo
	public void exibirInfo() {
		System.out.println("INFORMACOES GERAIS DA CASA");
		System.out.println("Cor da casa: " + cor);
		System.out.println("Preco da casa: " + preco);
		System.out.println("Metragem da casa: " + metragem);
	}
}
