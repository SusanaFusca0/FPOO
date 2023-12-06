package Atividades_Susana_Fusca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banda{
	//scanner
	Scanner entrada = new Scanner(System.in);
	//atributos
	private String nome;
	private List <MembroBanda>membros;
	//construtores
	Banda(){
		
	}
	Banda(String nome, List<MembroBanda>membros){
		this.setNome(nome);
		this.setMembros(membros);
	}
	//getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List <MembroBanda> getMembros() {
		return this.membros;
	}
	public void setMembros(List <MembroBanda> membros) {
		this.membros = membros;
	}
	MembroBanda membroEspecial = new MembroBanda();
	//metodos especiais
	public void adicionarMembro() {
		System.out.println("Qual o nome do novo membro:");
		membroEspecial.setNome(entrada.next());
	}
	public void nomeMembroEspecial() {
		ArrayList<MembroBanda> listinha= new ArrayList<MembroBanda>();
		listinha.add(membroEspecial);
		for(MembroBanda olho : listinha) {
			System.out.println(olho.getNome());
		}
	}
	public void realizarShow() {
		System.out.println("A BANDA " + getNome( ) + " ESTA REALIZANDO UM SHOW!");
	}
}
