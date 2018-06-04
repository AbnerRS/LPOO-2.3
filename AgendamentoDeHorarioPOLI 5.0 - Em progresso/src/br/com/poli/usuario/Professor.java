package br.com.poli.usuario;

public class Professor extends ComunidadeAcademicaPoli{
	
	//Atributos da classe
		private String cursoCoordenacao;
		private String turno;
		private String [] horario = new String [8];
		private Aluno [] alunosAgendados = new Aluno [8];
		
		//Construtor da classe com chamada para construtor da superclasse
		public Professor(String nome, String cpf, String senha, String cursoCoordenação) {
			super(nome, cpf, senha);
			this.cursoCoordenacao = cursoCoordenação;
		}
		
		//Setters e Getters da classe
		public void setcursoCoordenacao(String cursoCoordenacao) {
			this.cursoCoordenacao  = cursoCoordenacao;
		}
			
		public String getcursoCoordenacao() {
			return cursoCoordenacao;
		}
		
		public void setTurno(String turno) {
			this.turno = turno;;
		}
		
		public String getTurno() {
			return turno;
		}
		
		public void setAlunosAgendados(Aluno aluno, int numeroHorario) {
			this.alunosAgendados[numeroHorario - 1] = aluno;
		}
		
		public Aluno getAlunosAgendados(int numeroHorario) {
			return alunosAgendados[numeroHorario - 1];
		}
		
		//Método para retornar um horário indicando o seu número no array
		public String getHorarioDeAtendimento(int numeroHorario) {
			return horario[numeroHorario - 1];
		}
		
		//Método para definir os horários de atendimento do professor
			public void setHorariosDeAtendimento() {
				int hora, minuto, hora2, minuto2;
				if(getTurno().equalsIgnoreCase("Manhã")) {
					hora = 8;
					minuto = 0;
					hora2 = 8;
					minuto2 = 30;
					for(int count = 0; count < horario.length; count++) {
						horario[count] = String.format("%02d:%02d - %02d:%02d", hora, minuto, hora2, minuto2);
						minuto += 30;
						minuto2 += 30;
						
						if(minuto2 == 60) {
							hora2 +=1;
							minuto2 = 0;
						}
						
						if(minuto == 60) {
							hora += 1;
							minuto = 0;
						}
					}
				}
				
				if(getTurno().equalsIgnoreCase("Tarde")) {
					hora = 13;
					minuto = 0;
					hora2 = 13;
					minuto2 = 30;
					for(int count = 0; count < horario.length; count++) {
						horario[count] = String.format("%02d:%02d - %02d:%02d", hora, minuto, hora2, minuto2);
						minuto += 30;
						minuto2 += 30;
						
						if(minuto2 == 60) {
							hora2 +=1;
							minuto2 = 0;
						}
						
						if(minuto == 60) {
							hora += 1;
							minuto = 0;
						}
					}
				}
			}
			
		//Lista dos horários disponíveis do professor
			public String horariosDisponiveis () {
				String mensagem1 = "Horários Disponíveis: ";
				String mensagem2 = "";
				for(int counter = 0; counter < alunosAgendados.length; counter++) {
						if(alunosAgendados[counter] == null)
							mensagem2 = String.format(mensagem2 + "%nHorário %s: %s", (counter+1), horario[counter]);	
				}
		
				return mensagem1 + mensagem2;
			}

		//Representação em String da Classe
		@Override
		public String toString () {
			return String.format("%s%n%s: %s", super.toString(), "Coordenação", getcursoCoordenacao());
		}
}
