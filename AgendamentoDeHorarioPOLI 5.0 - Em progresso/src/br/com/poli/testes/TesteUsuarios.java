package br.com.poli.testes;

import br.com.poli.usuario.*;

public class TesteUsuarios {
	
	public static void main (String [] args) throws Exception {
		
		Professor teste = new Professor ("Ivan", "12345878912","12345", "B�sico");
		Aluno teste1 = new Aluno ("George", "07396169437","12345", "Computa��o", "LF");
		Funcionario teste2 = new Funcionario ("Jo�o", "12345678956","12345","office boy");
		
		teste.setTurno("MANH�");
		teste.setHorariosDeAtendimento();
		
		System.out.println(teste1);
		System.out.println();
		System.out.println();
		System.out.println(teste2);
		System.out.println();
		System.out.println();
		System.out.println(teste);
		teste.setAlunosAgendados(teste1, 2); //Hor�rio 2 j� estar� agendado
		System.out.print(teste.horariosDisponiveis());
	}
}
