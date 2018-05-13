package usuarios;

public class Funcion�rio extends ComunidadeAcad�micaPoli {
	
	//Atributos da classe
	private String cargo;
	
	//Construtor da classe com chamada para construtor da superclasse
	public Funcion�rio(String nome, String cpf, String senha, String cargo) {
		super(nome, cpf, senha);
		this.cargo = cargo;
	}

	// Setters e Getters da Classe
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	//Representa��o String da Classe
	@Override
	public String toString() {
		return String.format("%s%n%s: %s", super.toString(), "Cargo", getCargo());
	}
	
}
