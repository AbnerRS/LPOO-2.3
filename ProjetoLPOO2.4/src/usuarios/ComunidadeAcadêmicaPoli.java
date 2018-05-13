package usuarios;

public class ComunidadeAcad�micaPoli {
	
	//Atributos da classe
	private String nome;
	private String cpf;
	private String senha;
		
	// Construtor da Classe
	public ComunidadeAcad�micaPoli (String nome, String cpf, String senha) {
			validaCPF(cpf);
			validaSenha(senha);
			this.nome = nome;
			this.cpf = cpf;
			this.senha = senha;
	}
		
	// Setters e Getters da Classe
	public void setNome(String nome) {
		this.nome = nome;
	}
			
	public String getNome() {
		return nome;
	}
		
	public void setCpf(String cpf) {
		validaCPF(cpf);
		this.cpf = cpf;
	}
			
	public String getCpf() {
		return cpf;
	}
	
	public void setSenha(String senha) {
		validaSenha(senha);
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}
	
	//Valida��o de argumentos
	private void validaCPF(String cpf) {
		if(cpf.length() != 11)
			throw new IllegalArgumentException("CPF Inv�lido");
	}
	
	private void validaSenha(String senha) {
		if(senha.length() != 8)
			throw new IllegalArgumentException("Senha deve conter 8 d�gitos");
	}
	
	//Representa��o String da Classe
	public String toString () {
			return String.format("%s: %s%n%s: %s", "Nome", getNome(), "CPF", getCpf());
	}

	
}
