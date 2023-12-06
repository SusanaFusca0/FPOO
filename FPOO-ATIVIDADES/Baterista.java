package Atividades_Susana_Fusca;

public class Baterista extends MembroBanda{
	//contrutores
		Baterista(){
			
		}
		Baterista(String nome){
			super.getNome();
		}
		@Override
		public void tocar() {
			System.out.println("O membro " + getNome() + " esta tocando");
		}
}
