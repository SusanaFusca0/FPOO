package Atividades_Susana_Fusca;
import java.util.Scanner;
public class Q2 {

	public static void main(String[] args) {
		int numero;
		int menor = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite um numero (digite 0 para parar): ");
		boolean primeiro_numero = true;
		while (true) {
			numero = scanner.nextInt();
			if (numero == 0) {
				break;
				}
			if (primeiro_numero) {
				menor = numero;
				primeiro_numero = false;
			}else if (numero < menor) {
				menor = numero;
			}
		}//fim while
		if(primeiro_numero) {
			System.out.println("nenhum numero foi digitado");
		}else {
			System.out.println("o menor numero digitado foi:" + menor);
		}
	}
}