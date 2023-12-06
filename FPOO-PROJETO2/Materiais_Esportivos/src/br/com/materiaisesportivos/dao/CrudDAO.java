package br.com.materiaisesportivos.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import com.mysql.jdbc.PreparedStatement;
import br.com.materiaisesportivos.controller.Conexao;
import br.com.materiaisesportivos.model.Produto;

public class CrudDAO {
	//CRUD C-Create R-Read U-Upload D-Delete
	
		//CREATE (inserir dados)
		public <Produto> void create(Produto produto) {
			String sql = "INSERT INTO produtos(nome,categoria, preco) VALUES (?, ?, ?)";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setString(1, ((br.com.materiaisesportivos.model.Produto) produto).getNome());
				p.setString(2, ((br.com.materiaisesportivos.model.Produto) produto).getCategoria());
				p.setFloat(3, ((br.com.materiaisesportivos.model.Produto) produto).getPreco());
				p.execute();
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null) 
						p.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
		}// fim CREATE
		//*****************************************************************************************************************************
		//UPDATE
		public void update(Produto produto) {
			String sql = "UPDATE produtos SET nome = ?, categoria = ?, preco = ? WHERE id = ?" ;
			Connection conn = null;
			PreparedStatement p = null; //link com banco
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setString(1, produto.getNome());
				p.setString(2, produto.getCategoria());
				p.setFloat(3, produto.getPreco());
				p.setInt(4, produto.getId());
				p.execute();//"executa inst para gravar" dados no banco
				JOptionPane.showMessageDialog(null, "dados atualizados com sucesso!");
				System.out.println( "dados atualizados com sucesso!");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null) 
						p.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
				}
		}// fim UPDATE
	//**********************************************************************************************************************************
	//R - READ
		public List<Produto> read() {
			String sql = "SELECT * FROM produtos";
			List<Produto> produtos = new ArrayList<Produto>();
			Connection conn = null;
			PreparedStatement p = null;
			ResultSet resultado = null;
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				resultado = p.executeQuery();//mostra os dados da consulta sql
				while(resultado.next()) {
					Produto ver_produto = new Produto();
					//recuperar ID
					ver_produto.setId(resultado.getInt("id"));
					//recuperar nome
					ver_produto.setNome(resultado.getString("nome"));
					//recuperar categoria
					ver_produto.setCategoria(resultado.getString("categoria"));
					//recuperar preco
					ver_produto.setPreco(resultado.getInt("preco"));
					//adicionar na lista
					produtos.add(ver_produto);
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null) 
						p.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
			}
			return produtos;
		}// fim READ
	//**************************************************************************************************************************
	//D - DELETE
		public boolean delete(int id) {
			String sql = "DELETE FROM produtos WHERE id = ?";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = Conexao.criandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setInt(1, id);
				p.execute();
				JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
				System.out.println("Dados excluidos com sucesso!");
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Erro ao inserir dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null) 
						p.close();
					} catch(Exception e) {
						e.printStackTrace();
					}
			}
			return false;
		}// fim DELETE
}
