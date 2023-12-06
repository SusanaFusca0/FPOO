package Atividades_Susana_Fusca;

import java.util.Scanner;

public class Cliente {
	//scanner
	Scanner entrada = new Scanner(System.in);
	
	//atributos
	public String cpf;
	public String nome;
	public String telefone;
	public String idade;
	public double peso;
	public double altura;
	
	//métodos getters e setters
	public double getPeso() {
		return peso;
	}
	public void setPeso(double p) {
		peso = p;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double a) {
		altura = a;
	}
	
	//métodos especiais
	public void CalcularImc () {
		
		double IMC = peso/(altura*altura);
		
		if(IMC <= 18.5) {
			System.out.println("magreza");
		}else if(IMC > 18.5 && IMC <= 24.9) {
			System.out.println("normal");
		}else if(IMC >= 25 && IMC <= 29.9) {
			System.out.println("sobrepeso");
		}
	}
	
	public void CalcularPesoDesejado() {
		float CalcularPesoDesejado = entrada.nextInt();
		if(CalcularPesoDesejado < peso) {
			System.out.println("Deve emagrecer: " + (peso - CalcularPesoDesejado));
		}else if(peso > CalcularPesoDesejado) {
			System.out.println("Deve engordar: " + (CalcularPesoDesejado - peso));
		}
	}
	
	public void imprimirDados() {
		System.out.println("Dados do cliente");
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Telefone: " + telefone);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
		System.out.println("Altura: " + altura);
	}
	
}//fechamento class
