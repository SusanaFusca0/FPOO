package Atividades_Susana_Fusca;

c

public class TesteHeranca {

	public static void main(String[] args) {
		//scanner
		Scanner entrada = new Scanner(System.in);
		
		//TESTE PROFESSOR
		//instanciando prof
		Professor p1 = new Professor();
		//dados prof
		System.out.println("Escreva os dados do professor");
		System.out.println("Nome:");
		String nomep1 = entrada.next();
		System.out.println("Endereco:");
		String enderecop1 = entrada.next();
		System.out.println("Telefone:");
		int telefonep1 = entrada.nextInt();
		System.out.println("Cpf:");
		int cpfp1 = entrada.nextInt();
		System.out.println("Celular:");
		int celularp1 = entrada.nextInt();
		System.out.println("Nome do curso:");
		String nomeCursop1 = entrada.next();
		System.out.println("Salario:");
		Float salariop1 = entrada.nextFloat();
		
		//TESTE ALUNO
		//instanciando aluno
		Aluno a1 = new Aluno();
		//dados aluno
		System.out.println("Escreva os dados do aluno");
		System.out.println("Nome:");
		String nomea1 = entrada.next();
		System.out.println("Endereco:");
		String enderecoa1 = entrada.next();
		System.out.println("Telefone:");
		int telefonea1 = entrada.nextInt();
		System.out.println("Cpf:");
		int cpfa1 = entrada.nextInt();
		System.out.println("Celular:");
		int celulara1 = entrada.nextInt();
		System.out.println("Curso:");
		String Cursoa1 = entrada.next();
		a1.calcularMedia();
		a1.situacaoFinal();
	}
}
