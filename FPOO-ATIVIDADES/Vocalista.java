package Atividades_Susana_Fusca;

public class Vocalista extends MembroBanda{
	//contrutores
	Vocalista(){
		
	}
	Vocalista(String nome){
		super.getNome();
	}
	@Override
	public void tocar() {
		System.out.println("O membro " + getNome() + " esta tocando");
	}
}
