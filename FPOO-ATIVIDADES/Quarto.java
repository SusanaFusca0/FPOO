package Atividades_Susana_Fusca;

public class Quarto extends Comodo {
	//atributos
	private int numeroCamas;
	//construtores
	Quarto(){
		
	}
	Quarto(int numeroCamas, String nome){
		this.numeroCamas=numeroCamas;
		super.getNome();
	}
	//get e set
	public void setNumeroCamas(int numeroCamas) {
		this.numeroCamas=numeroCamas;
	}
	public int getNumeroCamas() {
		return this.numeroCamas;
	}
	//metodo
	public void exibirInfoQuarto() {
		System.out.println("Nome do quarto: "  + getNome());
		System.out.println("Quantidade de camas no quarto: " + numeroCamas);
	}
}
