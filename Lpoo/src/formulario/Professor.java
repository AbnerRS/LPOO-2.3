package formulario;

import java.util.Date;

public class Professor extends ProfessoresPOLI {
	
	private String nome;
	private String cpfProf;
	private String cursoCoordenação;
	private Aluno [] alunosListaDeEspera = new Aluno [100];
	
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
				System.out.print("Não há alunos na lista de espera");
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