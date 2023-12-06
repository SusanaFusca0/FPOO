package Atividades_Susana_Fusca;

import java.util.Scanner;

public class MountainBike implements Veiculo{
	//scanner
	Scanner entrada = new Scanner(System.in);
	//atributos
	public int velocidade;
	public int marcha;
	//construtor padrao
	MountainBike(){
	}
	//construtor c/ parametro
	MountainBike(int velocidade, int marcha){
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	//getters e setters
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}
	public int marcha() {
		return marcha;
	}
	@Override
	public int mudarMarcha() {
		System.out.println("Voce quer colocar qual marcha(2, 3 ou 4): ");
		switch (marcha = entrada.nextInt()) {
		case (2):
			System.out.println("Voce escolheu a segunda marcha");
			break;
		case (3):
			System.out.println("Voce escolheu a terceira marcha");
			break;
		case (4):
			System.out.println("Voce escolheu a quarta marcha");
			break;
		}
		return marcha;
	}
	@Override
	public void acelerar() {
		System.out.println("Esta acelerando...");
	}
	@Override
	public void frear() {
		System.out.println("Esta freando...");
	}
	//metodo
	public void estado() {
		if(velocidade > 0){
			System.out.println("A bike esta em movimento");
		}else if(velocidade <= 0) {
			System.out.println("A bike esta parada");
		}
	}
	
}
