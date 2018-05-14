package usuarios;

public class Professor extends ComunidadeAcadêmicaPoli{
	
	//Atributos da classe
	private String cursoCoordenacao;
	private enum turno {Manhã, Tarde};
	private turno escolhido;
	private String [] horario = new String [8];
	
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
	
	//Método para o Professor definir o horário de atendimento
		public void setHorarioDeAtendimento() {
			int hora, minuto;
			if(escolhido == turno.Manhã) {
				hora = 8;
				minuto = 0;
				for(int count = 0; count < horario.length; count++) {
					horario[count] = String.format("%02d:%02d", hora, minuto);
					minuto  = minuto + 30;
					if(minuto == 60) {
						hora += 1;
						minuto = 0;
					}
				}
			}
			if(escolhido == turno.Tarde) {
				hora = 13;
				minuto = 0;
				for(int count = 0; count < horario.length; count++) {
					horario[count] = String.format("%02d:%02d", hora, minuto);
					minuto  = minuto + 30;
					if(minuto == 60) {
						hora += 1;
						minuto = 0;
					}
				}
			}
		}
		
	//Representação em String do horário de atendimento
		public String getHorariodeAtendimento () {
			return String.format("Horários Disponíveis: %s%n%s%n%s%n%s%n%s%n%s%n%s&n%s", horario[0], horario[1], horario[2], horario[3], horario[4], horario[5], horario[6], horario[7]);
		}

	//Representação em String da Classe
	@Override
	public String toString () {
		return String.format("%s%n%s: %s", "Nome", super.toString(), "Coordenação", getcursoCoordenacao());
	}

}
