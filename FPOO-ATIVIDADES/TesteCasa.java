package Atividades_Susana_Fusca;

import java.util.Scanner;

public abstract class TesteCasa {

	public static void main(String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
		//instanciando casa
		Casa casa1 = new Casa();
		//colocando valores no atributos
		System.out.println("Digite as informacoes da casa:");
		System.out.println("Cor:");
		casa1.setCor(entrada.nextLine());
		System.out.println("Preco:");
		casa1.setPreco(entrada.nextFloat());
		System.out.println("Metragem:");
		casa1.setMetragem(entrada.nextFloat());
		System.out.println("Escolha o comodo que ira montar " + "(quarto ou sala):");
		//instanciando comodo(sala e quarto)
		Comodo c1 = new Comodo();
		String tipo = entrada.next();
		Quarto q1 = new Quarto();
		Sala s1 = new Sala();
		if(tipo.equalsIgnoreCase("Quarto")) {
			System.out.println("Qual o nome do quarto:");
			q1.setNome(entrada.next());
			System.out.println("Quantas camas tem no quarto:");
			q1.setNumeroCamas(entrada.nextInt());
			System.out.println("Agora vamos montar a sala...");
			System.out.println("Qual o nome da sala:");
			s1.setNome(entrada.next());
			System.out.println("Tem TV na sala:");
			s1.setTemTV(entrada.nextBoolean());
			s1.metTemTV();
		}else if(tipo.equalsIgnoreCase("Sala")) {
			System.out.println("Qual o nome da sala:");
			s1.setNome(entrada.next());
			s1.metTemTV();
			System.out.println("Tem TV na sala:");
			s1.setTemTV(entrada.nextBoolean());
			System.out.println("Agora vamos montar o quarto...");
			System.out.println("Qual o nome do quarto:");
			q1.setNome(entrada.next());
			System.out.println("Quantas camas tem no quarto:");
			q1.setNumeroCamas(entrada.nextInt());
		}
		System.out.println("-----------------------------------------------------------------------------------------------");
		casa1.exibirInfo();
		q1.exibirInfoQuarto();
		s1.exibirInfoSala();
	}

}
