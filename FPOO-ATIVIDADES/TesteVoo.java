package Atividades_Susana_Fusca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TesteVoo {

	public static void main(String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
		//funcionamento local date
		LocalDate dataIda = null;
		LocalDate dataVolta = null;
		//instanciando passageiro
		Passageiro passageiro1 = new Passageiro();
		System.out.println("Insira seus dados:");
		System.out.println("Nome: ");
		passageiro1.setNome(entrada.next());
		System.out.println("Sobrenome: ");
		passageiro1.setSobrenome(entrada.next());
		System.out.println("Email:");
		passageiro1.setEmail(entrada.next());
		//instanciando voo 1
		Voo voo1 = new Voo("EA598521GT33", 1500f);
		System.out.println("Insira os dados da sua 1 passagem: ");
		System.out.println("Origem:");
		voo1.setOrigem(entrada.next());
		System.out.println("Destino:");
		voo1.setDestino(entrada.next());
		System.out.println("Data ida(dd-MM-yyyy):");
		String dataI = entrada.next();
		dataIda = LocalDate.parse (dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Data volta(dd-MM-yyyy):");
		String dataV = entrada.next();
		dataVolta = LocalDate.parse (dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("--------------------------------PASSAGEM-------------------------------------");
		Passagem passagem1 = new Passagem();
		System.out.println("Nome: " + passageiro1.getNome() + "\nSobrenome: " + passageiro1.getSobrenome() + "\nNumero do voo: " + voo1.getNumeroVoo() +
					"\nOrigem do voo: " + voo1.getOrigem() + "\nDestino do voo: " + voo1.getDestino() + "\nPreco do voo: " + (voo1.getPreco()+voo1.getPreco()));
		System.out.println("----------------------------------------------------------------------------------------");
		//instanciando voo 2
		Voo voo2 = new Voo("GH52LO6348", 2500f);
		System.out.println("Insira os dados da sua 2 passagem: ");
		System.out.println("Origem:");
		voo2.setOrigem(entrada.next());
		System.out.println("Destino:");
		voo2.setDestino(entrada.next());
		System.out.println("Data ida(dd-MM-yyyy):");
		String dataI1 = entrada.next();
		dataIda = LocalDate.parse (dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Data volta(dd-MM-yyyy):");
		String dataV1 = entrada.next();
		dataVolta = LocalDate.parse (dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("--------------------------------PASSAGEM-------------------------------------");
		Passagem passagem2 = new Passagem();
		System.out.println("Nome: " + passageiro1.getNome() + "\nSobrenome: " + passageiro1.getSobrenome() + "\nNumero do voo: " + voo2.getNumeroVoo() +
							"\nOrigem do voo: " + voo2.getOrigem() + "\nDestino do voo: " + voo2.getDestino() + "\nPreco do voo: " + (voo2.getPreco()+voo2.getPreco()));
		System.out.println("----------------------------------------------------------------------------------------");
		//instanciando voo 3
		Voo voo3 = new Voo("EWT46850HTF", 3500f);
		System.out.println("Insira os dados da sua 3 passagem: ");
		System.out.println("Origem:");
		voo3.setOrigem(entrada.next());
		System.out.println("Destino:");
		voo3.setDestino(entrada.next());
		System.out.println("Data ida(dd-MM-yyyy):");
		String dataI2 = entrada.next();
		dataIda = LocalDate.parse (dataI, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("Data volta(dd-MM-yyyy):");
		String dataV2 = entrada.next();
		dataVolta = LocalDate.parse (dataV, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
		System.out.println("--------------------------------PASSAGEM-------------------------------------");
		Passagem passagem3 = new Passagem();
		System.out.println("Nome: " + passageiro1.getNome() + "\nSobrenome: " + passageiro1.getSobrenome() + "\nNumero do voo: " + voo3.getNumeroVoo() +
							"\nOrigem do voo: " + voo3.getOrigem() + "\nDestino do voo: " + voo3.getDestino() + "\nPreco do voo: " + (voo3.getPreco()+voo3.getPreco()));
		System.out.println("----------------------------------------------------------------------------------------");
	}//fim main
}//fim class
