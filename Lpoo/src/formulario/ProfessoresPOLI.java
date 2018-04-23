package formulario;

public class ProfessoresPOLI {
	
	private Professor [] profPoli = new Professor [100];
	
	public void addProfessor(Professor prof) {
		for(int counter = 0; counter < profPoli.length; counter++) {
			if (profPoli[counter] == null) {
				profPoli[counter] = prof;
				break;
			}
		}
	}
	
	public void mostrarProfessores() {
		System.out.println("nº\tProfessor\tCPF\tCoordenação Responsável");
		for(int counter = 0; counter < profPoli.length; counter++) {
			
			if(profPoli[0] == null) {
				System.out.printf("%nNão há professores cadastrados%n");
				break;
			}
			
			else if (profPoli[counter] == null) 
				break;
			else {
				System.out.printf("%n%d\t%s\t\t%s\t%s%n", (counter + 1), profPoli[counter].getNome(), profPoli[counter].getcpfProf(), profPoli[counter].getCursoCoordenação());
				System.out.println();
			}
			
		}
	}
	
	public Professor getProfessor(int indice) {
		return profPoli[indice];
	}
	

}
