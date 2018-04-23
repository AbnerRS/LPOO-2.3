package formulario;

import java.util.Date;

public class Professor extends ProfessoresPOLI {
	
	private String nome;
	private String cpfProf;
	private String cursoCoordena��o;
	private Aluno [] alunosListaDeEspera = new Aluno [100];
	
	public Professor(String nome, String cpfProf, String cursoCoordena��o) {
		this.nome = nome;
		this.cpfProf = cpfProf;
		this.cursoCoordena��o = cursoCoordena��o;
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
 
 public void setCursoCoordena��o(String cursoCoordena��o) {
	 this.cursoCoordena��o = cursoCoordena��o;
 }
 
 public String getCursoCoordena��o() {
	 return cursoCoordena��o;
 }
 
 public void setListaDeEspera(Aluno proxLista) {
	 for(int counter = 0; counter < alunosListaDeEspera.length; counter++) {
		 if(alunosListaDeEspera[counter] == null) {
			 alunosListaDeEspera[counter] = proxLista;
			 break;
		 }
	 }	 
 }
 
 public void getListaDeEspera() {
	 System.out.printf("Lista de espera do professor %s%n%n", nome);
	 for(int counter = 0; counter < alunosListaDeEspera.length; counter++) {
			
			if(alunosListaDeEspera[0] == null) {
				System.out.print("N�o h� alunos na lista de espera");
				break;
			}
			
			else if (alunosListaDeEspera[counter] == null) 
				break;
			else {
				System.out.printf("%d\t%s", (counter + 1), alunosListaDeEspera[counter].getNome());
				System.out.println();
			}
			
		}
 }
 
 public void setHorariosDisponiveis() {
	 
 }
 
 
}