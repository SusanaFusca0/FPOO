package Atividades_Susana_Fusca;

public class Passageiro {
	//atributos
	private String nome;
	private String sobrenome;
	private String email;
	//construtor
	Passageiro(){
		
	}
	Passageiro(String nome, String sobrenome, String email){
		this.setNome(nome);
		this.setSobrenome(sobrenome);
		this.setEmail(email);
	}
	//getters e setters
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return this.sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
