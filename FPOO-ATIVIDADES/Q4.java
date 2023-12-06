package Atividades_Susana_Fusca;
import java.util.Scanner;
public class Q4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Vamos calcular o MMC de dois numeros!");
		System.out.println("Digite o primeiro numero:");
		int num1 = entrada.nextInt();
		System.out.println("Digite o segundo numero:");
		int num2 = entrada.nextInt();
		int mmc = calcularMMC(num1,num2);
		System.out.println("o MMC de " + num1 + " e " + num2 +" resulta em:" + mmc);
	}
	
	//metodo chamado calcular mmc
	public static int calcularMMC (int num1, int num2) {
		int maior = Math.max(num1, num2);
		int mmc = maior;
		while(true) {
			if(mmc % num1 == 0 && mmc % num2 == 0) {
				break;
			}
			mmc = mmc + maior;
		}
		return mmc;
	}
		
}
