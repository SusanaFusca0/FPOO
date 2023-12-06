package Atividades_Susana_Fusca;

import java.util.Scanner;

public class TesteParque {
	
	public static void main (String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
				
		//instanciando objetos da classe brinquedo
		System.out.println("Informe os dados do brinquedo 1");
		System.out.println("Nome: ");
		String nomeb1 = entrada.nextLine();
		System.out.println("Altura Minima: ");
		double alturaMinimab1 = entrada.nextDouble();
		System.out.println("Capacidade Maxima: ");
		int capacidadeMaximab1 = entrada.nextInt();
		Brinquedo b1 = new Brinquedo(nomeb1, alturaMinimab1, capacidadeMaximab1);
		
		System.out.println("Informe os dados do brinquedo 2");
		System.out.println("Nome: ");
		String nomeb2 = entrada.nextLine();
		System.out.println("Altura Minima: ");
		double alturaMinimab2 = entrada.nextDouble();
		System.out.println("Capacidade Maxima: ");
		int capacidadeMaximab2 = entrada.nextInt();
		Brinquedo b2 = new Brinquedo(nomeb2, alturaMinimab2, capacidadeMaximab2);
		
		//instanciando objetos da classe visitante
		System.out.println("Informe os dados do visitante 1");
		System.out.println("Nome: ");
		entrada.nextLine();
		String nomev1 = entrada.nextLine();
		System.out.println("Idade: ");
		int idadev1 = entrada.nextInt();
		System.out.println("Altura: ");
		double alturav1 = entrada.nextDouble();
		Visitante v1 = new Visitante(nomev1, idadev1, alturav1);
		
		System.out.println("Informe os dados do visitante 2");
		System.out.println("Nome: ");
		entrada.nextLine();
		String nomev2 = entrada.nextLine();
		System.out.println("Idade: ");
		int idadev2 = entrada.nextInt();
		System.out.println("Altura: ");
		double alturav2 = entrada.nextDouble();
		Visitante v2 = new Visitante(nomev2, idadev2, alturav2);
		
		//exibir info 1
		b1.exibirInfo();
		v1.exibirInfo();
		//testando se pode andar no brinquendo
		v1.podeAndarNoBrinquedo();
		
		//exibir info 2
		b2.exibirInfo();
		v2.exibirInfo();
		//testando se pode andar no brinquendo
		v2.podeAndarNoBrinquedo();
	}
}
