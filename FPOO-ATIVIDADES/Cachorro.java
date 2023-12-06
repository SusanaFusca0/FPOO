package Atividades_Susana_Fusca;

public class Cachorro {
	//atributos
	private String nome;
	private float peso;
	private char sexo;
	private int QtdPatas;
	//construtor padrao
	Cachorro(){
		
	}
	Cachorro(String nome, float peso, char sexo, int QtdPatas){
		this.nome=nome;
		this.peso=peso;
		this.sexo=sexo;
		this.QtdPatas=QtdPatas;
	}
	//getters e setters
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return this.nome;
	}
	public void setPeso(float peso) {
		this.peso=peso;
	}
	public float getPeso() {
		return this.peso;
	}
	public void setSexo(char sexo) {
		this.sexo=sexo;
	}
	public char getSexo() {
		return this.sexo;
	}
	public void setQtdPatas(int QtdPatas) {
		this.QtdPatas=QtdPatas;
	}
	public int getQtdPatas() {
		return this.QtdPatas;
	}
	//metodos
	public void latir() {
		System.out.println(nome + " esta latindo...");
	}
	public void correr() {
		System.out.println(nome + " esta correndo...");
	}
	public void dormir() {
		System.out.println(nome + " esta dormindo...");
	}
	public void brincar() {
		System.out.println(nome + " esta brincando...");
	}
}
