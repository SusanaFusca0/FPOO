package br.com.materiaisesportivos.model;

public class Produto {
	//atributos
		private int id;
		private String nome;
		private String categoria;
		private float preco;
		//construtor
		public Produto() {
			
		}
		//metodos set e get
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getCategoria() {
			return categoria;
		}
		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}
		public float getPreco() {
			return preco;
		}
		public void setPreco(float preco) {
			this.preco = preco;
		}
		
		
}
