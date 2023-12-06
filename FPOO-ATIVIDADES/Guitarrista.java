package Atividades_Susana_Fusca;

public class Guitarrista extends MembroBanda{
	//contrutores
		Guitarrista(){
			
		}
		Guitarrista(String nome){
			super.getNome();
		}
		@Override
		public void tocar() {
			System.out.println("O membro " + getNome() + " esta tocando");
		}
}
