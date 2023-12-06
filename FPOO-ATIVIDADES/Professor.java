package Atividades_Susana_Fusca;

public class Professor extends Pessoa {
	//atributos
	private String nomeCurso;
	private float salario;
	
	//construtor
	Professor(){
		super();
	}
	Professor(String nome, String endereco, int telefone, int cpf, int celular, String nomeCurso, float salario){
		super.getNome();
		super.getEndereco();
		super.getTelefone();
		super.getCpf();
		super.getCelular();
		this.nomeCurso = nomeCurso;
		this.salario = salario;
	}
		
	//metodos getters e setters
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getSalario() {
		return salario;
	}
}
