package Atividades_Susana_Fusca;

public class Baixista extends MembroBanda{
	//contrutores
		Baixista(){
			
		}
		Baixista(String nome){
			super.getNome();
		}
		@Override
		public void tocar() {
			System.out.println("O membro " + getNome() + " esta tocando");
		}
}
