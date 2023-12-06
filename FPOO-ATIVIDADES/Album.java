package Atividades_Susana_Fusca;

import java.util.Scanner;

public class Album {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("total de figurinhas para completar o album:");
		int n = entrada.nextInt();//numero total de figurinhas para completar o album
		System.out.println("figurinhas que ja comprou:");
		int m = entrada.nextInt();//numero de figurinhas ja compradas
		Boolean[] ja_tenho = new Boolean[n];// true ou false
		int x = 0;// figurinhas repetidas
		//varrendo o vetor
		for(int i = 0; i < n; i++) {
			ja_tenho[i] = false;
		}
		//figurinhas que ja temos
		for(int i = 0; i < m; i++) {
			x = entrada.nextInt();
			ja_tenho[x] = true;
		}
		int repetidas = 0;
		//vamos marcar as repetidas
		for(int i = 0; i < n; i++) {
			if(ja_tenho[i]) {
				repetidas = repetidas ++ ;
			}
		}
		//vamos contar a quantidade de figurinhas repetidas
		System.out.println("quantidade de figurinhas repetidas:" + (n - repetidas));
		System.out.println("tamanho album:" + n);
		System.out.println("quantidade de figurinhas:" + m);
	}
}