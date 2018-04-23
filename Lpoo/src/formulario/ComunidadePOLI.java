package formulario;

public class ComunidadePOLI {
	
protected Professor [] profPoli = new Professor [100];
protected Aluno [] alunosPoli = new Aluno [100];
	
	// M�todo para armazenar o cadastro de professores
	// Salvar em um arquivo posteriormente
	public void addProfessor(Professor cadastro) {
		for(int counter = 0; counter < profPoli.length; counter++) {
			if (profPoli[counter] == null) {
				profPoli[counter] = cadastro;
				break;
			}
		}
	}
	
	//Apenas para acompanhar o funcionamento do c�digo no console
	public void mostrarProfessores() {
		System.out.println("n�\tProfessor\tCPF\tCoordena��o Respons�vel");
		for(int counter = 0; counter < profPoli.length; counter++) {
			
			if(profPoli[0] == null) {
				System.out.printf("%nN�o h� professores cadastrados%n");
				break;
			}
			
			else if (profPoli[counter] != null) {
				System.out.printf("%n%d\t%s\t\t%s\t%s%n", (counter + 1), profPoli[counter].getNome(), profPoli[counter].getcpfProf(), profPoli[counter].getCursoCoordena��o());
				System.out.println();
			}
		}
	}

	// M�todo para armazenar a lista de espera dos alunos
	//Salvar em um arquivo posteriormente
	public void addAluno(Aluno cadastro) {
		 for(int counter = 0; counter < alunosPoli.length; counter++) {
			 if(alunosPoli[counter] == null) {
				 alunosPoli[counter] = cadastro;
				 break;
			 }
		 }	 
	 }
	
	 
	 //Apenas para acompanhar o funcionamento do c�digo no console
	 public void mostrarAlunos() {
		 System.out.printf("Alunos cadastrados%n");
		 for(int counter = 0; counter < alunosPoli.length; counter++) {
				
				if(alunosPoli[0] == null) {
					System.out.print("N�o h� alunos cadastrados");
					break;
				}
				
				else if (alunosPoli[counter] != null) {
					System.out.printf("%d\t%s%n%n", (counter + 1), alunosPoli[counter].getNome());
					System.out.println();
				}
				
			}
	 }

}
