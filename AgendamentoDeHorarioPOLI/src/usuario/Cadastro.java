package usuario;

public class Cadastro {
	
	//Quantidade do array definida arbitrariamente apenas para ilustra��o
	private static ComunidadeAcademicaPoli [] user = new ComunidadeAcademicaPoli [10000];

	// M�todo para armazenar o cadastro dos usu�rios em um array e definir a senha
		public static void add(ComunidadeAcademicaPoli cadastro, String senha) {
			for(int counter = 0; counter < user.length; counter++) {
				if (user[counter] == null) {
					user[counter] = cadastro;
					user[counter].setSenha(senha);
					break;
				}
			}
		}
		
		//M�todo para confirmar se usu�rio j� est� cadastrado atrav�s da sua senha e login(cpf)
		public static boolean jaEstaCadastrado(String cpf, String senha) {
			for(int counter = 0; counter < user.length; counter++) {
				if(user[counter] == null)
					break;
				else {
					if(user[counter].getCpf().equals(cpf) && user[counter].getSenha().equals(senha))
						return true;
				}
					
			}
			return false;
		}
		
		//M�todo apenas para acompanhar o funcionamento do c�digo no console
		 public static void mostrar() {
			 System.out.println("Cadastro");
			 for(int counter = 0; counter < user.length; counter++) {
					
					if(user[0] == null) {
						System.out.print("N�o h� cadastro");
						break;
					}
					
					else if (user[counter] != null) {
						System.out.printf("%d: %s", (counter+1), user[counter].getNome());
						System.out.println();
					}
				}
		 }

}
