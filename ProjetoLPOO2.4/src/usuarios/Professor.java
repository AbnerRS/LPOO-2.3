package usuarios;

public class Professor extends ComunidadeAcad�micaPoli{
	
	//Atributos da classe
	private String cursoCoordenacao;
	private enum turno {Manh�, Tarde};
	private turno escolhido;
	private String [] horario = new String [8];
	
	//Construtor da classe com chamada para construtor da superclasse
	public Professor(String nome, String cpf, String senha, String cursoCoordena��o) {
		super(nome, cpf, senha);
		this.cursoCoordenacao = cursoCoordena��o;
	}
	
	//Setters e Getters da classe
	public void setcursoCoordenacao(String cursoCoordenacao) {
		this.cursoCoordenacao  = cursoCoordenacao;
	}
		
	public String getcursoCoordenacao() {
		return cursoCoordenacao;
	}
	
	//M�todo para o Professor definir o hor�rio de atendimento
		public void setHorarioDeAtendimento() {
			int hora, minuto;
			if(escolhido == turno.Manh�) {
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
		
	//Representa��o em String do hor�rio de atendimento
		public String getHorariodeAtendimento () {
			return String.format("Hor�rios Dispon�veis: %s%n%s%n%s%n%s%n%s%n%s%n%s&n%s", horario[0], horario[1], horario[2], horario[3], horario[4], horario[5], horario[6], horario[7]);
		}

	//Representa��o em String da Classe
	@Override
	public String toString () {
		return String.format("%s%n%s: %s", "Nome", super.toString(), "Coordena��o", getcursoCoordenacao());
	}

}
