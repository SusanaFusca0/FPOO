package Atividades_Susana_Fusca;

public class Sala extends Comodo{
	//atributos
	private boolean temTV;
	//construtores
	Sala(){
		
	}
	Sala(boolean temTV, String nome){
		this.temTV=temTV;
		super.getNome();
	}
	//get e set
	public boolean getTemTV() {
		return this.temTV;
	}
	public void setTemTV(boolean temTV) {
		this.temTV=temTV;
	}
	//metodo
	public void metTemTV() {
		if(getTemTV() ==true) {
			System.out.println("Possui TV ");
		}else 
			System.out.println("Nao possui TV ");
	}
	//metodo exibir
	public void exibirInfoSala() {
		System.out.println("Nome da sala: " + getNome());
		System.out.println("Tem TV na sala: "+ getTemTV());
	}
}
