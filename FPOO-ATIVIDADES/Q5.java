package Atividades_Susana_Fusca;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int operacao;
		do {
			exibirMenu(); //método (acao) construido fora do main
			operacao = entrada.nextInt();
			double resultado;
			switch(operacao) {
				case 1:
					System.out.println("operacao: adicao");
					System.out.println("digite o 1° numero:");
					double num1 = entrada.nextInt();
					System.out.println("digite o 2° numero:");
					double num2 = entrada.nextInt();
					resultado = num1 + num2;
					System.out.println("resultado:" + resultado);
					break;
				case 2:
					System.out.println("operacao: subtracao");
					System.out.println("digite o 1° numero:");
					double numm1 = entrada.nextInt();
					System.out.println("digite o 2° numero:");
					double numm2 = entrada.nextInt();
					resultado = numm1 - numm2;
					System.out.println("resultado:" + resultado);
					break;
				case 3:
					System.out.println("operacao: multiplicacao");
					System.out.println("digite o 1° numero:");
					double nuum1 = entrada.nextInt();
					System.out.println("digite o 2° numero:");
					double nuum2 = entrada.nextInt();
					resultado = nuum1 * nuum2;
					System.out.println("resultado:" + resultado);
					break;
				case 4:
					System.out.println("operacao: divisao");
					System.out.println("digite o 1° numero:");
					double nnum1 = entrada.nextInt();
					System.out.println("digite o 2° numero:");
					double nnum2 = entrada.nextInt();
					resultado = nnum1 / nnum2;
					System.out.println("resultado:" + resultado);
					break;
			}
			System.out.println();
		}while(operacao != 0);
		

	}//fim main
	//metodo para exibir o menu (fora do main)
		public static void exibirMenu() {
			System.out.println("Selecione uma operacao:");
			System.out.println("1 - operacao 1");
			System.out.println("2 - operacao 2");
			System.out.println("3 - operacao 3");
			System.out.println("4 - operacao 4");
		}
}//fim classe
