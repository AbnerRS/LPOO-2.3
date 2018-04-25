package formulario;

public class Aluno extends ComunidadePOLI{

		private String curso;
		private String turma;
	
	public Aluno( String curso, String turma){
		this.turma = turma;
		this.curso = curso;
	}
	
	
	public void setturma(String turma) {
	this.turma = turma;
}
	
	public String getturma() {
	return curso;
}
			
	public void setCurso(String curso) {
		this.curso = curso;
	}
		
	public String getCurso() {
		return curso;
	}
	
	
}