package formulario;

import java.util.Date;

public class Professor extends ComunidadePOLI {
		
	private String cursoCoordenacao;
	private Aluno[] alunosLista = new Aluno [10];
	
	public Professor( String cursoCoordenação) {
		
		this.cursoCoordenacao = cursoCoordenacao;
	}
	
	public void setcursoCoordenacao(String cursoCoordenacao) {
		this.cursoCoordenacao  = cursoCoordenacao;
	}
		
	public String getcursoCoordenacao() {
		return cursoCoordenacao;
	}
	
	public void setalunosLista(String alunosLista) {
		this.alunosLista = alunosLista;
	}
		
	public String getalunosLista() {
		return alunosLista;
	}
	
	


 public void setCursoCoordenacao(String cursoCoordenacao) {
	 this.cursoCoordenacao = cursoCoordenacao;
 }
 
 public String getCursoCoordenacao() {
	 return cursoCoordenacao;
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
				System.out.printf("%d\t%s", (counter + 1), alunosLista[counter].getnome());
				System.out.println();
			}
			
		}
 }
 
 public void setHorariosDisponiveis() {
	 
 }
 
 
}