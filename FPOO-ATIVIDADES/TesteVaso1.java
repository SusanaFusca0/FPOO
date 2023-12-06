package Atividades_Susana_Fusca;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteVaso1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
				ArrayList<VasoDecorado> vasoos = new ArrayList<>();
				for(int i = 0; i < 4; i ++) {
					System.out.println("Vamos montar o vaso " + (i + 1) + ":" );
					System.out.println("Escolha o tipo do vaso " + "(Simples ou Decorado)");
					String tipo = entrada.nextLine();
					Vaso vaso;
					if(tipo.equalsIgnoreCase("Simples")) {
						vaso = new Vaso ();
						System.out.println("Cor: ");
						String cor = entrada.nextLine();
						System.out.println("Tamanho: ");
						String tamanho = entrada.nextLine();
						System.out.println("Material: ");
						String material = entrada.nextLine();
						vaso.exibir();
					}else if(tipo.equalsIgnoreCase("Decorado")) {
						vaso = new VasoDecorado ();
						System.out.println("Cor: ");
						String cor = entrada.nextLine();
						System.out.println("Tamanho: ");
						String tamanho = entrada.nextLine();
						System.out.println("Material: ");
						String material = entrada.nextLine();
						System.out.println("Decoracao: ");
						String decoracao = entrada.nextLine();
						vaso.exibir();
					}else {
						System.out.println("Tipo de vaso inválido");
						vaso = new Vaso ();
					}
					vasoos.add((VasoDecorado) vaso);
				}//fim for	
	}//fim main
}//fim class
