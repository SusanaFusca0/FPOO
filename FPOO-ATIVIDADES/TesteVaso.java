package Atividades_Susana_Fusca;

import java.util.Scanner;

public class TesteVaso {

	public static void main(String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
		//intancia do obj da class vaso
		Vaso v1 = new Vaso();
		System.out.println("Informe os dados do vaso simples");
		System.out.println("Digite a cor do vaso: " );
		v1.setCor(entrada.next());
		System.out.println("Digite o tamanho do vaso: ");
		v1.setTamanho(entrada.nextDouble());
		System.out.println("Digite o material do vaso: " );
		v1.setMaterial(entrada.next());
		v1.exibir();
		System.out.println("--------------------------------------------------");
		//intancia do obj da class vaso decorado
		VasoDecorado vd1 = new VasoDecorado();
		System.out.println("Informe os dados do vaso decorado");
		System.out.println("Digite a cor do vaso: ");
		vd1.setCor(entrada.next());
		System.out.println("Digite o tamanho do vaso: ");
		vd1.setTamanho(entrada.nextDouble());
		System.out.println("Digite o material do vaso: ");
		vd1.setMaterial(entrada.next());
		System.out.println("Digite a decoracao do vaso: ");
		vd1.setDecoracao(entrada.next());
		vd1.exibir();
	}
}