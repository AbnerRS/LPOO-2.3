package formulario;

public class Aluno extends ComunidadePOLI{

	private String nome;
	private String cpfAluno;
	private String curso;
	
	public Aluno(String nome, String cpfAluno, String curso) {
		this.nome = nome;
		this.cpfAluno = cpfAluno;
		this.curso = curso;
	}

	public void setNome(String nome) {
		this.nome = nome;	
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpfAluno) {
		this.cpfAluno = cpfAluno;
	}

	public String getcpfAluno() {
		return cpfAluno;
	} 
			
	public void setCurso(String curso) {
		this.curso = curso;
	}
		
	public String getCurso() {
		return curso;
	}
	
	
}