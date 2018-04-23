package formulario;

import java.util.Date;

public class Professor extends ComunidadePOLI {
	
	private String nome;
	private String cpfProf;
	private String cursoCoordenação;
	private Aluno[] alunosLista = new Aluno [10];
	
	public Professor(String nome, String cpfProf, String cursoCoordenação) {
		this.nome = nome;
		this.cpfProf = cpfProf;
		this.cursoCoordenação = cursoCoordenação;
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
 
 public void setCursoCoordenação(String cursoCoordenação) {
	 this.cursoCoordenação = cursoCoordenação;
 }
 
 public String getCursoCoordenação() {
	 return cursoCoordenação;
 }
 
 //Método para criar lista de espera de alunos agendados para este professor
 public void setListaDeEspera(Aluno agendado) {
			 for(int count = 0; count < alunosLista.length; count++) {
				 if(alunosLista[count] == null) {
					 alunosLista[count] = agendado;
					 break;
				 }
			 }	 
 }
 
 //Apenas para acompanhar funcionamento do código no console
 public void mostraListaDeEspera() {
	 System.out.printf("Lista de espera %n%n");
	 for(int counter = 0; counter < alunosLista.length; counter++) {
			
			if(alunosLista[0] == null) {
				System.out.print("Não há alunos na lista de espera");
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