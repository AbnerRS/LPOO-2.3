package usuarios;

public class Professor extends ComunidadeAcadêmicaPoli{
	
	//Atributos da classe
	private String cursoCoordenacao;
	
	//Construtor da classe com chamada para construtor da superclasse
	public Professor(String nome, String cpf, String senha, String cursoCoordenação) {
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
	
	//Representação String da Classe
	public String toString () {
		return String.format("%s%n%s: %s", "Nome", super.toString(), "Coordenação", getcursoCoordenacao());
	}

}
