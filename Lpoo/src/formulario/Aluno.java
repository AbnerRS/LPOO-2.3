package formulario;
import java.util.Scanner;

public class Aluno extends Agendamento{
	private String nome;
	private String cpfAluno = "70293063419";
	private String disciplina;
	private String turma;
	 
	public Aluno (String nome, String cpf ,String disciplina) {
		
		
		this.disciplina = disciplina;
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
	
			
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
		
	public String getTurma() {
		return disciplina;
	}
	
	
	
	
	public void escolhaProfessorAgendar() {
		
	}
	
	public void escolhaDia() {
		
	}
	
	public void escolhaHorario() {
		
	}
	
}