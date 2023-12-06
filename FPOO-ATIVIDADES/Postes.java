package Atividades_Susana_Fusca;

import java.util.Scanner;

public class Postes {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Numero de postes:");
		int n = entrada.nextInt();//numero de postes
		
		int substituidos = 0;
		int consertados = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.println("Tamanho dos postes:");
			int x = entrada.nextInt(); //tamanho dos postes
			if (x < 50) {
				substituidos++;
			}
			if (50 >= x && x < 85) {
				consertados++;
			}
		}
		System.out.println("Postes que devem ser substituidos:" + substituidos);
		System.out.println("Postes que devem ser concertados:" + consertados);
	}

}
