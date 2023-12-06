package Atividades_Susana_Fusca;

import java.util.Scanner;

public class Var {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		
		if(x<-8 || x>8 || y<0 || y>8) {
			System.out.println("A bola esta fora");
		}
		else {
			System.out.println("A bola esta dentro");
		}
	}
}