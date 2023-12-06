package Atividades_Susana_Fusca;

import java.util.Scanner;

public class Aluno extends Pessoa {
	//scanner
	Scanner entrada = new Scanner(System.in);
	
	//atributos
	private String curso;
	private float nota;
	private int calcularMedia;
	public float media = 0;
	
	//construtor
	Aluno(){
		super();
	}
	Aluno(String nome, String endereco, int telefone, int cpf, int celular, String curso, float nota){
		super.getNome();
		super.getEndereco();
		super.getTelefone();
		super.getCpf();
		super.getCelular();
		this.curso = curso;
		this.nota = nota;
	}
		
	//metodos getters e setters
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public String getCurso() {
		return curso;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public float getNota() {
		return nota;
	}
	
	//metodos especiais
	public void calcularMedia() {
		System.out.println("Primeira nota: ");
		nota = entrada.nextFloat();
		System.out.println("Segunda nota: ");
		nota = entrada.nextFloat();
		media = ((nota + nota)/2);
		System.out.println("Sua media e: " + media);
	}
	public void situacaoFinal() {
		if(media <= 7) {
			System.out.println("Situacao final: reprovado=(");
		}
		else {
			System.out.println("Situacao final:aprovado=)");
		}
	}
}
