package br.com.materiaisesportivos.view;

import javax.swing.JOptionPane;
import br.com.materiaisesportivos.dao.CrudDAO;
import br.com.materiaisesportivos.model.Produto;

public class TelaMain {

	public static void main(String[] args) {
		CrudDAO inserir_produto = new CrudDAO();
		Produto produto1 = new Produto();
		int i = 0;
		while(i < 5) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Escolha o que voce deseja fazer(digite o\nnúmero referente a opção desejada): \n1 - Adicionar produto\n2 - Atualizar produto\n"
					+ "3 - Ver lista produto\n4 - Excluir produto\n5 - Parar o programa"));
			switch(i){
				case(1):
					produto1.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
					int categ = (Integer.parseInt(JOptionPane.showInputDialog("Escolha a categoria do produto(digite o\nnúmero referente a opção desejada):\n1 -Anilhas e Halteres\n2-Equipamentos"
							+ "\n3-Roupas\n4-Suplementos\n5-Barra de Proteína")));
					if(categ == 1) {
						produto1.setCategoria("Anilhas e Halteres");
					}else if(categ == 2) {
						produto1.setCategoria("Equipamentos");
					}else if(categ == 3) {
						produto1.setCategoria("Roupas");
					}else if(categ == 4) {
						produto1.setCategoria("Suplementos");
					}else if(categ == 5) {
						produto1.setCategoria("Barra de Proteína");
					}
					produto1.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto: ")));
					inserir_produto.create(produto1);
					JOptionPane.showMessageDialog(null,"Nome: " + produto1.getNome() + "\nCategoria: " + produto1.getCategoria() + 
							"\nPreço: " + produto1.getPreco());
					break;
				case(2):
					produto1.setNome(JOptionPane.showInputDialog("Digite o nome do produto: "));
				int categ1 = (Integer.parseInt(JOptionPane.showInputDialog("Escolha a categoria do Produto:\n1 -Anilhas e Halteres\n2-Equipamentos"
						+ "\n3-Roupas\n4-Suplementos\n5-Barra de Proteína")));
				if(categ1 == 1) {
					produto1.setCategoria("Anilhas e Halteres");
				}else if(categ1 == 2) {
					produto1.setCategoria("Equipamentos");
				}else if(categ1 == 3) {
					produto1.setCategoria("Roupas");
				}else if(categ1 == 4) {
					produto1.setCategoria("Suplementos");
				}else if(categ1 == 5) {
					produto1.setCategoria("Barra de Proteína");
				}
					produto1.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço do produto: ")));
					produto1.setId(Integer.parseInt(JOptionPane.showInputDialog("Digite o id do produto: ")));
					inserir_produto.update(produto1);
					JOptionPane.showMessageDialog(null,"Nome: " + produto1.getNome() + "\nCategoria: " + produto1.getCategoria() + "\nPreço: " 
					+ produto1.getPreco() + "\nId: " + produto1.getId());
					break;
				case(3):
					for(Produto olho : inserir_produto.read()){
						JOptionPane.showMessageDialog(null,"Dados do produto: \nNome: " + olho.getNome() + "\nCategoria: " + olho.getCategoria() + 
								"\nPreço: " + olho.getPreco() + "\nId: " + olho.getId());
					}
					break;
				case(4):
					int a = 0;
					a = Integer.parseInt(JOptionPane.showInputDialog("Qual o id do produto que voce deseja excluir:"));
					CrudDAO remover_produto = new CrudDAO();
					remover_produto.delete(a);
					break;
			}//fim switch
		}//fim while
	}//fim main
}//fim class
