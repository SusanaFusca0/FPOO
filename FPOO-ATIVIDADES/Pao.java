package Atividades_Susana_Fusca;

public class Pao extends ProdutoPadaria{
	Pao(){
		super();
	}
	Pao(String nome, double preco){
		super.getNome();
		super.getPreco();
	}
	//metodo exibir
	@Override
	public void exibir() {
		System.out.println("O nome do pao e: " + getNome());
		System.out.println("O preco do pao e: " + getPreco());
	}
}
