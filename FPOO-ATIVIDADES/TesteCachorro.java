package Atividades_Susana_Fusca;

public class TesteCachorro {

	public static void main(String[] args) {
		// instanciando objs da class cachorro
		//primeiro
		Cachorro c1 = new Cachorro("Alberto", 15.5f, 'M', 4);
		System.out.println("INFORMACOES DO PRIMEIRO CACHORRO");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Peso: " + c1.getPeso());
		System.out.println("Sexo: " + c1.getSexo());
		System.out.println("Quantidade de patas: " + c1.getQtdPatas());
		c1.latir();
		c1.brincar();
		c1.correr();
		c1.dormir();
		//segundo
		Cachorro c2 = new Cachorro("Constancie", 8.2f, 'F', 4);
		System.out.println("INFORMACOES DO SEGUNDO CACHORRO");
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Peso: " + c2.getPeso());
		System.out.println("Sexo: " + c2.getSexo());
		System.out.println("Quantidade de patas: " + c2.getQtdPatas());
		c2.latir();
		c2.brincar();
		c2.correr();
		c2.dormir();
		//terceiro
		Cachorro c3= new Cachorro("Sebastian", 17.8f, 'F', 4);
		System.out.println("INFORMACOES DO TERCEIRO CACHORRO");
		System.out.println("Nome: " + c3.getNome());
		System.out.println("Peso: " + c3.getPeso());
		System.out.println("Sexo: " + c3.getSexo());
		System.out.println("Quantidade de patas: " + c3.getQtdPatas());
		c3.latir();
		c3.brincar();
		c3.correr();
		c3.dormir();
	}

}
