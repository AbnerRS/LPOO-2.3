package formulario;

import java.util.Scanner;

public class Agendamento {
	
	private int opcao;
	Scanner in = new Scanner(System.in);
		
	//M�todo para cadastrar os professores os quais os alunos ir�o requerir agendar um hor�rio
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
		
		System.out.println("Coordena��o respons�vel: ");
		String coord = in.next();
		
		profCadastro.setNome(nome);
		profCadastro.setCpf(cpf);
		profCadastro.setCursoCoordena��o(coord);
		
		cadastro.addProfessor(profCadastro);
		cadastro.mostrarProfessores();
		
	}
	
	//M�todo para fazer o agendamento de hor�rio dos alunos
	//Instancias  apenas para teste
	public void agendarAluno() {
		
		ComunidadePOLI agendamento = new ComunidadePOLI();
		Aluno alunoAgendar = new Aluno(null,null,null);
		Professor teste = new Professor(null,null,null); 
		
		teste.setNome("Bruno");
		teste.setCpf("00000000");
		teste.setCursoCoordena��o("computa��o");
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
		System.out.printf("%n%nPara qual professor deseja fazer o agendamento?%n%nEscolha o n�mero relacionado ao professor: %n%n");
		int escolha = in.nextInt();
		
		agendamento.profPoli[escolha - 1].setListaDeEspera(alunoAgendar);
		agendamento.profPoli[escolha - 1].mostraListaDeEspera();
		
	}
	
	//M�todo de Login tempor�rio, implementar gui posteriormente
	public void login() {
	
	    System.out.println("Digite 1 para login de aluno e 2 para login de professor: ");
	    int opcao = in.nextInt();
	    
	    while(opcao != 2 && opcao != 1) {
	    	System.out.print("N�mero incorreto! Digite 1 para aluno ou 2 para professor: ");
	    	opcao = in.nextInt();
	    }
	    	
	    if (opcao == 1)
	    	agendarAluno();
	    else 
	    	cadastroProfessor();
	    	
	}
			 
	
}
