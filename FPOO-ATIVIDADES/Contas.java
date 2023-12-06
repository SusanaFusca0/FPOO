package Atividades_Susana_Fusca;

import java.util.Scanner;

public class Contas {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Valor do montante:");int v = entrada.nextInt();
		System.out.println("Conta do acougue:");int a = entrada.nextInt();
		System.out.println("Conta da farmacia:");int f = entrada.nextInt();
		System.out.println("Conta da padaria:");int p = entrada.nextInt();
		
		if(v >= a + f + p){
			System.out.println("todas as contas podem ser pagas");
		}
		else if(v >= a + f || v >= a + p || v >= p + f){
			System.out.println("duas contas podem ser pagas");
		}
		else if(v >= a || v >= f || v >= p) {
			System.out.println("uma conta pode ser paga");
		}
		else {
			System.out.println("nenhuma conta pode ser paga");
		}
	}

}
