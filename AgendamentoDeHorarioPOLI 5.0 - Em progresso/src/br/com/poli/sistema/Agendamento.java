package br.com.poli.sistema;

import br.com.poli.usuario.Aluno;
import br.com.poli.usuario.Professor;

public class Agendamento {
	
	public static void agendar(Aluno aluno, Professor professorAgendar, int numeroHorario) throws Exception {
		
		//Se o hor�rio escolhido n�o tiver nenhum aluno agendado, o agendamento ser� conclu�do
		if(professorAgendar.getAlunosAgendados(numeroHorario) == null) {
			try {
				professorAgendar.setAlunosAgendados(aluno, numeroHorario);
			} catch (IllegalArgumentException e) {
				
				e.printStackTrace();
			}
		}
	}

}
