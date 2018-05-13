package usuarios;

public class Professor extends ComunidadeAcad�micaPoli{
	
	//Atributos da classe
	private String cursoCoordenacao;
	
	//Construtor da classe com chamada para construtor da superclasse
	public Professor(String nome, String cpf, String senha, String cursoCoordena��o) {
		super(nome, cpf, senha);
		this.cursoCoordenacao = cursoCoordenacao;
	}
	
	//Setters e Getters da classe
	public void setcursoCoordenacao(String cursoCoordenacao) {
		this.cursoCoordenacao  = cursoCoordenacao;
	}
		
	public String getcursoCoordenacao() {
		return cursoCoordenacao;
	}
	
	//Representa��o String da Classe
	public String toString () {
		return String.format("%s%n%s: %s", "Nome", super.toString(), "Coordena��o", getcursoCoordenacao());
	}

}
