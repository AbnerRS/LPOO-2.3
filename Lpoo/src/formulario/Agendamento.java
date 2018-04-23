package formulario;

import java.util.Scanner;

public class Agendamento {
	
	private int opcao;
	Scanner in = new Scanner(System.in);
		
	public void cadastroProfessor() {
		Professor profCadastro = new Professor(null,null,null);
		
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
		
		profCadastro.addProfessor(profCadastro);
		profCadastro.mostrarProfessores();
		profCadastro.setHorariosDisponiveis();
	}
	
	public void agendarAluno() {
		
		Aluno alunoAgendar = new Aluno(null,null,null);
		Professor teste = new Professor(null,null,null);
		teste.setNome("Bruno");
		teste.setCpf("00000000");
		teste.setCursoCoordenação("computação");
		teste.addProfessor(teste);
		
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
		
		teste.mostrarProfessores();
		System.out.printf("%n%nPara qual professor deseja fazer o agendamento?%n%nEscolha o número relacionado ao professor: %n%n");
		int escolha = in.nextInt();
		
		teste.setListaDeEspera(alunoAgendar);
		teste.getListaDeEspera();
	}
			
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
