package Atividades_Susana_Fusca;
import java.util.Scanner;
public class Q1 {

	public static void main(String[] args) {
		int num;
		int soma=0;
		Scanner entrada = new Scanner(System.in);
		while(true) {
			System.out.println("digite numeros positivos para realizar uma soma:");
			num = entrada.nextInt();
			if(num <= 0) {
				break;
			}
			soma = soma + num;
		}//fim while
		System.out.println("resultado da soma:" + soma);
	}//fim main
}//fim classe
