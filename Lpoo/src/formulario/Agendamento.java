package formulario;

import java.util.Scanner;

public class Agendamento {
	
	private int opcao;
	Scanner in = new Scanner(System.in);
		
	//Método para cadastrar os professores os quais os alunos irão requerir agendar um horário
	//Instancias apenas para teste
	public void cadastroProfessor() {
		ComunidadePOLI cadastro = new ComunidadePOLI();
		Professor profCadastro = new Professor(null, null, null);
		
		System.out.printf("Cadastro de Professor%n%n");
		
		System.out.print("Nome: ");
		String nome = in.next(); 
		in.nextLine();
		
		System.out.print("Cpf: ");  
		String cpf = in.next();
		in.nextLine();
		
		System.out.println("Coordenação responsável: ");
		String coord = in.next();
		
		profCadastro.setNome(nome);
		profCadastro.setCpf(cpf);
		profCadastro.setCursoCoordenação(coord);
		
		cadastro.addProfessor(profCadastro);
		cadastro.mostrarProfessores();
		
	}
	
	//Método para fazer o agendamento de horário dos alunos
	//Instancias  apenas para teste
	public void agendarAluno() {
		
		ComunidadePOLI agendamento = new ComunidadePOLI();
		Aluno alunoAgendar = new Aluno(null,null,null);
		Professor teste = new Professor(null,null,null); 
		
		teste.setNome("Bruno");
		teste.setCpf("00000000");
		teste.setCursoCoordenação("computação");
		agendamento.addProfessor(teste);
		
		System.out.printf("Agendamento de aluno%n%n");
		
		System.out.print("Nome: ");
		String nome = in.next(); 
		in.nextLine();
		
		System.out.print("Cpf: ");  
		String cpf = in.next();
		in.nextLine();
		
		System.out.println("Curso: ");
		String curso = in.next();
		
		alunoAgendar.setNome(nome);
		alunoAgendar.setCpf(cpf);
		alunoAgendar.setCurso(curso);
		agendamento.addAluno(alunoAgendar);
		agendamento.mostrarAlunos();
		
		agendamento.mostrarProfessores();
		System.out.printf("%n%nPara qual professor deseja fazer o agendamento?%n%nEscolha o número relacionado ao professor: %n%n");
		int escolha = in.nextInt();
		
		agendamento.profPoli[escolha - 1].setListaDeEspera(alunoAgendar);
		agendamento.profPoli[escolha - 1].mostraListaDeEspera();
		
	}
	
	//Método de Login temporário, implementar gui posteriormente
	public void login() {
	
	    System.out.println("Digite 1 para login de aluno e 2 para login de professor: ");
	    int opcao = in.nextInt();
	    
	    while(opcao != 2 && opcao != 1) {
	    	System.out.print("Número incorreto! Digite 1 para aluno ou 2 para professor: ");
	    	opcao = in.nextInt();
	    }
	    	
	    if (opcao == 1)
	    	agendarAluno();
	    else 
	    	cadastroProfessor();
	    	
	}
			 
	
}
