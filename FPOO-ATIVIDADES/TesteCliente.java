package Atividades_Susana_Fusca;

import java.util.Scanner;

public class TesteCliente {

	public static void main(String[] args) {
		//instanciando objetos da classe cliente
		Cliente c1 = new Cliente();
		
		//scanner
		Scanner entrada = new Scanner(System.in);
		
		//atribuindo valores
		System.out.println("Nome do cliente: ");
		c1.nome = entrada.next();
		System.out.println("Cpf do cliente: ");
		c1.cpf = entrada.next();
		System.out.println("Telefone do cliente: ");
		c1.telefone = entrada.next();
		System.out.println("Idade do cliente: ");
		c1.idade = entrada.next();
		System.out.println("Peso do cliente: ");
		c1.peso = entrada.nextDouble();
		System.out.println("Altura do cliente: ");
		c1.altura = entrada.nextDouble();
		
		//calculando imc
		c1.CalcularImc();
		
		//calculando peso desejado 
		c1.CalcularPesoDesejado();
		
		//imprimindo dados
		c1.imprimirDados();
		
	}

}
