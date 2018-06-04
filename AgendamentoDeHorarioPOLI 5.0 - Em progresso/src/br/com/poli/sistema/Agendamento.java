package br.com.poli.sistema;

import br.com.poli.usuario.Aluno;
import br.com.poli.usuario.Professor;

public class Agendamento {
	
	public static void agendar(Aluno aluno, Professor professorAgendar, int numeroHorario) {
		
		//Se o horário escolhido não tiver nenhum aluno agendado, o agendamento será concluído
		if(professorAgendar.getAlunosAgendados(numeroHorario) == null) {
			professorAgendar.setAlunosAgendados(aluno, numeroHorario);
		}
	}

}
