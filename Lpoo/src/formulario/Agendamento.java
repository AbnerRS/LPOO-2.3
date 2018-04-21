package formulario;
import java.util.Date;
import java.util.Scanner;

public class Agendamento {
	
	Scanner in = new Scanner( System.in);
		
	
	public void cadastroProfessor() {
		
	}
	
	public void agendarAluno() {
		.
	}
			
	public void tipoLogin() {
	
	    System.out.println("Digite 1 para login de aluno e 2 para login de professor");
	    int login = in.nextInt();
	}
	
	
	public void fazerLogin() {
		
		
		System.out.println("Digite seu CPF");
        String cpf = in.next();
				 
			 }
	
	public void verificador(int login, String cpf , String cpfAluno, String cpfProf){
	    if(login == 1){
	        cpf.equals(cpfAluno);
	        System.out.println("ok");
	    }
	    else if(login == 2) {
	       cpf.equals(cpfProf);
	    }
	    
	    else {
	    	System.out.println("Opção Inválida. Por favor tente novamente. ");
	    }
	}
			 
	
}
