package Atividades_Susana_Fusca;
import java.util.Scanner;
public class Q3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num_aleatorio = (int) (Math.random()*30)+1;
		System.out.println("numero gerado: " + num_aleatorio);
		int contador = 0;
		int numero;
		System.out.println("adivinhe o numero de 1 a 30");
		do {
			numero = entrada.nextInt();
			contador++;
			if(numero > num_aleatorio) {
				System.out.println("digite um numero menor");
			}else if(numero < num_aleatorio) {
				System.out.println("digite um numero maior");
			}else if(numero == num_aleatorio){
				System.out.println("voce acertou");
			}
		} while(numero != num_aleatorio);
	}
}
