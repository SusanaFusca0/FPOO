package Atividades_Susana_Fusca;

public class Vaso {
	//atributos
	private String cor;
	private double tamanho;
	private String material;
	//construtor sem parametro
	Vaso(){
		super();
	}
	//construtor com parametro
	Vaso(String cor, double tamanho, String material){
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
	}
	//getters e setters
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public Double getTamanho() {
		return tamanho;
	}
	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	//metodo
	public void exibir() {
		System.out.println("INFORMACOES DO VASO");
		System.out.println("Cor: " + cor);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Material: " + material);
	}
}
