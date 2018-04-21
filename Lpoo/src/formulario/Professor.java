package formulario;

public class Professor extends Agendamento {
	private String nome;
	private String cpfProf = "10421040424";
	private String turmas;

 public Professor( String turmas) {
	 
	
	 this.turmas = turmas;
 }
 public void setNome(String nome) {
		this.nome = nome;	
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpfProf) {
		this.cpfProf = cpfProf;
	}

	public String getcpfProf() {
		return cpfProf;
	} 
 
 public void setTurmas(String turmas) {
	 this.turmas = turmas;
 }
 
 public String getTurmas() {
	 return turmas;
 }
 
 public void setDiasDisponiveis() {
	 
 }
 
 public void setHorariosDisponiveis() {
	 
 }
 
 
}