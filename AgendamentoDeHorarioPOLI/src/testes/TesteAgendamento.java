package testes;

import usuario.Agendamento;
import usuario.Aluno;
import usuario.Professor;

public class TesteAgendamento {

	public static void main(String[] args) {
		
		Professor teste = new Professor ("Ivan", "12345878912", "Básico");
		Aluno aluno1 = new Aluno("George", "07396169437", "Computação", "LF");
		Aluno aluno2 = new Aluno("Pedro", "12345678985", "Civil", "MP");
		teste.setTurno("tarde");
		teste.setHorariosDeAtendimento();
		Agendamento.agendar(aluno2, teste, 1);
		Agendamento.agendar(aluno1, teste, 1);
		Agendamento.agendar(aluno1, teste, 4);
		
		System.out.println(teste);
		System.out.print(teste.horariosDisponiveis());
		

	}

}
