package br.org.sesisp.view;

import javax.swing.JOptionPane;
import br.org.sesisp.dao.CrudDAO;
import br.org.sesisp.model.Aluno;

public class TelaMain {

	public static void main(String[] args) {
		CrudDAO inserir_aluno = new CrudDAO();
		Aluno aluno1 = new Aluno();
		int i = 0;
		while(i < 5) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que voce deseja fazer: \n1 - Adicionar aluno\n2 - Atualizar aluno\n3 - Ver lista aluno"
					+ "\n4 - Excluir aluno\n5 - Parar o programa"));
			switch(i){
				case(1):
					aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
					aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
					inserir_aluno.create(aluno1);
					JOptionPane.showMessageDialog(null,"Nome: " + aluno1.getNome() + "\nIdade: " + aluno1.getIdade());
					break;
				case(2):
					aluno1.setNome(JOptionPane.showInputDialog("Digite o nome do aluno: "));
					aluno1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: ")));
					aluno1.setRa(Integer.parseInt(JOptionPane.showInputDialog("Digite o ra do aluno: ")));
					inserir_aluno.update(aluno1);
					JOptionPane.showMessageDialog(null,"Nome: " + aluno1.getNome() + "\nIdade: " + aluno1.getIdade() + "\nRa: " + aluno1.getRa());
					break;
				case(3):
					for(Aluno olho : inserir_aluno.read()){
						JOptionPane.showMessageDialog(null,"Dados do aluno: Nome: " + olho.getNome() + "\nIdade: " + olho.getIdade() + "\nRa: " + olho.getRa());
					}
					break;
				case(4):
					int a = 0;
					a = Integer.parseInt(JOptionPane.showInputDialog("Qual o ra do aluno que voce deseja excluir:"));
					CrudDAO remover_aluno = new CrudDAO();
					remover_aluno.delete(a);
					break;
			}//fim switch
		}//fim while
	}//fim main
}//fim class