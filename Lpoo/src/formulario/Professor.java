package formulario;

import java.util.Date;

public class Professor extends ComunidadePOLI {
	
	private String nome;
	private String cpfProf;
	private String cursoCoordena��o;
	private Aluno[] alunosLista = new Aluno [10];
	
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
 
 //M�todo para criar lista de espera de alunos agendados para este professor
 public void setListaDeEspera(Aluno agendado) {
			 for(int count = 0; count < alunosLista.length; count++) {
				 if(alunosLista[count] == null) {
					 alunosLista[count] = agendado;
					 break;
				 }
			 }	 
 }
 
 //Apenas para acompanhar funcionamento do c�digo no console
 public void mostraListaDeEspera() {
	 System.out.printf("Lista de espera %n%n");
	 for(int counter = 0; counter < alunosLista.length; counter++) {
			
			if(alunosLista[0] == null) {
				System.out.print("N�o h� alunos na lista de espera");
				break;
			}
			
			else if (alunosLista[counter] != null) {
				System.out.printf("%d\t%s", (counter + 1), alunosLista[counter].getNome());
				System.out.println();
			}
			
		}
 }
 
 public void setHorariosDisponiveis() {
	 
 }
 
 
}