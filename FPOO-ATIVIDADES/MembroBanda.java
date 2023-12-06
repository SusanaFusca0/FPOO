package Atividades_Susana_Fusca;

public class MembroBanda {
	//atributos
	private String nome;
	//construtores
	MembroBanda(){
		
	}
	MembroBanda(String nome){
		this.setNome(nome);
	}
	//get e set
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	//metodo especial
	public void tocar() {
		System.out.println("O membro " + getNome() + " esta tocando");
	}
}
