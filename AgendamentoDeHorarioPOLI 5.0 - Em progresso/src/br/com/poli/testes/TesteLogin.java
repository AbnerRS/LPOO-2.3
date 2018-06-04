package br.com.poli.testes;

import br.com.poli.sistema.Cadastro;
import br.com.poli.sistema.Login;
import br.com.poli.usuario.*;

public class TesteLogin {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("George", "07396169437", "Computação", "LF");
		Cadastro.add(aluno1, "12345678");
		Aluno aluno3 = new Aluno("Abner", "12345678985", "Elétrica", "MP");
		Login login1 = new Login(aluno1.getCpf(),aluno1.getSenha());
		Login login2 = new Login(aluno3.getCpf(), aluno3.getSenha());
		
		System.out.println(login1.logar());
		System.out.print(login2.logar());
		
	}

}
