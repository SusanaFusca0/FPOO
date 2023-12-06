package Atividades_Susana_Fusca;

import java.util.Scanner;

public class TestePadaria {

	public static void main(String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
		//instanciando objetos
		//PESSOAA
		Pessoaa pes = new Pessoaa();
		System.out.println("Coloque seu nome: ");
		pes.setNome(entrada.next());
		System.out.println("Escolha os produtos " +  pes.nome);
		//PÃO
		ProdutoPadaria p1 = new Pao();
		System.out.println("Coloque o nome do pao: ");
		p1.setNome(entrada.next());
		System.out.println("Coloque o preco do  pao: ");
		p1.setPreco(entrada.nextDouble());
		//BOLO
		ProdutoPadaria b1 = new Bolo();
		System.out.println("Coloque o nome do bolo: ");
		b1.setNome(entrada.next());
		System.out.println("Coloque o preco do bolo: ");
		b1.setPreco(entrada.nextDouble());
		//DOCE
		ProdutoPadaria d1 = new Doce();
		System.out.println("Coloque o nome do doce: ");
		d1.setNome(entrada.next());
		System.out.println("Coloque o preco do doce: ");
		d1.setPreco(entrada.nextDouble());
		System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
		//exibindo info
		System.out.println("INFORMACOES");
		pes.exibirNome();
		p1.exibir();
		b1.exibir();
		d1.exibir();
		pes.comer();
		System.out.println("A compra deu: " + (p1.getPreco() + b1.getPreco() + d1.getPreco()));
		System.out.println("Volte sempre!!!");
	}

}
