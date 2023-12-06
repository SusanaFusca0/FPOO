package Atividades_Susana_Fusca;

import java.util.Scanner;

public class TesteBike {

	public static void main(String[] args) {
		//atributo
		int a = 0;
		//scanner
		Scanner entrada = new Scanner(System.in);
		//instanciando obj da class people
		People p1 = new People();
		a = 1;
		while(a < 3) {
			System.out.println("Digite o nome da " + a + " pessoa que ira pedalar: ");
			p1.nome = entrada.next();
			System.out.println("Escolha qual bike vai usar:");
			System.out.println("1 - SpeedBike");
			System.out.println("2 - MountainBike");
			int i = 0;
			i = entrada.nextInt();
			switch(i) {
				case (1):
					System.out.println("Voce escolheu a SpeedBike");
					break;
				case (2):
					System.out.println("Voce escolheu a MountainBike");
					break;
			}//fim switch
			SpeedBike bike1 = new SpeedBike();
			System.out.println(p1.nome + " subiu na bike");
			System.out.println(p1.nome + " comecou a pedalar");
			bike1.mudarMarcha();
			bike1.acelerar();
			System.out.println("Em que velocidade a bike esta:");
			bike1.setVelocidade(entrada.nextInt());
			bike1.frear();
			System.out.println("Em que velocidade a bike esta:");
			bike1.setVelocidade(entrada.nextInt());
			bike1.estado();
			System.out.println("------------------------------------------------------------------------------------");
			a ++;//forma para ir para a pessoa 2
		}
	}//fim main
}//fim class
