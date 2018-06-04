package br.com.poli.testes;

import br.com.poli.sistema.Cadastro;
import br.com.poli.usuario.*;

//Exemplo de comportamento poliformico
public class TesteCadastro {
	
	public static void main (String [] args) {
		
	
	Aluno aluno1 = new Aluno("George", "07396169437", "Computa��o", "LF");
	Aluno aluno2 = new Aluno("Pedro", "12345678985", "Civil", "MP");
	Aluno aluno3 = new Aluno("Abner", "12345678985", "El�trica", "MP");
	
	Professor prof1 = new Professor ("Ivan", "12345878912", "B�sico");
	Professor prof2 = new Professor ("Bruno", "12345878912", "Computa��o");
	Professor prof3 = new Professor ("Igor", "12345878912", "El�trica");

	Funcionario func1 = new Funcionario ("Jo�o", "12345678956", "office boy");
	Funcionario func2 = new Funcionario ("Paulo", "12345678956","Aux. Adm");
	
	Cadastro.add(aluno1, "12345678");
	Cadastro.add(aluno2,"12345678");
	Cadastro.add(aluno3, "12345678");
	
	Cadastro.add(prof1, "12345678");
	Cadastro.add(prof2, "12345678");
	
	Cadastro.add(func1, "12345678");
	Cadastro.add(func2, "12345678");
	
	Cadastro.mostrar();
	System.out.println();
	
	System.out.println();
	
	if(Cadastro.jaEstaCadastrado(aluno1.getCpf(),aluno1.getSenha()))
		System.out.print("Usu�rio est� Cadastrado");
	else
		System.out.print("Usu�rio n�o est� cadastrado");
	
	System.out.println();
	
	//prof3 n�o foi cadastradado, teste para ver se o metodo est� funcionando adequadamente
	if(Cadastro.jaEstaCadastrado(prof3.getCpf(),prof3.getSenha()))
		System.out.print("Usu�rio est� Cadastrado");
	else
		System.out.print("Usu�rio n�o est� cadastrado");

	
	}	
	
}
