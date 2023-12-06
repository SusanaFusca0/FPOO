package Atividades_Susana_Fusca;

public class VasoDecorado extends Vaso{
	//atributos
	private String decoracao;
	//construtor sem parametro
	VasoDecorado(){
		
	}
	//construtor com parametro
	VasoDecorado(String cor, double tamanho, String material, String decoracao){
		super(cor, tamanho, decoracao);
		this.decoracao = decoracao;
	}
	//getters e setters
	public String getDecoracao() {
		return decoracao;
	}
	public void setDecoracao(String decoracao) {
		this.decoracao = decoracao;
	}
	//metodo
	public void exibir() {
		System.out.println("INFORMACOES DO VASO DECORADO");
		System.out.println("Cor: " + getCor() );
		System.out.println("Tamanho: " + getTamanho());
		System.out.println("Material: " + getMaterial());
		System.out.println("Decoracao: " + getDecoracao());
	}
}
