package usuario;

public class Agendamento {
	
	public static void agendar(Aluno aluno, Professor professorAgendar, int numeroHorario) {
		
		//Se o hor�rio escolhido n�o tiver nenhum aluno agendado, o agendamento ser� conclu�do
		if(professorAgendar.getAlunosAgendados(numeroHorario) == null) {
			professorAgendar.setAlunosAgendados(aluno, numeroHorario);
		}
	}

}
