package Atividades_Susana_Fusca;

public class Doce extends ProdutoPadaria{
	Doce(){
		super();
	}
	Doce(String nome, double preco){
		super.getNome();
		super.getPreco();
	}
	//metodo exibir
	@Override
	public void exibir() {
		System.out.println("O nome do doce e: " + getNome());
		System.out.println("O preco do doce e: " + getPreco());
	}
}
