package br.com.poli.testes;

import br.com.poli.usuario.*;

public class TesteUsuarios {
	
	public static void main (String [] args) {
		
		Professor teste = new Professor ("Ivan", "12345878912", "Básico");
		Aluno teste1 = new Aluno ("George", "07396169437", "Computação", "LF");
		Funcionario teste2 = new Funcionario ("João", "12345678956","office boy");
		
		teste.setTurno("MANHã");
		teste.setHorariosDeAtendimento();
		
		System.out.println(teste1);
		System.out.println();
		System.out.println();
		System.out.println(teste2);
		System.out.println();
		System.out.println();
		System.out.println(teste);
		teste.setAlunosAgendados(teste1, 2); //Horário 2 já estará agendado
		System.out.print(teste.horariosDisponiveis());
	}
}
