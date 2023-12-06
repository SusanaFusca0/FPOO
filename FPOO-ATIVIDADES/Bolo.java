package Atividades_Susana_Fusca;

public class Bolo extends ProdutoPadaria{
	Bolo(){
		super();
	}
	Bolo(String nome, double preco){
		super.getNome();
		super.getPreco();
	}
	//metodo exibir
	@Override
	public void exibir() {
		System.out.println("O nome do bolo e: " + getNome());
		System.out.println("O preco do bolo e: " + getPreco());
	}
}
