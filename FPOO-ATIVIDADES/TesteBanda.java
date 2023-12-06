package Atividades_Susana_Fusca;

import java.util.ArrayList;
import java.util.Scanner;

public class TesteBanda {

	public static void main(String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
		//instanciando banda
		Banda banda1 = new Banda();
		//instanciando os membros da banda
		MembroBanda v1 = new Vocalista();
		MembroBanda bx1 = new Baixista();
		MembroBanda bt1 = new Baterista();
		MembroBanda g1 = new Guitarrista();
		//atribuindo valores
		System.out.println("Insira o nome da banda:");
		banda1.setNome(entrada.next());
		System.out.println("Agora insira os nomes de cada membro da banda:");
		System.out.println("Vocalista:");
		v1.setNome(entrada.next());
		System.out.println("Baixista:");
		bx1.setNome(entrada.next());
		System.out.println("Baterista:");
		bt1.setNome(entrada.next());
		System.out.println("Guitarrista:");
		g1.setNome(entrada.next());
		//metodo adicionar membro
		System.out.println("Voce quer adicionar mais algum membro a banda?");
		String tipo = entrada.next();
		if(tipo.equalsIgnoreCase("sim")) {
			banda1.adicionarMembro();
			ArrayList<MembroBanda> listinha= new ArrayList<MembroBanda>();
			listinha.add(v1);
			listinha.add( bx1);
			listinha.add(bt1);
			listinha.add(g1);
			System.out.println("Os membros da banda sao: ");
			for(MembroBanda olho : listinha) {
				System.out.println(olho.getNome());
				}
			banda1.nomeMembroEspecial();
		}else if(tipo.equalsIgnoreCase("nao")) {
		ArrayList<MembroBanda> listinha= new ArrayList<MembroBanda>();
		listinha.add(v1);
		listinha.add( bx1);
		listinha.add(bt1);
		listinha.add(g1);
		System.out.println("Os membros da banda sao: ");
		for(MembroBanda olho : listinha) {
			System.out.println(olho.getNome());
			}//fim for
		}//fim list
		System.out.println("Os membros estao comecando a tocar...");
		v1.tocar();
		bx1.tocar();
		bt1.tocar();
		g1.tocar();
		banda1.realizarShow();
	}

}
